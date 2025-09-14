import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class LandingPage extends JFrame {
    private JComboBox<String> comboJurusan;
    private List<Angkot> data;

    // Warna palet seperti di desain
    private final Color BG_COLOR = new Color(179, 205, 227); // biru muda
    private final Color TEXT_COLOR = new Color(25, 25, 80);  // biru tua

    public LandingPage(List<Angkot> data) {
        this.data = data;

        setTitle("Angkotin Malang");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(BG_COLOR);

        // HEADER
        JLabel title = new JLabel("SELAMAT DATANG DI ANGKOTIN AJA", JLabel.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 50));
        title.setForeground(TEXT_COLOR);
        title.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
        add(title, BorderLayout.NORTH);

        // CENTER: Grid dua kolom (gambar di kiri, teks di kanan)
        JPanel centerPanel = new JPanel(new GridLayout(1, 2, 40, 10));
        centerPanel.setBackground(BG_COLOR);
        centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        // kiri: gambar peta
        ImageIcon icon = new ImageIcon("C:/git/AngkotAPP/AngkotAPP/img/Illustration.png");
        Image img = icon.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH); // resize
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        imgLabel.setHorizontalAlignment(JLabel.CENTER);
        centerPanel.add(imgLabel);

        // kanan: teks + dropdown + tombol
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(BG_COLOR);

        // geser deskripsi agak ke bawah
        rightPanel.add(Box.createRigidArea(new Dimension(0, 120)));

        JLabel desc = new JLabel("<html><div style='text-align:center;'>Temukan jurusan angkot di Malang<br>dengan mudah dan cepat!</div></html>", JLabel.CENTER);
        desc.setFont(new Font("Segoe UI", Font.BOLD, 30));
        desc.setForeground(TEXT_COLOR);
        desc.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Dropdown jurusan
        JLabel pilihLabel = new JLabel("Pilih Jurusan Angkot:");
        pilihLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        pilihLabel.setForeground(TEXT_COLOR);
        pilihLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        comboJurusan = new JComboBox<>();
        comboJurusan.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        for (Angkot a : data) {
            comboJurusan.addItem(a.getJurusan());
        }
        comboJurusan.setMaximumSize(new Dimension(300, 40));
        comboJurusan.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Tombol lihat jalur
        JButton btnLihat = new JButton("Lihat Jalur");
        btnLihat.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnLihat.setBackground(TEXT_COLOR);
        btnLihat.setForeground(Color.WHITE);
        btnLihat.setFocusPainted(false);
        btnLihat.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnLihat.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnLihat.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnLihat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String jurusan = (String) comboJurusan.getSelectedItem();
                for (Angkot a : data) {
                    if (a.getJurusan().equals(jurusan)) {
                        new RutePage(a).setVisible(true);
                        dispose();
                        break;
                    }
                }
            }
        });

        // susun isi kanan
        rightPanel.add(desc);
        // tambahin jarak lebih besar supaya bagian jurusan + tombol lebih turun
        rightPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        rightPanel.add(pilihLabel);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        rightPanel.add(comboJurusan);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 40)));
        rightPanel.add(btnLihat);

        centerPanel.add(rightPanel);
        add(centerPanel, BorderLayout.CENTER);

        // FOOTER
        JLabel footer = new JLabel("© 2025 Angkotin Malang", JLabel.CENTER);
        footer.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        footer.setForeground(TEXT_COLOR);
        footer.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        add(footer, BorderLayout.SOUTH);
    }
}

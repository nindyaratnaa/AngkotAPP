import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class LandingPage extends JFrame {
    private JComboBox<String> comboJurusan;
    private List<Angkot> data;

    public LandingPage(List<Angkot> data) {
        this.data = data;

        setTitle("Aplikasi Angkot Malang");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel welcome = new JLabel("Selamat Datang di Aplikasi Angkot Malang", JLabel.CENTER);
        welcome.setFont(new Font("Arial", Font.BOLD, 16));
        add(welcome, BorderLayout.NORTH);

        // dropdown jurusan
        comboJurusan = new JComboBox<>();
        for (Angkot a : data) {
            comboJurusan.addItem(a.getJurusan());
        }

        JButton btnLihat = new JButton("Lihat Jalur");
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

        JPanel center = new JPanel(new GridLayout(3,1));
        center.add(new JLabel("Pilih Jurusan Angkot:", JLabel.CENTER));
        center.add(comboJurusan);
        center.add(btnLihat);
        add(center, BorderLayout.CENTER);

        // ilustrasi
        JLabel imgLabel = new JLabel(new ImageIcon("img/angkot.png")); // bisa custom
        add(imgLabel, BorderLayout.SOUTH);
    }
}

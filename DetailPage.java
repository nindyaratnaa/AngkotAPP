import javax.swing.*;
import java.awt.*;

public class DetailPage extends JFrame {
    private Angkot angkot;

    public DetailPage(Angkot angkot) {
        this.angkot = angkot;

        setTitle("Detail " + angkot.getJurusan());
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Header dengan background gradien dan ikon
        JPanel headerPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color start = new Color(0x2980B9);
                Color end = new Color(0x6DD5FA);
                GradientPaint gp = new GradientPaint(0, 0, start, 0, getHeight(), end);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        headerPanel.setLayout(new BorderLayout());
        JLabel header = new JLabel("🚌 Detail Jalur: " + angkot.getJurusan(), JLabel.CENTER);
        header.setFont(new Font("SansSerif", Font.BOLD, 28));
        header.setForeground(Color.WHITE);
        headerPanel.setPreferredSize(new Dimension(0, 100));
        headerPanel.add(header, BorderLayout.CENTER);
        add(headerPanel, BorderLayout.NORTH);

        // Panel tengah dengan border radius dan scroll yang lebih sleek
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        centerPanel.setBackground(new Color(0xECF0F1));

        TimelinePanel timeline = new TimelinePanel(angkot.getPemberhentianList());
        timeline.setBackground(new Color(0xFDFEFE));
        timeline.setForeground(new Color(0x2C3E50));

        JScrollPane scroll = new JScrollPane(timeline);
        scroll.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(0x3498DB), 2),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        centerPanel.add(scroll, BorderLayout.CENTER);
        add(centerPanel, BorderLayout.CENTER);

        // Panel bawah dengan tombol stylish dan hover effect
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(0xD6EAF8));
        JButton btnBack = new JButton("⬅ Kembali");
        btnBack.setFont(new Font("SansSerif", Font.BOLD, 16));
        btnBack.setBackground(new Color(0x2980B9));
        btnBack.setForeground(Color.WHITE);
        btnBack.setFocusPainted(false);
        btnBack.setPreferredSize(new Dimension(150, 45));
        btnBack.setBorder(BorderFactory.createEmptyBorder());
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBack.setBackground(new Color(0x1B4F72));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBack.setBackground(new Color(0x2980B9));
            }
        });
        btnBack.addActionListener(e -> {
            new RutePage(angkot).setVisible(true);
            dispose();
        });
        bottomPanel.add(btnBack);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}

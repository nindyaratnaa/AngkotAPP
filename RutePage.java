import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RutePage extends JFrame {
    private Angkot angkot;

    public RutePage(Angkot angkot) {
        this.angkot = angkot;

        setTitle("Rute " + angkot.getJurusan());
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Color BG_COLOR = new Color(230, 240, 250); // biru muda lembut
        Color CARD_COLOR = new Color(255, 255, 255);
        Color TEXT_COLOR = new Color(25, 25, 80); 

        getContentPane().setBackground(BG_COLOR);

        // HEADER
        JLabel header = new JLabel("Rute Angkot: " + angkot.getJurusan(), JLabel.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 40));
        header.setForeground(TEXT_COLOR);
        header.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
        add(header, BorderLayout.NORTH);

        // PANEL SCROLL isi rute
        JPanel rutePanel = new JPanel();
        rutePanel.setLayout(new BoxLayout(rutePanel, BoxLayout.Y_AXIS));
        rutePanel.setBackground(BG_COLOR);

        rutePanel.setBorder(BorderFactory.createEmptyBorder(110, 0, 0, 0));

        List<Pemberhentian> stops = angkot.getPemberhentianList();
        for (int i = 0; i < stops.size(); i++) {
            // kotak untuk tiap pemberhentian
            JPanel card = new JPanel();
            card.setBackground(CARD_COLOR);
            card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 200, 230), 1, true),
                BorderFactory.createEmptyBorder(15, 20, 15, 20)
            ));
            card.setMaximumSize(new Dimension(800, 80));
            card.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel stopLabel = new JLabel(stops.get(i).getNamaLokasi(), JLabel.CENTER);
            stopLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            stopLabel.setForeground(TEXT_COLOR);
            card.add(stopLabel);

            rutePanel.add(card);

            // tambahkan panah antar pemberhentian
            if (i < stops.size() - 1) {
                JLabel arrow = new JLabel("↓", JLabel.CENTER);
                arrow.setFont(new Font("Segoe UI", Font.BOLD, 28));
                arrow.setForeground(new Color(100, 100, 150));
                arrow.setAlignmentX(Component.CENTER_ALIGNMENT);
                rutePanel.add(arrow);
            }

            rutePanel.add(Box.createRigidArea(new Dimension(0, 15)));
        }

        JScrollPane scrollPane = new JScrollPane(rutePanel);
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane, BorderLayout.CENTER);

        // FOOTER tombol
        JPanel footer = new JPanel();
        footer.setBackground(BG_COLOR);
        JButton btnDetail = new JButton("Lihat Detail");
        btnDetail.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnDetail.setBackground(TEXT_COLOR);
        btnDetail.setForeground(Color.WHITE);
        btnDetail.setFocusPainted(false);
        btnDetail.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnDetail.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDetail.setBackground(new Color(25, 25, 80));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDetail.setBackground(new Color(0x2980B9));
            }
        });

        btnDetail.addActionListener(e -> {
            new DetailPage(angkot).setVisible(true);
            dispose();
        });

        footer.add(btnDetail);
        add(footer, BorderLayout.SOUTH);
    }
}

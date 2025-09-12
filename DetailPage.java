import javax.swing.*;
import java.awt.*;

public class DetailPage extends JFrame {
    private Angkot angkot;

    public DetailPage(Angkot angkot) {
        this.angkot = angkot;

        setTitle("Detail " + angkot.getJurusan());
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel header = new JLabel("Detail Jalur: " + angkot.getJurusan(), JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 16));
        add(header, BorderLayout.NORTH);

        // timeline panel
        TimelinePanel timeline = new TimelinePanel(angkot.getPemberhentianList());
        JScrollPane scroll = new JScrollPane(timeline);
        add(scroll, BorderLayout.CENTER);

        JButton btnBack = new JButton("Kembali");
        btnBack.addActionListener(e -> {
            new RutePage(angkot).setVisible(true);
            dispose();
        });
        add(btnBack, BorderLayout.SOUTH);
    }
}
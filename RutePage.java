import javax.swing.*;
import java.awt.*;

public class RutePage extends JFrame {
    private Angkot angkot;

    public RutePage(Angkot angkot) {
        this.angkot = angkot;

        setTitle("Rute " + angkot.getJurusan());
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // gabungkan jalur menjadi string
        StringBuilder ruteStr = new StringBuilder();
        for (int i = 0; i < angkot.getPemberhentianList().size(); i++) {
            ruteStr.append(angkot.getPemberhentianList().get(i).getNamaLokasi());
            if (i < angkot.getPemberhentianList().size() - 1) {
                ruteStr.append(" - ");
            }
        }

        JLabel labelRute = new JLabel(ruteStr.toString(), JLabel.CENTER);
        labelRute.setFont(new Font("Arial", Font.BOLD, 14));
        add(labelRute, BorderLayout.CENTER);

        JButton btnDetail = new JButton("Lihat Detail");
        btnDetail.addActionListener(e -> {
            new DetailPage(angkot).setVisible(true);
            dispose();
        });

        add(btnDetail, BorderLayout.SOUTH);
    }
}

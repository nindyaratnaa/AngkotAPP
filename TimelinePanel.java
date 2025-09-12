import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TimelinePanel extends JPanel {
    private List<Pemberhentian> pemberhentianList;

    public TimelinePanel(List<Pemberhentian> pemberhentianList) {
        this.pemberhentianList = pemberhentianList;
        setPreferredSize(new Dimension(400, pemberhentianList.size() * 80));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int startX = 50; // posisi garis timeline
        int y = 40;      // posisi awal

        // gambar garis vertikal
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(startX, y, startX, y + (pemberhentianList.size() - 1) * 80);

        // gambar tiap node
        for (int i = 0; i < pemberhentianList.size(); i++) {
            Pemberhentian p = pemberhentianList.get(i);

            int circleY = y + i * 80;

            // lingkaran
            g2.setColor(Color.WHITE);
            g2.fillOval(startX - 8, circleY - 8, 16, 16);
            g2.setColor(Color.BLUE);
            g2.drawOval(startX - 8, circleY - 8, 16, 16);

            // teks nama lokasi (kiri timeline)
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("Arial", Font.PLAIN, 14));
            g2.drawString(p.getNamaLokasi(), startX + 30, circleY + 5);

            // teks jam (kanan timeline)
            g2.setFont(new Font("Arial", Font.BOLD, 12));
            g2.drawString(p.getJamLewat(), startX + 220, circleY + 5);
        }
    }
}
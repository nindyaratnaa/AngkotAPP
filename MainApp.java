import javax.swing.*;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            List<Angkot> data = DataProvider.getData();
            new LandingPage(data).setVisible(true);
        });
    }
}

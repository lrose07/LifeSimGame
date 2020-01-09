import javax.swing.*;
import java.awt.*;

class ParentFrame {
    ParentFrame() {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(500, 800));
        frame.setMinimumSize(new Dimension(500, 800));

        JPanel navPanel = new NavigationView();
        JPanel mainPanel = new MainScreenView();

        frame.add(navPanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

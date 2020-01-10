import javax.swing.*;
import java.awt.*;

class NavigationView extends JPanel {
    NavigationView() {
        setLayout(new GridLayout(3, 3));

        add(new NavButton("test"));
    }
}

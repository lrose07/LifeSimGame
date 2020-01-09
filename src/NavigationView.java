import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class NavigationView extends JPanel {
    NavigationView() {
        setLayout(new GridLayout(3, 3));

        add(new Button("test"));
    }
}

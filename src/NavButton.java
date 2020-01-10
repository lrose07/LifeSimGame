import javax.swing.*;

class NavButton extends JButton {
    NavButton(String text) {
        super();
        this.setText(text);
        this.addActionListener(e -> buttonClicked());
    }

    private void buttonClicked() {
        System.out.println(this.getText() + " clicked");
    }
}

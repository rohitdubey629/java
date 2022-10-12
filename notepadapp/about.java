package notepadapp;

import javax.swing.*;

public class about extends JFrame {

    about() {
        setBounds(100, 100, 500, 400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon icon = new ImageIcon(getClass().getResource("notepad-icon.png"));
        setIconImage(icon.getImage());

        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("notepad-icon.png")));
        iconLabel.setBounds(100, 50, 80, 80);
        add(iconLabel);

        JLabel textJLabel = new JLabel(
                "<html>Notepad – text editor <br>ready to help users create and edit documents at any time. Anyone often needs an <br>application to replace Office Word for PC on a mobile ...</html>");
        textJLabel.setBounds(80, 50, 400, 300);
        add(textJLabel);

    }

    public static void main(String[] args) {
        new about().setVisible(true);
    }
}

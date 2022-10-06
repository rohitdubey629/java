import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;

public class radioButton {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(100, 100, 700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JRadioButton radio1 = new JRadioButton("Male");
        radio1.setBounds(100, 50, 100, 20);
        c.add(radio1);
        radio1.setSelected(true);

        JRadioButton radio2 = new JRadioButton("Female");
        radio2.setBounds(200, 50, 100, 20);
        c.add(radio2);

        Font font = new Font("arial", Font.BOLD, 16);
        radio1.setFont(font);
        radio2.setFont(font);

        ButtonGroup gender = new ButtonGroup();
        gender.add(radio1);
        gender.add(radio2);

        JRadioButton gen = new JRadioButton("General");
        JRadioButton obc = new JRadioButton("OBC");
        JRadioButton sc = new JRadioButton("SC");
        JRadioButton st = new JRadioButton("ST");

        gen.setBounds(100, 100, 100, 20);
        obc.setBounds(200, 100, 100, 20);
        sc.setBounds(300, 100, 100, 20);
        st.setBounds(400, 100, 100, 20);

        c.add(gen);
        c.add(obc);
        c.add(sc);
        c.add(st);

        ButtonGroup cast = new ButtonGroup();
        cast.add(gen);
        cast.add(obc);
        cast.add(sc);
        cast.add(st);

        obc.setEnabled(false);
        gen.setSelected(true);

        f.setVisible(true);
    }
}

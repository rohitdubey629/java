
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class loginSigninForm extends JFrame implements ActionListener {
    JFrame frm, frm1;
    JLabel l1, l2, l3, title, img1, img, img3;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3;
    Font f;
    JPanel p1, p2, p3;
    JComboBox ch;
    // sign In
    JFrame sfrm;
    JLabel sl1, sl2, sl3, stitle;
    JTextField st1;
    JPasswordField st2, st3;
    JButton sb1, sb2;
    Font sf;
    JPanel sp1, sp2, sp3;
    String su, sp, spc;

    loginSigninForm() {
        frm = new JFrame("Login Here");
        frm.setSize(650, 340);
        // frm.setVisible(true);
        frm.setLocationRelativeTo(null);// set in center
        frm.setLayout(new FlowLayout()); // creat font stayle size
        f = new Font("roboto", Font.BOLD, 28);
        title = new JLabel("Login Window");
        title.setFont(f);

        String s1[] = { "Select Your Choice", "Student a/c", "Business a/c", "Blog a/c", "Personal a/c" };
        ch = new JComboBox(s1);

        // Image icon=Toolkit.getDefaultToolkit().getImage("user.png");
        // img = new JLabel(new ImageIcon("userUpdate1.png"));
        // img1 = new JLabel(new ImageIcon("passwordUpdate.png"));
        // img3 = new JLabel(new ImageIcon("userUpdate1.png"));

        p1 = new JPanel(new FlowLayout());
        p2 = new JPanel(new GridLayout(3, 2));
        p3 = new JPanel(new FlowLayout());

        l1 = new JLabel("Enter UserName:");
        l2 = new JLabel("Enter Password:");
        l3 = new JLabel("Enter Choice:");
        // l2.setLocation(0, 0);
        // l1.setBounds(100, 100, size.width, size.height);

        title.setIcon(new ImageIcon("loginIcon.png"));
        l1.setIcon(new ImageIcon("userUpdate1.png"));
        l3.setIcon(new ImageIcon("choice1.png"));
        l2.setIcon(new ImageIcon("passwordUpdate.png"));

        // Add Font size color
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);

        t1 = new JTextField(20);
        t2 = new JPasswordField(20);
        t2.setEchoChar('#');
        b1 = new JButton("Login");
        b2 = new JButton("Cancel");
        b3 = new JButton("Sign up");

        p1.add(title);
        p2.add(l1);
        p2.add(t1);
        p2.add(l2);
        p2.add(t2);
        p2.add(l3);
        p2.add(ch);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p1.setBackground(Color.PINK);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.RED);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(p1, BorderLayout.NORTH);
        frm.add(p2, BorderLayout.CENTER);
        frm.add(p3, BorderLayout.SOUTH);
        frm.getContentPane().setBackground(Color.CYAN); // change background color

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        frm.setVisible(true);

        // sign In Form Structure start

        sfrm = new JFrame("Sign In");
        sfrm.setSize(650, 340);
        sfrm.setVisible(false);
        sfrm.setLocationRelativeTo(null);// set in center
        sfrm.setLayout(new FlowLayout()); // creat font stayle size
        sf = new Font("roboto", Font.BOLD, 28);
        stitle = new JLabel("Login Window");
        stitle.setFont(f);

        sp1 = new JPanel(new FlowLayout());
        sp2 = new JPanel(new GridLayout(3, 2));
        sp3 = new JPanel(new FlowLayout());

        sl1 = new JLabel("Enter UserName:");
        sl2 = new JLabel("Enter Password:");
        sl3 = new JLabel("Confirm Password:");

        stitle.setIcon(new ImageIcon("loginIcon.png"));
        sl1.setIcon(new ImageIcon("userUpdate1.png"));
        sl3.setIcon(new ImageIcon("choice1.png"));
        sl2.setIcon(new ImageIcon("passwordUpdate.png"));

        // Add Font size color
        sl1.setFont(sf);
        sl2.setFont(sf);
        sl3.setFont(sf);

        st1 = new JTextField(20);
        st2 = new JPasswordField(20);
        st3 = new JPasswordField(20);

        st2.setEchoChar('#');
        st3.setEchoChar('#');

        sb1 = new JButton("Sign up");
        sb2 = new JButton("Cancel");

        sp1.add(stitle);
        sp2.add(sl1);
        sp2.add(st1);
        sp2.add(sl2);
        sp2.add(st2);
        sp2.add(sl3);
        sp2.add(st3);
        sp3.add(sb1);
        sp3.add(sb2);
        sp1.setBackground(Color.PINK);
        sp2.setBackground(Color.WHITE);
        sp3.setBackground(Color.RED);
        sfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sfrm.add(sp1, BorderLayout.NORTH);
        sfrm.add(sp2, BorderLayout.CENTER);
        sfrm.add(sp3, BorderLayout.SOUTH);
        sfrm.getContentPane().setBackground(Color.WHITE); // change background color

        sb1.addActionListener(this);
        sb2.addActionListener(this);

        // end

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String u = t1.getText();
            String p = t2.getText();
            if (u.equalsIgnoreCase(su) && p.equals(sp)) {

                // file Write user name password
                // start
                try {
                    FileOutputStream fa = new FileOutputStream("myFile.txt", true);
                    int i;
                    String s = "";
                    s = s + u + "\n" + p + "\n";

                    char ch[] = s.toCharArray();

                    for (i = 0; i < s.length(); i++) {
                        fa.write(ch[i]);
                    }
                    System.out.println(s);
                    fa.close();

                } catch (Exception f) {
                    System.out.println(f);
                }

                // end

                JOptionPane.showMessageDialog(frm, "Login SuccessFully !!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(frm, "Sorry!UsertName or password Not Match!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                t1.setText("");
                t2.setText("");
            }
        }

        if (e.getSource() == b2) {
            int x = JOptionPane.showConfirmDialog(frm, "Are You Sure To Exit??");
            if (x == 0)
                System.exit(0);
        }
        if (e.getSource() == b3) {

            sfrm.setVisible(true);
        }
        if (e.getSource() == sb1) {
            su = st1.getText();
            sp = st2.getText();
            spc = st3.getText();

            if (sp.equals(spc) && spc.equals(sp)) {

                // file Write user name password
                // start
                try {
                    FileOutputStream fa = new FileOutputStream("myFile.txt", true);
                    int i;
                    String ss = "";
                    ss = ss + su + "\n" + sp + "\n";

                    char ch[] = ss.toCharArray();

                    for (i = 0; i < ss.length(); i++) {
                        fa.write(ch[i]);
                    }
                    System.out.println(ss);
                    fa.close();

                } catch (Exception f) {
                    System.out.println(f);
                }

                // end
                JOptionPane.showMessageDialog(frm, "Sign up Confirm", "Sign up Form",
                        JOptionPane.INFORMATION_MESSAGE);
                st1.setText("");
                st2.setText("");
                st3.setText("");

            } else {
                JOptionPane.showMessageDialog(frm, "Confirmation Password is Wrong pls try again ", "Sign up Form",
                        JOptionPane.INFORMATION_MESSAGE);
                st1.setText("");
                st2.setText("");
                st3.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(frm, "Check", "Sign up Form",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static void main(String args[]) throws IOException {
        loginSigninForm login = new loginSigninForm();

    }
}

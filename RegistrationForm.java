import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame1 extends JFrame implements ActionListener {

    JLabel label1, label2, label3, label4, label5;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox day, month, year;
    JTextArea ta1;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    JTextArea screen;

    myFrame1() {
        setTitle("Registration Form");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Name");
        label1.setBounds(20, 50, 100, 20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(130, 50, 100, 20);
        c.add(t1);

        label2 = new JLabel("Mobile");
        label2.setBounds(20, 100, 100, 20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(130, 100, 100, 20);
        c.add(t2);

        label3 = new JLabel("Gender");
        label3.setBounds(20, 150, 100, 20);
        c.add(label3);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(130, 150, 80, 20);
        female.setBounds(220, 150, 80, 20);

        c.add(male);
        c.add(female);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        label4 = new JLabel("DOB");
        label4.setBounds(20, 200, 100, 20);
        c.add(label4);

        String days[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
        String months[] = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
        String years[] = { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012",
                "2011", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "1999", "1998", "1997",
                "1996", "1995", "1994", "1993", "1992", "1991" };

        day = new JComboBox(days);
        month = new JComboBox(months);
        year = new JComboBox(years);

        day.setBounds(130, 200, 50, 20);
        month.setBounds(190, 200, 50, 20);
        year.setBounds(250, 200, 60, 20);

        c.add(day);
        c.add(month);
        c.add(year);

        label5 = new JLabel("Address");
        label5.setBounds(20, 250, 100, 20);
        c.add(label5);

        ta1 = new JTextArea();
        ta1.setBounds(130, 240, 200, 50);
        c.add(ta1);

        terms = new JCheckBox("please acceot terms and conditionms");
        terms.setBounds(50, 300, 250, 20);
        c.add(terms);

        submit = new JButton("submit");
        submit.setBounds(150, 350, 80, 20);
        c.add(submit);

        submit.addActionListener(this);

        screen = new JTextArea();
        screen.setBounds(350, 50, 300, 300);
        c.add(screen);

        msg = new JLabel("");
        msg.setBounds(20, 400, 250, 20);
        c.add(msg);
        c.setBackground(Color.YELLOW);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (terms.isSelected()) {
            msg.setText("Registration Successfull!!");
            String name = t1.getText();
            String mobile = t2.getText();
            String gender = "male";
            if (female.isSelected()) {
                gender = "female";
            }
            String dob = day.getSelectedItem() + "-" + month.getSelectedItem() + "-" + year.getSelectedItem();
            String address = ta1.getText();

            screen.setText("Name : " + name + "\n" + "Mobile : " + mobile + "\n" + "Gender : " + gender + "\n"
                    + "DOB : " + dob + "\n" + "Address : " + address);
        } else {
            msg.setText("accept terms and condition to submit");

            screen.setText("");
        }
    }
}

public class RegistrationForm {
    public static void main(String[] args) {
        myFrame1 Frame = new myFrame1();
    }
}

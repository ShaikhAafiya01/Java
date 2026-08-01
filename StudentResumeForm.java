import javax.swing.*;
import java.awt.event.*;

public class StudentResumeForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Resume Form");
        frame.setSize(500, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Name
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 20, 100, 25);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 20, 250, 25);
        frame.add(t1);

        // Roll No
        JLabel l2 = new JLabel("Roll No:");
        l2.setBounds(30, 60, 100, 25);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 60, 250, 25);
        frame.add(t2);

        // Email
        JLabel l3 = new JLabel("Email:");
        l3.setBounds(30, 100, 100, 25);
        frame.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(150, 100, 250, 25);
        frame.add(t3);

        // Gender
        JLabel l4 = new JLabel("Gender:");
        l4.setBounds(30, 140, 100, 25);
        frame.add(l4);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 140, 80, 25);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(240, 140, 100, 25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        frame.add(male);
        frame.add(female);

        // Course
        JLabel l5 = new JLabel("Course:");
        l5.setBounds(30, 180, 100, 25);
        frame.add(l5);

        String courses[] = {"BCA", "BSc", "BTech", "MCA", "MSc"};
        JComboBox<String> cb = new JComboBox<>(courses);
        cb.setBounds(150, 180, 150, 25);
        frame.add(cb);

        // Skills
        JLabel l6 = new JLabel("Skills:");
        l6.setBounds(30, 220, 100, 25);
        frame.add(l6);

        JCheckBox c1 = new JCheckBox("Java");
        c1.setBounds(150, 220, 80, 25);

        JCheckBox c2 = new JCheckBox("Python");
        c2.setBounds(240, 220, 80, 25);

        JCheckBox c3 = new JCheckBox("C++");
        c3.setBounds(330, 220, 80, 25);

        frame.add(c1);
        frame.add(c2);
        frame.add(c3);

        // Address
        JLabel l7 = new JLabel("Address:");
        l7.setBounds(30, 270, 100, 25);
        frame.add(l7);

        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(150, 270, 250, 80);
        frame.add(sp);

        // Career Objective
        JLabel l8 = new JLabel("Career Objective:");
        l8.setBounds(30, 370, 120, 25);
        frame.add(l8);

        JTextArea ta2 = new JTextArea();
        JScrollPane sp2 = new JScrollPane(ta2);
        sp2.setBounds(150, 370, 250, 80);
        frame.add(sp2);

        // Buttons
        JButton submit = new JButton("Submit");
        submit.setBounds(120, 500, 100, 30);
        frame.add(submit);

        JButton reset = new JButton("Reset");
        reset.setBounds(250, 500, 100, 30);
        frame.add(reset);

        // Submit Button Action
        submit.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame,
                    "Resume Submitted Successfully!");
        });

        // Reset Button Action
        reset.addActionListener((ActionEvent e) -> {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            ta.setText("");
            ta2.setText("");
            bg.clearSelection();
            cb.setSelectedIndex(0);
            c1.setSelected(false);
            c2.setSelected(false);
            c3.setSelected(false);
        });

        frame.setVisible(true);
    }
}
    


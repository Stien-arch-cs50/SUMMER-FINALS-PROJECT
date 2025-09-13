package Frame;
import java.awt.*;
import java.awt.event.*;
import java.lang.*; //package for font & coloring
import javax.swing.*; //package for GUI components

public class FrameSalaami extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel totalLabel,label3;
    private int totalSalaami = 0;
    private ImageIcon bkImg1, bkImg2;
    private JPanel panel;
    private JComboBox cb1;
    private JComboBox cb2;
    private Color c1;
    private JRadioButton rb1, rb2;

    public FrameSalaami() {
        super.setTitle("✨ Eid Salaami Calculator");
        super.setBounds(512, 100, 750, 750);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        c1 = new Color(198, 199, 186);
         panel.setBackground(c1);

        JLabel promptLabel = new JLabel("Enter Salaami Account(Name):");
        promptLabel.setBounds(10, -38, 200, 200);
        panel.add(promptLabel);
        inputField = new JTextField();
        inputField.setBounds(195, 50, 120,30);
        panel.add(inputField);

        label3 = new JLabel("Your Name:");
		label3.setBounds(20, -50, 120,100);
        panel.add(label3);

        JButton addButton = new JButton("Add");
        JButton resetButton = new JButton("Reset");
        totalLabel = new JLabel("Total Salaami: ৳0");

        addButton.addActionListener(this);
        resetButton.addActionListener(e -> {
            totalSalaami = 0;
            totalLabel.setText("Total Salaami: ৳0");
        });

        add(promptLabel);
        add(inputField);
        add(addButton);
        add(resetButton);
        add(totalLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int amount = Integer.parseInt(inputField.getText());
            totalSalaami += amount;
            totalLabel.setText("Total Salaami: ৳" + totalSalaami);
            inputField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }

}
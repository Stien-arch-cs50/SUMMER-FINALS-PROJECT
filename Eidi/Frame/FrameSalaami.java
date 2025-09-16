package Frame;
import Entity.Salami;
import java.awt.event.*;
import javax.swing.*;

public class FrameSalaami extends JFrame  {
    private JTextField nameField, relationField, festivalField, amountField;
    private JLabel totalLabel;
    private Salami salami;

    public FrameSalaami() {
        salami = new Salami("", "", "",  0, 0);
        ImageIcon logo;
        logo = new ImageIcon("Picture/icon.jpg");

        setTitle("Eidi calculator");
        //setSize(400, 350);
        setBounds(512, 100, 750, 750);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(logo.getImage());
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(140, 30, 200, 25);
        add(nameField);

        JLabel relationLabel = new JLabel("Relation:");
        relationLabel.setBounds(30, 70, 100, 25);
        add(relationLabel);

        relationField = new JTextField();
        relationField.setBounds(140, 70, 200, 25);
        add(relationField);

        JLabel festivalLabel = new JLabel("Festival:");
        festivalLabel.setBounds(30, 110, 100, 25);
        add(festivalLabel);

        festivalField = new JTextField();
        festivalField.setBounds(140, 110, 200, 25);
        add(festivalField);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(30, 150, 100, 25);
        add(amountLabel);

        amountField = new JTextField();
        amountField.setBounds(140, 150, 200, 25);
        add(amountField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(140, 190, 100, 30);
        add(submitButton);

        totalLabel = new JLabel("Total Salami Amount: 0");
        totalLabel.setBounds(30, 240, 300, 25);
        add(totalLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText();
                    String relation = relationField.getText();
                    String festival = festivalField.getText();
                    int amount = Integer.parseInt(amountField.getText());

                    salami.setName(name);
                    salami.setRelation(relation);
                    salami.setFestival(festival);
                    salami.setAmount(amount);

                    int total = salami.CalculateTotalAmount();
                    totalLabel.setText("Total Salami Amount: " + total + " TK");

                    nameField.setText("");
                    relationField.setText("");
                    festivalField.setText("");
                    amountField.setText("");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number for amount.");
                }
            }
        });
        

        
    }
       

}
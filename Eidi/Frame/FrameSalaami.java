package Frame;
// import lib.*; // Not needed for JDatePicker
import Entity.*;
import javax.swing.*;


public class FrameSalaami extends JFrame  {
    private JTextField nameField, relationField, festivalField, amountField;
    private JLabel totalLabel;
    private Salami salami;
    private JTextArea dataTextArea;


    public FrameSalaami() {
    // Set up background panel first
    BackgroundPanel bgPanel = new BackgroundPanel("Picture/bach.jpg");
    setContentPane(bgPanel);
    bgPanel.setLayout(null);

    salami = new Salami("", "", "", 0, 0);
    ImageIcon logo = new ImageIcon("Picture/img.png");
    setBounds(512, 100, 750, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setIconImage(logo.getImage());

    // Custom festive bold title label
    JLabel titleLabel = new JLabel("Eid Salaami calculator", SwingConstants.CENTER);
    titleLabel.setFont(new java.awt.Font("Comic Sans MS", java.awt.Font.BOLD, 26));
    titleLabel.setForeground(java.awt.Color.WHITE); // White for strong contrast with green
    titleLabel.setBounds(0, 0, 750, 40);
    titleLabel.setOpaque(false);
    bgPanel.add(titleLabel);

    // Save and Load buttons
    JButton saveButton = new JButton("Save");
    saveButton.setBounds(140, 510, 100, 30);
    bgPanel.add(saveButton);

    JButton loadButton = new JButton("Load");
    loadButton.setBounds(260, 510, 100, 30);
    bgPanel.add(loadButton);

    // Eid selection radio buttons
    JRadioButton fitrRadio = new JRadioButton("Eid Ul Fitr");
    fitrRadio.setBounds(140, 50, 120, 25); // moved down to avoid overlap
    JRadioButton adhaRadio = new JRadioButton("Eid Ul Adha");
    adhaRadio.setBounds(270, 50, 120, 25); // moved down to avoid overlap
    ButtonGroup eidGroup = new ButtonGroup();
    eidGroup.add(fitrRadio);
    eidGroup.add(adhaRadio);
    bgPanel.add(fitrRadio);
    bgPanel.add(adhaRadio);

    // Combo box for relative selection
    String[] relatives = {"", "Father", "Mother", "Brother", "Sister", "Uncle", "Aunt", "Cousin", "Grandfather", "Grandmother"};
    JComboBox<String> relativeCombo = new JComboBox<>(relatives);
    // Place to the right of relationField (x=250+200+10, y=130)
    relativeCombo.setBounds(460, 130, 120, 25);
    bgPanel.add(relativeCombo);

    // When a relative is selected, update the relationField
    relativeCombo.addActionListener(e -> relationField.setText((String)relativeCombo.getSelectedItem()));

    JLabel nameLabel = new JLabel("Name:");
    nameLabel.setBounds(140, 90, 100, 25);
    bgPanel.add(nameLabel);

    nameField = new JTextField();
    nameField.setBounds(250, 90, 200, 25);
    bgPanel.add(nameField);

    JLabel relationLabel = new JLabel("Relation:");
    relationLabel.setBounds(140, 130, 100, 25);
    bgPanel.add(relationLabel);

    relationField = new JTextField();
    relationField.setBounds(250, 130, 200, 25);
    bgPanel.add(relationField);

    JLabel festivalLabel = new JLabel("Festival:");
    festivalLabel.setBounds(140, 170, 100, 25);
    bgPanel.add(festivalLabel);

    festivalField = new JTextField();
    festivalField.setBounds(250, 170, 200, 25);
    bgPanel.add(festivalField);

    JLabel amountLabel = new JLabel("Amount:");
    amountLabel.setBounds(140, 210, 100, 25);
    bgPanel.add(amountLabel);

    amountField = new JTextField();
    amountField.setBounds(250, 210, 200, 25);
    bgPanel.add(amountField);

    JButton submitButton = new JButton("Submit");
    submitButton.setBounds(250, 250, 100, 30);
    bgPanel.add(submitButton);

    // Clear button for text area
    JButton clearButton = new JButton("Clear");
    clearButton.setBounds(370, 250, 100, 30);
    bgPanel.add(clearButton);

    totalLabel = new JLabel("Total Salami Amount: 0");
    totalLabel.setBounds(140, 300, 300, 25);
    bgPanel.add(totalLabel);

    // Text area for data display
    dataTextArea = new JTextArea();
    dataTextArea.setEditable(false);
    dataTextArea.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
    JScrollPane scrollPane = new JScrollPane(dataTextArea);
    scrollPane.setBounds(140, 340, 400, 150);
    bgPanel.add(scrollPane);

    // Clear button action
    clearButton.addActionListener(e -> dataTextArea.setText(""));

    // Save action
    saveButton.addActionListener(e -> {
        JFileChooser fileChooser = new JFileChooser("Data");
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try (java.io.FileWriter writer = new java.io.FileWriter(fileChooser.getSelectedFile())) {
                writer.write(dataTextArea.getText());
                JOptionPane.showMessageDialog(this, "Data saved successfully.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
            }
        }
    });

    // Load action
    loadButton.addActionListener(e -> {
        JFileChooser fileChooser = new JFileChooser("Data");
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try (java.util.Scanner scanner = new java.util.Scanner(fileChooser.getSelectedFile())) {
                StringBuilder sb = new StringBuilder();
                while (scanner.hasNextLine()) {
                    sb.append(scanner.nextLine()).append("\n");
                }
                dataTextArea.setText(sb.toString());
                JOptionPane.showMessageDialog(this, "Data loaded successfully.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error loading file: " + ex.getMessage());
            }
        }
    });

    // Submit action
    submitButton.addActionListener(e -> {
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

            // Get current date and time
            java.time.LocalDateTime now = java.time.LocalDateTime.now();
            java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String dateTime = now.format(formatter);

            String entry =
                "Name: " + name + "\n" +
                "Relation: " + relation + "\n" +
                "Festival: " + festival + "\n" +
                "Amount: " + amount + "\n" +
                "Date & Time: " + dateTime + "\n" +
                "-----------------------------\n";

            dataTextArea.append(entry);

            // Append entry to permanent file in Data directory
            try (java.io.FileWriter writer = new java.io.FileWriter("Data/Eidi.txt", true)) {
                writer.write(entry);
            } catch (Exception fileEx) {
                JOptionPane.showMessageDialog(this, "Error saving entry to file: " + fileEx.getMessage());
            }

            nameField.setText("");
            relationField.setText("");
            festivalField.setText("");
            amountField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for amount.");
        }
    });

    fitrRadio.addActionListener(e -> festivalField.setText("Eid Ul Fitr"));
    adhaRadio.addActionListener(e -> festivalField.setText("Eid Ul Adha"));
}
       

}
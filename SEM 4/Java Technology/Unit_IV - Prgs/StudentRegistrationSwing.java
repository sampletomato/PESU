import javax.swing.*; import java.awt.*; import java.sql.*; import java.util.List;
public class StudentRegistrationSwing {
    public static void main(String[] args) throws SQLException {
        String user = "root", pw = "root1234";
        String url = "jdbc:mysql://localhost:3306/classroom";
        Connection conn = DriverManager.getConnection(url, user, pw);
        String q = "INSERT INTO swinguidemo VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(q);
        JFrame f = new JFrame("Student Registration Window");
        JLabel l0 = new JLabel("Student Registration");
        l0.setBounds(220, 10, 200, 20);
        l0.setOpaque(true);
        l0.setBackground(Color.DARK_GRAY);
        l0.setForeground(Color.WHITE);
        f.add(l0);
        // Name Textfield
        JLabel l1 = new JLabel("Name: ");
        l1.setBounds(100, 50, 50, 20);
        f.add(l1);
        JTextField name = new JTextField(20);
        name.setBounds(200, 50, 150, 20);
        f.add(name);

        // Address textarea
        JLabel l2 = new JLabel("Address: ");
        l2.setBounds(100, 100, 100, 20);
        f.add(l2);
        JTextArea addr = new JTextArea();
        addr.setBounds(200, 100, 150, 60);
        f.add(addr);

        // Gender -- Radio
        JLabel l3 = new JLabel("Gender: ");
        l3.setBounds(100, 210, 100, 20);
        f.add(l3);
        JRadioButton rb1 = new JRadioButton("M");
        JRadioButton rb2 = new JRadioButton("F");
        rb1.setBounds(200, 210, 60, 20);
        rb2.setBounds(280, 210, 60, 20);
        f.add(rb1); f.add(rb2);

        // Country -- Dropdown
        JLabel l4 = new JLabel("Country: ");
        l4.setBounds(100, 260, 100, 20);
        f.add(l4);
        String[] countries = {"--Select Country--", "India", "Others"};
        JComboBox<String> combo = new JComboBox<>(countries);
        combo.setBounds(200, 260, 250, 20);
        f.add(combo);

        // Hobbies -- Checkbox
        JLabel l5 = new JLabel("Hobbies: ");
        l5.setBounds(100, 310, 100, 20);
        f.add(l5);
        JCheckBox cb1 = new JCheckBox("Reading");
        JCheckBox cb2 = new JCheckBox("Music");
        JCheckBox cb3 = new JCheckBox("Others");
        cb1.setBounds(200, 310, 150, 20);
        cb2.setBounds(200, 360, 150, 20);
        cb3.setBounds(200, 410, 150, 20);
        f.add(cb1); f.add(cb2); f.add(cb3);

        // Skills -- List
        JLabel l6 = new JLabel("Skills: ");
        l6.setBounds(100, 460, 100, 20);
        f.add(l6);
        String[] skillsList = {"Python", "Java", "C++"};
        JList<String> list = new JList<>(skillsList);
        list.setBounds(200, 460, 150, 80);
        f.add(list);

        JButton b = new JButton("Submit");
        b.setBounds(150, 570, 100, 20);
        f.add(b);

        b.addActionListener(e -> {
            String studentName = name.getText();
            String studentAddress = addr.getText();
            String studentGender = "Not Selected";
            if(rb1.isSelected()) studentGender = "M";
            if(rb2.isSelected()) studentGender = "F";
            String studentCountry = combo.getSelectedItem().
                toString();
            String studentHobbies = "";
            if(cb1.isSelected()) studentHobbies += "Reading | ";
            if(cb2.isSelected()) studentHobbies += "Music | ";
            if(cb3.isSelected()) studentHobbies += "Others | ";
            List<String> studentSkills = list.getSelectedValuesList();
            String skillString = "";
            System.out.println(studentName);
            System.out.println(studentAddress);
            System.out.println(studentGender);
            System.out.println(studentCountry);
            System.out.println(studentHobbies);
            for(String skill : studentSkills)
                skillString = skillString + skill + ", ";
            try {
                ps.setString(1, studentName);
                ps.setString(2, studentAddress);
                ps.setString(3, studentGender);
                ps.setString(4, studentCountry);
                ps.setString(5, studentHobbies);
                ps.setString(6, skillString);
                ps.executeUpdate();
                System.out.println("Row Inserted");
            }
            catch(SQLException se) {}
        });
        f.setSize(650, 650);
        f.setLayout(null);
        f.setVisible(true);
    }
}

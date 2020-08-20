import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register {

	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Regiser Here");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(150, 11, 118, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(34, 46, 78, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(44, 86, 58, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Confirm Password");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 137, 118, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(127, 173, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(34, 177, 58, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 95, 119, 20);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(138, 141, 123, 20);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblNewLabel_5 = new JLabel("Contact number");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 222, 107, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email id");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(44, 265, 68, 23);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(34, 299, 68, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("User Type");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(54, 376, 58, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JList list = new JList();
		list.setBounds(211, 375, 25, 0);
		frame.getContentPane().add(list);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(150, 294, 118, 48);
		frame.getContentPane().add(textArea_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Doctor", "Patient", "Pharmasist"}));
		comboBox.setBounds(171, 371, 97, 22);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(139, 50, 111, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 223, 118, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(248, 173, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 265, 118, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setMaximumRowCount(31);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(289, 89, 30, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_9 = new JLabel("Date of Birth");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(310, 28, 78, 19);
		frame.getContentPane().add(lblNewLabel_9);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_2.setMaximumRowCount(12);
		comboBox_2.setBounds(344, 89, 30, 22);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setToolTipText("");
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "20110", "2009", "2008", "2007", "2006", "2005", "", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "19330", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", ""}));
		comboBox_3.setMaximumRowCount(100);
		comboBox_3.setBounds(394, 89, 30, 22);
		frame.getContentPane().add(comboBox_3);
		
		JLabel lblNewLabel_10 = new JLabel("Day");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(277, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Month");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(320, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Year");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(378, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		Hospitalmananagement nw = new Hospitalmananagement();
			nw.NewFrame();
			
			}
		});
		btnNewButton.setBounds(299, 276, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hospitalmananagement {

	private JFrame Hospital_Management_system;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void NewFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hospitalmananagement window = new Hospitalmananagement();
					window.Hospital_Management_system.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hospitalmananagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Hospital_Management_system = new JFrame();
		Hospital_Management_system.getContentPane().setForeground(Color.DARK_GRAY);
		Hospital_Management_system.setBounds(100, 100, 528, 432);
		Hospital_Management_system.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Hospital_Management_system.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(76, 11, 255, 47);
		Hospital_Management_system.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(24, 108, 79, 39);
		Hospital_Management_system.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(34, 164, 64, 25);
		Hospital_Management_system.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(117, 117, 106, 20);
		Hospital_Management_system.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 166, 106, 20);
		Hospital_Management_system.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("User Type");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(24, 219, 64, 20);
		Hospital_Management_system.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Doctor", "Patient", "Pharmasist"}));
		comboBox.setToolTipText("Choose user Type");
		comboBox.setBounds(117, 219, 106, 22);
		Hospital_Management_system.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage nw = new Homepage();
				nw.NewFramee();
						
			}
			
		});
		btnNewButton.setBounds(106, 295, 89, 23);
		Hospital_Management_system.getContentPane().add(btnNewButton);
	}
}

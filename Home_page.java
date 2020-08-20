import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Home_page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_page window = new Home_page();
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
	public Home_page() {
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 352);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(159, 33, 103, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setBounds(10, 87, 129, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create Appointment");
		btnNewButton_1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				Add_patient nw = new Add_patient();
				nw.NewScreenn();
			}
			
				
				int status = 0;
				int ApId=0;
				try {
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("insert into appointment values(?,?,?,?,?,?,?,?,?)");
					ps.setInt(1,ApId);
					ps.setString(2,a.getName());
					ps.setString(3,a.getEmail());
					ps.setString(4,a.getContact());
					ps.setString(5,a.getAge());
					ps.setString(6,a.getDay());
					ps.setString(7, a.getSpeciality());
					ps.setString(8,a.getDescription());
					ps.setInt(9,a.getId());
					status=ps.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return status;
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(10, 151, 129, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Appointment");
		btnNewButton_2.setBounds(10, 213, 129, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View Doctor");
		btnNewButton_3.setBounds(188, 87, 129, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.setBounds(188, 151, 121, 23);
		frame.getContentPane().add(btnNewButton_4);
	}

}

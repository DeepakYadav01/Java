package JDBC_DB;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JLabel UserId;
	private JLabel Password;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 436);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		username = new JTextField();
		username.setBounds(318, 208, 174, 26);
		contentPane.add(username);
		username.setColumns(10);

		JButton SignupButton = new JButton("SignUp");
		SignupButton.setForeground(new Color(0, 0, 255));
		SignupButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		SignupButton.setBackground(new Color(255, 240, 245));
		SignupButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SignupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
			           Class.forName("oracle.jdbc.driver.OracleDriver");
			           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1404");


			       	PreparedStatement stmt = con.prepareStatement("insert into project values(?,?)");


				       stmt.setString(1, username.getText());
			       stmt.setString(2, password.getText());

			    ResultSet rs =   stmt.executeQuery();

			    if(rs.next())
			    {
             JOptionPane.showMessageDialog(null, "Successfully Signed Up");
           Login l =  new Login();

           l.setVisible(true);
           dispose();

			    }
			    else
		             JOptionPane.showMessageDialog(null, "Invalid UserId and Password ");




				}catch(Exception e) {
			           System.out.println(e);

			}
			}
		});
		SignupButton.setBounds(326, 310, 78, 26);
		contentPane.add(SignupButton);

		JLabel Signup = new JLabel("SignUp");
		Signup.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Signup.setHorizontalAlignment(SwingConstants.CENTER);
		Signup.setForeground(new Color(245, 255, 250));
		Signup.setBounds(271, 132, 174, 46);
		contentPane.add(Signup);

		UserId = new JLabel("Username");
		UserId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		UserId.setForeground(new Color(245, 255, 250));
		UserId.setHorizontalAlignment(SwingConstants.CENTER);
		UserId.setBounds(224, 207, 68, 26);
		contentPane.add(UserId);

		Password = new JLabel("Password");
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setForeground(new Color(245, 255, 250));
		Password.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Password.setBounds(224, 244, 68, 26);
		contentPane.add(Password);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l=new Login();
				l.setVisible(true);
				dispose();
			}
		});
		btnLogin.setForeground(Color.BLUE);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin.setBackground(new Color(255, 240, 245));
		btnLogin.setBounds(414, 310, 78, 26);
		contentPane.add(btnLogin);

		JLabel lblNewLabel = new JLabel("Tution Tonight");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblNewLabel.setBounds(203, 11, 361, 78);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Library Management System");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(224, 89, 314, 46);
		contentPane.add(lblNewLabel_1);

		password = new JPasswordField();
		password.setText("");
		password.setBounds(318, 245, 174, 26);
		contentPane.add(password);
//		setUndecorated(true);

	}
}

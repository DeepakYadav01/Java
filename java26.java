package JDBC_DB;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame {

	private JPanel password;
	private JTextField username;
	private JLabel Username;
	private JLabel Password;
	private JPasswordField password1;

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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 435);
		password = new JPanel();
		password.setFont(new Font("Tahoma", Font.BOLD, 15));
		password.setBackground(new Color(0, 0, 128));
		password.setForeground(new Color(0, 0, 0));
		password.setBorder(null);
		setContentPane(password);
		password.setLayout(null);


		username = new JTextField();
		username.setBounds(295, 174, 174, 26);
		password.add(username);
		username.setColumns(10);

		JButton LoginButton = new JButton("Login");
		LoginButton.setForeground(new Color(0, 0, 255));
		LoginButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		LoginButton.setBackground(new Color(255, 240, 245));
		LoginButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int flag=0;
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1404");
					Statement stmt=con.createStatement();
					ResultSet rs1=stmt.executeQuery("select * from project");
					while(rs1.next())
					{
						if((username.getText().equals(rs1.getString(1))) && (password1.getText().equals(rs1.getString(2))))
						{
							flag=1;
						}

					}
					if(flag==1)
					{
			             JOptionPane.showMessageDialog(null, "Successfully Login");
//			             setLocationRelativeTo(null);
			             Menu m=new Menu();
			             m.setVisible(true);
			             dispose();


						    }
						    else
					             JOptionPane.showMessageDialog(null, "Invalid UserId and Password ");







				}catch(Exception e) {
			           System.out.println(e);

			}
			}
		});
		LoginButton.setBounds(295, 266, 89, 26);
		password.add(LoginButton);

		JLabel Login = new JLabel("Login");
		Login.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Login.setHorizontalAlignment(SwingConstants.CENTER);
		Login.setForeground(new Color(245, 255, 250));
		Login.setBounds(196, 103, 273, 46);
		password.add(Login);

		Username = new JLabel("Username");
		Username.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Username.setForeground(new Color(245, 255, 250));
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		Username.setBounds(196, 173, 68, 26);
		password.add(Username);

		Password = new JLabel("Password");
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setForeground(new Color(245, 255, 250));
		Password.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Password.setBounds(196, 210, 68, 26);
		password.add(Password);

		password1 = new JPasswordField();
		password1.setBounds(295, 211, 174, 26);
		password.add(password1);
//		setUndecorated(true);
//		setVisible(true);

	}
}

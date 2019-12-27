package JDBC_DB;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import java.util.stream.Stream;

public class DataEntry extends JFrame {

	private JPanel contentPane;
	private JTextField U_id;
	private JTextField Uname;
	private JTextField Fname;
	private JTextField Sem;
	private JTextField stream;
	private JTextField Bnumber;
	private JTextField idate;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataEntry frame = new DataEntry();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public DataEntry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DATA ENTRY");
		lblNewLabel.setForeground(new Color(204, 0, 51));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(179, 0, 338, 64);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("University Id");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(180, 75, 137, 36);
		contentPane.add(lblNewLabel_1);

		U_id = new JTextField();
		U_id.setBounds(327, 75, 190, 30);
		contentPane.add(U_id);
		U_id.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(179, 114, 118, 30);
		contentPane.add(lblNewLabel_2);

		Uname = new JTextField();
		Uname.setColumns(10);
		Uname.setBounds(327, 116, 190, 30);
		contentPane.add(Uname);

		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFathersName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFathersName.setBounds(189, 150, 118, 30);
		contentPane.add(lblFathersName);

		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setHorizontalAlignment(SwingConstants.CENTER);
		lblSemester.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSemester.setBounds(179, 232, 118, 30);
		contentPane.add(lblSemester);

		Fname = new JTextField();
		Fname.setColumns(10);
		Fname.setBounds(327, 157, 190, 30);
		contentPane.add(Fname);

		Sem = new JTextField();
		Sem.setColumns(10);
		Sem.setBounds(327, 239, 190, 30);
		contentPane.add(Sem);

		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					try {

					    Class.forName("oracle.jdbc.driver.OracleDriver");
				           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1404");


				       	PreparedStatement stmt = con.prepareStatement("insert into dataentry values(?,?,?,?,?,?,?)");


					       stmt.setInt(1, Integer.parseInt(U_id.getText()));
				       stmt.setString(2,Uname.getText());
				       stmt.setString(3,Fname.getText());
				       stmt.setString(4,stream.getText());
				       stmt.setString(5,Sem.getText());
				       stmt.setInt(6,Integer.parseInt(Bnumber.getText()));
				       stmt.setInt(7,Integer.parseInt(idate.getText()));


//			          JOptionPane.showMessageDialog(null, "Data Successfully Submitted");
				       ResultSet rs=stmt.executeQuery();
System.out.println(rs);

			    if(rs.next())
			    {
	          JOptionPane.showMessageDialog(null, "Data Successfully Submitted");


					}
				    else
				    {
				          JOptionPane.showMessageDialog(null, "please fill all the details");

				    }


				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
		});
		Submit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Submit.setBounds(428, 380, 89, 23);
		contentPane.add(Submit);

		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m=new Menu();
				m.setVisible(true);
				dispose();

			}
		});
		back.setFont(new Font("Tahoma", Font.PLAIN, 13));
		back.setBounds(329, 380, 89, 23);
		contentPane.add(back);

		JSeparator separator = new JSeparator();
		separator.setBounds(157, 56, 407, 7);
		contentPane.add(separator);

		JLabel BNumber = new JLabel("Book Number");
		BNumber.setHorizontalAlignment(SwingConstants.CENTER);
		BNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BNumber.setBounds(179, 278, 118, 30);
		contentPane.add(BNumber);

		JLabel Stream = new JLabel("Stream");
		Stream.setHorizontalAlignment(SwingConstants.CENTER);
		Stream.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Stream.setBounds(179, 191, 118, 30);
		contentPane.add(Stream);

		stream = new JTextField();
		stream.setColumns(10);
		stream.setBounds(327, 198, 190, 30);
		contentPane.add(stream);

		Bnumber = new JTextField();
		Bnumber.setColumns(10);
		Bnumber.setBounds(327, 280, 190, 30);
		contentPane.add(Bnumber);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(146, 362, 407, 7);
		contentPane.add(separator_1);

		JLabel Idate = new JLabel("Issue Date");
		Idate.setHorizontalAlignment(SwingConstants.CENTER);
		Idate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Idate.setBounds(179, 319, 118, 30);
		contentPane.add(Idate);

		idate = new JTextField();
		idate.setColumns(10);
		idate.setBounds(327, 321, 190, 30);
		contentPane.add(idate);
	}
}

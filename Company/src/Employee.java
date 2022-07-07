import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class Employee {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee window = new Employee();
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
	public Employee() {
		initialize();
		Connect();
		table_load();
	}

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private JTable table;

	public void Connect() {
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "1234");
			} catch (ClassNotFoundException ex) {
				ex.printStackTrace();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

		}

	}

	public void table_load() {
		try {
			pst = con.prepareStatement("select * from employee");
			rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 857, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Employee");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(370, 11, 168, 56);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Registration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 78, 412, 234);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(26, 59, 76, 30);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Department");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(26, 133, 131, 43);
		panel.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(184, 142, 182, 30);
		panel.add(textField_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(184, 62, 182, 30);
		panel.add(textField_1);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnClear.setBounds(310, 323, 89, 38);
		frame.getContentPane().add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(164, 323, 95, 38);
		frame.getContentPane().add(btnExit);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name, department;
				name = textField_1.getText();
				department = textField_2.getText();

				try {
					pst = con.prepareStatement("insert into employee(name,department)values(?,?)");
					pst.setString(1, name);
					pst.setString(2, department);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added..");
					table_load();
					textField_1.setText("");
					textField_2.setText("");
					textField_1.requestFocus();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(20, 323, 89, 38);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(
						new TitledBorder(
								new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
										new Color(160, 160, 160)),
								"Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)),
						"Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 387, 412, 56);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2_1 = new JLabel("Emp_ID");
		lblNewLabel_2_1.setBounds(28, 19, 89, 22);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblNewLabel_2_1);

		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String id = textField_3.getText();

					pst = con.prepareStatement("select name,department from employee where id = ?");
					pst.setString(1, id);
					rs = pst.executeQuery();

					if (rs.next() == true) {

						String name = rs.getString(1);
						String department = rs.getString(2);

						textField_1.setText(name);
						textField_2.setText(department);

					} else {
						textField_1.setText("");
						textField_2.setText("");

					}

				} catch (SQLException ex) {

				}

			}
		});
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(189, 11, 182, 30);
		panel_1.add(textField_3);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id, name, department;
				name = textField_1.getText();
				department = textField_2.getText();
				id = textField_3.getText();

				try {
					pst = con.prepareStatement("update employee set name=?,department=? where id =?");
					pst.setString(1, name);
					pst.setString(2, department);
					pst.setString(3, id);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Update!!!!!");
					table_load();

					textField_1.setText("");
					textField_2.setText("");
					textField_1.requestFocus();
				}

				catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBounds(497, 405, 95, 38);
		frame.getContentPane().add(btnUpdate);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = textField_3.getText();
				try {
					pst = con.prepareStatement("delete from employee where id =?");
					pst.setString(1, id);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
					table_load();

					textField_1.setText("");
					textField_2.setText("");
					textField_1.requestFocus();
				}

				catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBounds(645, 405, 95, 38);
		frame.getContentPane().add(btnDelete);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Department"
			}
		));
		table.setBounds(438, 86, 375, 226);
		frame.getContentPane().add(table);
		
		JButton btnNewButton_1 = new JButton("List Department");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Department thedept = new Department();
				thedept.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(497, 322, 202, 38);
		frame.getContentPane().add(btnNewButton_1);
	}
}

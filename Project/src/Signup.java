import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	public Signup() {
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC544\uC774\uB514:");
		label.setFont(new Font("±º∏≤", Font.BOLD, 14));
		label.setBounds(12, 21, 87, 31);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\uBE44\uBC00\uBC88\uD638:");
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 62, 87, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984:");
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 99, 87, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uD559\uBC88:");
		lblNewLabel_2.setFont(new Font("±º∏≤", Font.BOLD, 14));
		lblNewLabel_2.setBounds(12, 134, 87, 31);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(88, 25, 212, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(88, 103, 212, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(88, 138, 212, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(88, 66, 212, 25);
		contentPane.add(passwordField);
		
		JButton signup = new JButton("∞°¿‘");
		signup.setBounds(41, 190, 101, 31);
		contentPane.add(signup);
		
		JButton cancel = new JButton("√Îº“");
		cancel.setBounds(165, 190, 107, 31);
		contentPane.add(cancel);
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}

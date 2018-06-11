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
	private JTextField RNumber;
	private JPasswordField passwordField;

	public Signup() {
		setTitle("Signup");
		setVisible(true);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 400, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.showSignup();
	}
	
	public void showSignup() {
		JLabel label = new JLabel("아이디");
		label.setFont(new Font("굴림", Font.BOLD, 14));
		label.setBounds(30, 25, 100, 31);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("비밀번호");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(30, 70, 100, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_1.setBounds(30, 115, 100, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("학번");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2.setBounds(30, 160, 100, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel RNum = new JLabel("주민번호 앞자리");
		RNum.setFont(new Font("굴림", Font.BOLD, 14));
		RNum.setBounds(30, 205, 135, 31);
		contentPane.add(RNum);
		
		textField = new JTextField();
		textField.setBounds(150, 25, 200, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 70, 200, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(150, 115, 200, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(150, 160, 200, 25);
		contentPane.add(passwordField);
		
		RNumber = new JTextField();
		RNumber.setBounds(150, 205, 200, 25);
		contentPane.add(RNumber);
		RNumber.setColumns(10);	
		
		
		JButton signup = new JButton("가입");
		signup.setBounds(70, 265, 107, 31);
		contentPane.add(signup);
		
		JButton cancel = new JButton("취소");
		cancel.setBounds(210, 265, 107, 31);
		contentPane.add(cancel);
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}

package leesangho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Signup_2 extends writetheprofile {

	private JPanel contentPane;

	public Signup_2(int order) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 519);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.disabledShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("미적분학");	
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(35, 61, 131, 27);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("일반물리학");
		checkBox.setBackground(new Color(255, 255, 255));
		checkBox.setBounds(35, 92, 131, 27);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("일반화학");
		checkBox_1.setBackground(new Color(255, 255, 255));
		checkBox_1.setBounds(35, 123, 131, 27);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("소프트웨어실습");
		checkBox_2.setBackground(new Color(255, 255, 255));
		checkBox_2.setBounds(35, 154, 131, 27);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("성균논어");
		checkBox_3.setBackground(new Color(255, 255, 255));
		checkBox_3.setBounds(35, 185, 131, 27);
		contentPane.add(checkBox_3);
		
		JLabel lblNewLabel = new JLabel("수강신청 과목");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 18));
		lblNewLabel.setBounds(35, 28, 165, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("전공");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 18));
		lblNewLabel_1.setBounds(35, 231, 117, 27);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"물리학과", "수학과", "기계공학과", "소프트웨어학과"}));
		comboBox.setBounds(35, 270, 176, 24);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("학기");
		lblNewLabel_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		lblNewLabel_2.setFont(new Font("돋움", Font.BOLD, 18));
		lblNewLabel_2.setBounds(35, 318, 62, 18);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(UIManager.getColor("Button.highlight"));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_1.setBounds(35, 348, 176, 24);
		contentPane.add(comboBox_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.highlight"));
		panel.setBounds(0, 0, 268, 472);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(255, 255, 255));
		label.setIcon(new ImageIcon("C:\\Users\\gfl50\\eclipse-workspace\\tester\\\uC131\uADE0\uAD00\uB300\uD559\uAD50\uB85C\uACE0.jpg"));
		label.setBounds(0, 89, 268, 269);
		panel.add(label);
		
		JButton button = new JButton("가입");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						if(chckbxNewCheckBox.isSelected()) {
							write_Math("O", order);
							changecsvfile();
						}
						if(checkBox.isSelected()) {
							write_Physics("O", order);
							changecsvfile();
						}
						if(checkBox_1.isSelected()) {
							write_Chemistry("O", order);
							changecsvfile();
						}
						if(checkBox_2.isSelected()) {
							write_Software("O", order); 
							changecsvfile();
							}
						if(checkBox_3.isSelected()) {
							write_Gongza("O", order);
							changecsvfile();
						}
						write_Major(comboBox.getSelectedItem().toString(), order);
						changecsvfile();
						write_Semester(comboBox_1.getSelectedIndex() + 1, order);
						changecsvfile();
						JOptionPane.showMessageDialog(null, "회원가입 성공!");
						dispose();
						
					} catch (FileNotFoundException e1) {						
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
					
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(70, 409, 117, 36);
		panel.add(button);
	}
}
package leesangho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Signup extends readtheprofile {
	ImageIcon imgS = new ImageIcon("./성균인가입.png");

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField RNumber;
	private JPasswordField passwordField;

	public Signup() {
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setBounds(100, 100, 444, 364);
	      contentPane = new JPanel();
	      contentPane.setBackground(Color.WHITE);
	      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	      setContentPane(contentPane);
	      contentPane.setLayout(null);
	      
	      JLabel label = new JLabel("\uC774\uB984 :");
	      label.setBackground(Color.WHITE);
	      label.setBounds(48, 120, 62, 18);
	      contentPane.add(label);
	      
	      JLabel lblNewLabel_1 = new JLabel("\uD559\uBC88 :");
	      lblNewLabel_1.setBackground(Color.WHITE);
	      lblNewLabel_1.setBounds(48, 171, 62, 18);
	      contentPane.add(lblNewLabel_1);
	      
	      JLabel label_1 = new JLabel("\uC8FC\uBBFC\uBC88\uD638 : ");
	      label_1.setBackground(Color.WHITE);
	      label_1.setBounds(48, 222, 85, 18);
	      contentPane.add(label_1);
	      
	      textField = new JTextField();
	      textField.setBounds(124, 110, 229, 39);
	      contentPane.add(textField);
	      textField.setColumns(10);
	      
	      textField_1 = new JTextField();
	      textField_1.setBounds(124, 161, 229, 39);
	      contentPane.add(textField_1);
	      textField_1.setColumns(10);
	      
	      textField_2 = new JTextField();
	      textField_2.setBounds(124, 212, 229, 39);
	      contentPane.add(textField_2);
	      textField_2.setColumns(10);
	      
	      JButton button = new JButton("\uB2E4\uC74C");
	      button.setBackground(Color.WHITE);
	      button.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
	        	 
	        	 String a,b,c;
	        	 
	        	 try {
	        		 for(int i=0;i<21;i++) {
	        		 
					   a=read_Name(i);
					   b=read_Student_ID(i);
		        	   c=read_Resident_Registration_Number(i);
		        	   
		        	   if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")) {

		        		   JOptionPane.showMessageDialog(null, "입력안된 부분이 있습니다.");
							 break;
		        		   
		        	   }
		        	   
		        	   
		        	   if(a.equals(textField.getText())&&b.equals(textField_1.getText())&&c.equals(textField_2.getText())){
		        		   
		        		   int order=i;
		        		   if(read_ID(i).equals("noid")) {
		        		     Signup_1 frame = new Signup_1(a,b,c,order);
			                 frame.setVisible(true);	
			                 dispose();
		        		     break;
		        		   }
		        		   else {
		        			   JOptionPane.showMessageDialog(null, "이미가입한아이디입니다.");
		        			   fpwselect frame = new fpwselect();
				               frame.setVisible(true);
				               dispose();
		        			   break;
		        		   }
		        	   }
		        	   else {
		        		   if(i==20)
		        			   JOptionPane.showMessageDialog(null, "인증되지않았습니다.");
		        		   else
		        			   continue;
		        	   }
		        	   
		        	   
		        	   
		        	
	        		 }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	 
	        	 
	         }
	      });
	      button.setBounds(88, 272, 111, 33);
	      contentPane.add(button);/*다음*/
	      
	      JButton btnNewButton = new JButton("\uCDE8\uC18C");
	      btnNewButton.setBackground(Color.WHITE);
	      btnNewButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 dispose();
	         }
	      });
	      btnNewButton.setBounds(213, 272, 111, 33);
	      contentPane.add(btnNewButton);
	      
	      JLabel label_2 = new JLabel("");
	      label_2.setIcon(imgS);
	      label_2.setBounds(0, 0, 434, 200);
	      contentPane.add(label_2);/*취소*/
	   }
}

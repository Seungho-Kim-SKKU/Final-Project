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

public class Signup extends writetheprofile {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField RNumber;
	private JPasswordField passwordField;

	public Signup() {
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setBounds(100, 100, 450, 300);
	      contentPane = new JPanel();
	      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	      setContentPane(contentPane);
	      contentPane.setLayout(null);
	      
	      JLabel lblNewLabel = new JLabel("\uBCF8\uC778\uD655\uC778");
	      lblNewLabel.setBounds(175, 12, 62, 18);
	      contentPane.add(lblNewLabel);
	      
	      JLabel label = new JLabel("\uC774\uB984 :");
	      label.setBounds(48, 59, 62, 18);
	      contentPane.add(label);
	      
	      JLabel lblNewLabel_1 = new JLabel("\uD559\uBC88 :");
	      lblNewLabel_1.setBounds(48, 115, 62, 18);
	      contentPane.add(lblNewLabel_1);
	      
	      JLabel label_1 = new JLabel("\uC8FC\uBBFC\uBC88\uD638 : ");
	      label_1.setBounds(48, 169, 85, 18);
	      contentPane.add(label_1);
	      
	      textField = new JTextField();
	      textField.setBounds(124, 49, 229, 39);
	      contentPane.add(textField);
	      textField.setColumns(10);
	      
	      textField_1 = new JTextField();
	      textField_1.setBounds(124, 105, 229, 39);
	      contentPane.add(textField_1);
	      textField_1.setColumns(10);
	      
	      textField_2 = new JTextField();
	      textField_2.setBounds(124, 159, 229, 39);
	      contentPane.add(textField_2);
	      textField_2.setColumns(10);
	      
	      JButton button = new JButton("\uB2E4\uC74C");
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
		        		     break;
		        		   }
		        		   else {
		        			   JOptionPane.showMessageDialog(null, "이미가입한아이디입니다.");
		        			   fpwselect frame = new fpwselect();
				               frame.setVisible(true);
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
	      button.setBounds(89, 214, 105, 27);
	      contentPane.add(button);/*다음*/
	      
	      JButton btnNewButton = new JButton("\uCDE8\uC18C");
	      btnNewButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	         }
	      });
	      btnNewButton.setBounds(223, 214, 105, 27);
	      contentPane.add(btnNewButton);/*취소*/
	   }
}

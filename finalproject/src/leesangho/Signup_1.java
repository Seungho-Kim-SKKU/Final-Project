package leesangho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Signup_1 extends writetheprofile{
	
	
	   private JPanel contentPane;
	   private JTextField textField;
	   private JTextField textField_1;
	   private JTextField textField_2;
	   private final ButtonGroup buttonGroup = new ButtonGroup();
	   int m=2;

	public Signup_1(String a,String b, String c ,int order) {
		
		  //a : name
		  //b : 학번
		  //c : 주민번호
		
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setBounds(100, 100, 450, 351);
	      contentPane = new JPanel();
	      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	      setContentPane(contentPane);
	      contentPane.setLayout(null);
	      
	      JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514 :");
	      lblNewLabel.setBounds(14, 24, 62, 18);
	      contentPane.add(lblNewLabel);
	      
	      JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
	      lblNewLabel_1.setBounds(14, 75, 76, 18);
	      contentPane.add(lblNewLabel_1);
	      
	      JRadioButton rdbtnNewRadioButton = new JRadioButton("\uD559\uC0DD");
	      rdbtnNewRadioButton.setFont(new Font("굴림", Font.PLAIN, 17));
	      buttonGroup.add(rdbtnNewRadioButton);
	      rdbtnNewRadioButton.setBounds(128, 111, 109, 42);
	      contentPane.add(rdbtnNewRadioButton);
	      
	      JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uAD50\uC218");
	      rdbtnNewRadioButton_1.setFont(new Font("굴림", Font.PLAIN, 17));
	      buttonGroup.add(rdbtnNewRadioButton_1);
	      rdbtnNewRadioButton_1.setBounds(264, 111, 139, 42);
	      contentPane.add(rdbtnNewRadioButton_1);
	      
	      JLabel lblNewLabel_2 = new JLabel("\uAC00\uC785\uC2E0\uBD84 :");
	      lblNewLabel_2.setBounds(14, 124, 76, 18);
	      contentPane.add(lblNewLabel_2);
	      
	      JLabel lblNewLabel_3 = new JLabel("\uC544\uC774\uB514\uCC3E\uAE30 \uC9C8\uBB38 :");
	      lblNewLabel_3.setBounds(14, 161, 115, 18);
	      contentPane.add(lblNewLabel_3);
	      
	      JComboBox comboBox = new JComboBox();
	      comboBox.setModel(new DefaultComboBoxModel(new String[] {"" ,"1. \uB2F9\uC2E0\uC758 \uACE0\uD5A5\uC740?", "2. \uB2F9\uC2E0\uC758 \uCD9C\uC2E0 \uACE0\uB4F1\uD559\uAD50\uB294?", "3. \uB2F9\uC2E0\uC758 \uCD5C\uC560 \uC5F0\uC608\uC778\uC740?", "4. \uB2F9\uC2E0\uC774 \uAC00\uC7A5 \uC88B\uC544\uD558\uB294 \uC74C\uC2DD\uC740?"}));
	      comboBox.setBounds(140, 158, 250, 24);
	      contentPane.add(comboBox);
	      
	      JLabel lblNewLabel_4 = new JLabel("\uB2F5\uBCC0 :");
	      lblNewLabel_4.setBounds(14, 211, 62, 18);
	      contentPane.add(lblNewLabel_4);
	      
	      textField = new JTextField();   //아이디
	      textField.setBounds(90, 17, 163, 42);
	      contentPane.add(textField);
	      textField.setColumns(10);
	      
	      textField_1 = new JTextField();  //비번
	      textField_1.setBounds(90, 65, 163, 38);
	      contentPane.add(textField_1);
	      textField_1.setColumns(10);
	      
	      textField_2 = new JTextField();  //답변
	      textField_2.setBounds(90, 201, 300, 38);
	      contentPane.add(textField_2);
	      textField_2.setColumns(10);
	      
	      JButton btnNewButton = new JButton("\uC644\uB8CC");  //확인
	      btnNewButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 
	        	 if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||(!rdbtnNewRadioButton.isSelected())&&(!rdbtnNewRadioButton_1.isSelected())||comboBox.getSelectedIndex()==0) {
	        		 JOptionPane.showMessageDialog(null, "입력안된 부분이 있습니다.");
	        	 }else {
	        	 
	        	 if(m==2) {
	        		 JOptionPane.showMessageDialog(null, "아이디 중복확인을 해주세요.");
	        	 }
	        	 else if(m==1) {
	        		 JOptionPane.showMessageDialog(null, "아이디 중복확인을 해주세요.");
	        	 }
	        	 else {
	        		 
	        		 try {	        			 
	        			 
						write_ID(textField.getText(),order);
						changecsvfile();
						
						write_Password(textField_1.getText(),order);
						changecsvfile();
						
						write_Question_number(comboBox.getSelectedIndex(),order);
						changecsvfile();
						
						write_Answer(textField_2.getText(),order);
						changecsvfile();
						
						if(rdbtnNewRadioButton.isSelected()) {
							write_Position( "학생" ,order);
							changecsvfile();
						}
						else {
							write_Position( "교수" ,order);
							changecsvfile();
						}		
						
						Signup_2 Signup = new Signup_2(order);
						dispose();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        	 }
	        	 }//회원가입 성공
	        	 
	         }
	      });
	      btnNewButton.setBounds(90, 265, 105, 27);
	      contentPane.add(btnNewButton);
	      
	      JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");  //취소
	      btnNewButton_1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 dispose();
	         }
	      });
	      btnNewButton_1.setBounds(239, 265, 105, 27);
	      contentPane.add(btnNewButton_1);
	      
	      
	      
	      JButton btnNewButton_2 = new JButton("\uC911\uBCF5\uD655\uC778");  // 아이디 중복확인
	      btnNewButton_2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 int n=0;	        	  //중복허용 체크X
	        	 String a;
	        	 
	        	 try {
	        		 for(int i=0;i<21;i++) {
					     a=read_ID(i);	     
					     if(a.equals(textField.getText())) {
					    	 n=1;  //아이디 중복 O
					    	 break;
					     }
					     else
					    	 n=0;  //아이디 중복 X
	        		 }
	        		 
	        		 if(n==1) {
	        			 JOptionPane.showMessageDialog(null, "이미있는 아이디 입니다.");
	        			 m=1; //중복확인 불통과
	        		 }
	        		 else {
	        			 JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다.");
	        			 m=0; //중복확인 통과
	        		 }
	        		 
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	 
	         }
	      });
	      btnNewButton_2.setBounds(285, 20, 105, 27);
	      contentPane.add(btnNewButton_2);
	   }

	
	
}

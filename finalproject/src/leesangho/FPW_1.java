package leesangho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;

public class FPW_1 extends readtheprofile {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public FPW_1(int order) throws IOException {
		
		String a=" ���������ȵǾ��� ";
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setBounds(100, 100, 450, 300);
	      contentPane = new JPanel();
	      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	      setContentPane(contentPane);
	      contentPane.setLayout(null);
	      
	      JLabel label = new JLabel("\uB2F5\uBCC0 :");
	      label.setFont(new Font("����", Font.PLAIN, 18));
	      label.setBounds(22, 109, 89, 40);
	      contentPane.add(label);
	      
	      textField = new JTextField();
	      textField.setBounds(109, 112, 256, 40);
	      contentPane.add(textField);
	      textField.setColumns(10);
	      
	      JLabel lblNewLabel = new JLabel("\uC9C8\uBB38 :");
	      lblNewLabel.setFont(new Font("����", Font.PLAIN, 18));
	      lblNewLabel.setBounds(22, 32, 67, 30);
	      contentPane.add(lblNewLabel);
	      
	      int num=0;
	      num=read_Question_number(order);
	      if(num==1)
	    	  a="����� ������?  ";
	      if(num==2)
	    	  a="����� ��� ����б���?";
	      if(num==3)
	    	  a="����� �־� ��������?";
	      if(num==4)
	    	  a="����� ���� �����ϴ� ������?";
	    			  
	      
	      JLabel lblNewLabel_1 = new JLabel(a);
	      lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 15));
	      lblNewLabel_1.setBounds(109, 29, 256, 40);
	      contentPane.add(lblNewLabel_1);
        
        JButton btnNewButton = new JButton("\uD655\uC778");
        btnNewButton.addActionListener(new ActionListener() {
        	@Override
           public void actionPerformed(ActionEvent e) {
        	   String b,c;
        	   b=textField.getText();
        	   
        	   try {	   
        		   if(textField.getText().equals("")) {
  					 JOptionPane.showMessageDialog(null, "�Է¾ȵ� �κ��� �ֽ��ϴ�.");
   				   }
        		   else {      		   
				      if(b.equals(read_Answer(order))) {
					       c=read_Password(order);					       
					       JOptionPane.showMessageDialog(null, "����� ��й�ȣ�� "+c+" �Դϴ�");	
					       dispose();
				       }
			 	       else      {				
				 	   JOptionPane.showMessageDialog(null, "���� ���� �亯�Դϴ�");					
				       }
        		   }
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        		   
        	   
           }
        });
        btnNewButton.setBounds(169, 193, 97, 23);
        contentPane.add(btnNewButton);
	}

 }

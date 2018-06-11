package leesangho;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FPW extends readtheprofile{
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public FPW() {
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514 :");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel.setBounds(33, 53, 105, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD559\uBC88 :");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1.setBounds(33, 131, 105, 34);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(137, 53, 221, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 136, 221, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
	         String id,sn;
	         String a,b;
	         int order;
	         public void actionPerformed(ActionEvent arg0) {
	        	
	            id=new String(textField.getText());
	            sn=textField_1.getText();
	            	
	            	try {
	            		for(int i=0;i<21;i++) {
						   
	            		   b=read_Student_ID(i);
						   a=read_ID(i);
						   
						   if(a.equals(id)&&b.equals(sn)){
							   
							   order=i;
							   FPW_1 frame = new FPW_1(order);
				               frame.setVisible(true);
				               break;
							   
						   }
						   else {
							   if(i==20) {
							     JOptionPane.showMessageDialog(null, "인증에 실패하셨습니다.");
							     break;
							   }
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

		btnNewButton.setBounds(66, 200, 124, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(218, 200, 132, 34);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}

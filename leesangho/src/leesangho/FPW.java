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
import javax.swing.ImageIcon;
import java.awt.Color;

public class FPW extends readtheprofile{
   
   private JPanel contentPane;
   private JTextField textField;
   private JTextField textField_1;
   
   public FPW() { //비밀번호 찾기 창
      setVisible(true);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 405, 336);
      contentPane = new JPanel();
      contentPane.setBackground(Color.WHITE);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514 :");
      lblNewLabel.setFont(new Font("굴림", Font.BOLD, 23));
      lblNewLabel.setBounds(22, 119, 105, 34);
      contentPane.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("\uD559\uBC88 :");
      lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 23));
      lblNewLabel_1.setBounds(22, 178, 105, 34);
      contentPane.add(lblNewLabel_1);
      
      textField = new JTextField();
      textField.setBounds(139, 119, 221, 34);
      contentPane.add(textField);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setBounds(139, 185, 221, 29);
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
                     if(new String(textField.getText()).equals("")||textField_1.getText().equals("")) {
                         JOptionPane.showMessageDialog(null, "입력안된 부분이 있습니다. ");
                         break;
                      }
                     if(a.equals(id)&&b.equals(sn)){
                        
                        order=i;
                        FPW_1 frame = new FPW_1(order); //아이디 주인이 맞을 시에 새 프레임 실행
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

      btnNewButton.setBounds(59, 243, 111, 33);
      contentPane.add(btnNewButton);
      btnNewButton.setBackground(Color.WHITE);
      
      JButton btnNewButton_1 = new JButton("취소");
      btnNewButton_1.setBounds(212, 243, 111, 33);
      contentPane.add(btnNewButton_1);
      btnNewButton_1.setBackground(Color.WHITE);
      
      JLabel lblNewLabel_2 = new JLabel("");
      lblNewLabel_2.setIcon(new ImageIcon("./PW.png"));
      lblNewLabel_2.setBounds(0, -48, 488, 294);
      contentPane.add(lblNewLabel_2);
      btnNewButton_1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
         }
      });
   }
}

package leesangho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class fpwselect extends JFrame { //아이디가 이미 가입됐을 시 비밀번호 찾기를 실행할 지 질문

   private JPanel contentPane;

   public fpwselect() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBackground(Color.WHITE);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uBE44\uBC00\uBC88\uD638\uB97C \uCC3E\uC73C\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
      lblNewLabel.setFont(new Font("돋움", Font.BOLD, 22));
      lblNewLabel.setBounds(65, 73, 296, 39);
      contentPane.add(lblNewLabel);
      
      JButton btnNewButton = new JButton("네");//
      btnNewButton.setBackground(Color.WHITE);
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 FPW frame = new FPW();
             frame.setVisible(true); //비밀번호 찾기 프레임 실행
             dispose();
         }
      });
      btnNewButton.setBounds(79, 181, 111, 33);
      contentPane.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("아니오");
      btnNewButton_1.setBackground(Color.WHITE);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 dispose(); //끄기
         }
      });
      btnNewButton_1.setBounds(242, 181, 111, 33);
      contentPane.add(btnNewButton_1);
   }

}

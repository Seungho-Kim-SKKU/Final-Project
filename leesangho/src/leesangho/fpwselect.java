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

public class fpwselect extends JFrame { //���̵� �̹� ���Ե��� �� ��й�ȣ ã�⸦ ������ �� ����

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
      lblNewLabel.setFont(new Font("����", Font.BOLD, 22));
      lblNewLabel.setBounds(65, 73, 296, 39);
      contentPane.add(lblNewLabel);
      
      JButton btnNewButton = new JButton("��");//
      btnNewButton.setBackground(Color.WHITE);
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 FPW frame = new FPW();
             frame.setVisible(true); //��й�ȣ ã�� ������ ����
             dispose();
         }
      });
      btnNewButton.setBounds(79, 181, 111, 33);
      contentPane.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("�ƴϿ�");
      btnNewButton_1.setBackground(Color.WHITE);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 dispose(); //����
         }
      });
      btnNewButton_1.setBounds(242, 181, 111, 33);
      contentPane.add(btnNewButton_1);
   }

}

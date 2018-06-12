package leesangho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Signin extends readtheprofile {
   private Main main;
    private TestFrm testFrm;
   
    private JButton btnLogin;
    private JButton btnSignup;
    private JButton btnID;
    private JButton btnPW;
    private JPasswordField passText;
    private JTextField userText;
    private boolean bLoginCheck;
   
    public static void main(String[] args) {
        //new LoginView();
    }
 
    public Signin() {
        // setting
        setTitle("signin");
        setSize(727, 400);
        setResizable(false);
        setLocation(6, 437);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        JPanel panel = new JPanel();
        placeLoginPanel(panel);
       
       
        // add
        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("./�α���â.png"));
        lblNewLabel.setBounds(0, 0, 733, 383);
        panel.add(lblNewLabel);
       
        // visible
        setVisible(true);
    }
   
    public void placeLoginPanel(JPanel panel){
        panel.setLayout(null);
       
        userText = new JTextField(20);
        userText.setBounds(252, 159, 190, 27);
        panel.add(userText);
       
        passText = new JPasswordField(20);
        passText.setBounds(252, 189, 190, 27);
        panel.add(passText);
        passText.addActionListener(new ActionListener() {  
           @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();        
            }
        });
       
        btnSignup = new JButton("");
        btnSignup.setBackground(Color.WHITE);
        btnSignup.setEnabled(true);
        btnSignup.setOpaque(false);
        btnSignup.setBorderPainted(false);
        btnSignup.setBounds(183, 306, 93, 25);
        panel.add(btnSignup);
        btnSignup.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
        	   Signup frame = new Signup();
               frame.setVisible(true);
            }
        });
        
        btnID = new JButton("");
        btnID.setBackground(Color.WHITE);
        btnID.setEnabled(true);
        btnID.setOpaque(false);
        btnID.setBorderPainted(false);
        btnID.setBounds(288, 306, 67, 25);
        panel.add(btnID);
        btnID.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                main.showFID();
            }
        });
        
        btnPW = new JButton("");
        btnPW.setOpaque(false);
        btnPW.setBorderPainted(false);
        btnPW.setBackground(Color.WHITE);
        btnPW.setEnabled(true);       
        btnPW.setBounds(375, 306, 67, 25);
        panel.add(btnPW);
        btnPW.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                main.showFPW();
            }
        });
       
        btnLogin = new JButton("");
        btnLogin.setBackground(Color.WHITE);
        btnLogin.setEnabled(true);
        btnLogin.setOpaque(false);
        btnLogin.setBorderPainted(false);
        btnLogin.setBounds(278, 238, 135, 35);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();
            }
        });
    }
   
    public void isLoginCheck(){
       String a , b;
       int count =0;
       int count_1=0;
          try {
             for(int i=0;i<21;i++) {
             a=read_ID(i);
             b=read_Password(i);
             if(userText.getText().equals(a)||count==1) {
                count=1;
               if(new String(passText.getPassword()).equals(b)) {
                  JOptionPane.showMessageDialog(null, "Success");
                     bLoginCheck = true;
                    
                     // �α��� �����̶�� �Ŵ���â �ٿ��
                     if(isLogin()){
                         main.showFrameTest(); // ����â �޼ҵ带 �̿��� â�ٿ��
                     }
                     break;
               }
               else {
                  if(i==20) {                    
                          
                     JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
                          
                       break;
                    }
                    else
                       continue;
               }
             }/*if��*/
             else {
                   if(i==20) {
                      
                           JOptionPane.showMessageDialog(null, "��ġ�ϴ� ���̵� �����ϴ�.");
                           break;
                           
                     }
                     else
                        continue;
             }/*else��*/
            }
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
    } 
   
    // mainProcess�� ����
    public void setMain(Main main) {
        this.main = main;
    }   
 
    public boolean isLogin() {     
        return bLoginCheck;
    }
}

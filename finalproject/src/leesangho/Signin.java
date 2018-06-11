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
        setSize(758, 437);
        setResizable(false);
        setLocation(6, 437);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        JPanel panel = new JPanel();
        placeLoginPanel(panel);
       
       
        // add
        add(panel);
       
        // visible
        setVisible(true);
    }
   
    public void placeLoginPanel(JPanel panel){
        panel.setLayout(null);     
        JLabel userLabel = new JLabel("���̵�");
        userLabel.setBounds(200, 200, 80, 25);
        panel.add(userLabel);
       
        JLabel passLabel = new JLabel("��й�ȣ");
        passLabel.setBounds(200, 231, 80, 25);
        panel.add(passLabel);
       
        userText = new JTextField(20);
        userText.setBounds(290, 200, 200, 27);
        panel.add(userText);
       
        passText = new JPasswordField(20);
        passText.setBounds(290, 231, 200, 27);
        panel.add(passText);
        passText.addActionListener(new ActionListener() {  
        	@Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();        
            }
        });
       
        btnSignup = new JButton("�����ΰ���");
        btnSignup.setBounds(190, 335, 100, 25);
        panel.add(btnSignup);
        btnSignup.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
        		Signup frame = new Signup();
	               frame.setVisible(true);
            }
        });
        
        btnID = new JButton("IDã��");
        btnID.setBounds(295, 335, 100, 25);
        panel.add(btnID);
        btnID.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                main.showFID();
            }
        });
        
        btnPW = new JButton("PWã��");
        btnPW.setBounds(400, 335, 100, 25);
        panel.add(btnPW);
        btnPW.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                main.showFPW();
            }
        });
       
        btnLogin = new JButton("Login");
        btnLogin.setBounds(268, 280, 160, 35);
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
				 if(userText.getText().equals("")||new String(passText.getPassword()).equals("")) {
					 JOptionPane.showMessageDialog(null, "�Է¾ȵ� �κ��� �ֽ��ϴ�.");
					 break;
				 }
				 
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

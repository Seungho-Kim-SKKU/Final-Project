import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class MainProcess {
	Signin signin;
	TestFrm testFrm;
	Signup signup;
	public static void main(String[] args) throws FileNotFoundException {
		MainProcess main = new MainProcess();
        main.signin = new Signin(); // �α���â ���̱�
        main.signin.setMain(main); // �α���â���� ���� Ŭ����������
        
        writetheprofile a = new writetheprofile();
		
		a.write_ID("dfawef123", 3);
	}
	
	public void showFrameTest(){
		
        signin.dispose(); // �α���â�ݱ�
        this.testFrm = new TestFrm(); // �׽�Ʈ������ ����
    }	
	
	public void showSignup() {
		this.signup = new Signup();
	}
}

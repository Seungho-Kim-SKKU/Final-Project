package leesangho;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class Main {
	Signin signin;
	TestFrm testFrm;
	Signup signup;
	FID fid;
	FPW fpw;
	public static void main(String[] args) throws FileNotFoundException {
		Main main = new Main();
        main.signin = new Signin(); // �α���â ���̱�
        main.signin.setMain(main); // �α���â���� ���� Ŭ����������     
	}
	
	public void showFrameTest(){		
        signin.dispose(); // �α���â�ݱ�
        this.testFrm = new TestFrm(); // �׽�Ʈ������ ����
    }	
	
	public void showSignup() {
		this.signup = new Signup();
	}
	
	public void showFID() {
		this.fid = new FID();
	}
	
	public void showFPW() {
		this.fpw= new FPW();
	}
	
}

package leesangho;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class Main {
	Signin signin;
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
    }	
	
	public void showSignup() {
		this.signup = new Signup(); // ȸ����â ����
	}
	
	public void showFID() {
		this.fid = new FID(); // ���̵�ã��â ����
	}
	
	public void showFPW() {
		this.fpw= new FPW(); //��й�ȣã��â ����
	}
	
}

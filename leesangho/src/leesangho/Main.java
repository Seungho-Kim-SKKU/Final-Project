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
        main.signin = new Signin(); // 로그인창 보이기
        main.signin.setMain(main); // 로그인창에게 메인 클래스보내기   
	}
	
	public void showFrameTest(){		
        signin.dispose(); // 로그인창닫기
    }	
	
	public void showSignup() {
		this.signup = new Signup(); // 회언가입창 열기
	}
	
	public void showFID() {
		this.fid = new FID(); // 아이디찾기창 열기
	}
	
	public void showFPW() {
		this.fpw= new FPW(); //비밀번호찾기창 열기
	}
	
}

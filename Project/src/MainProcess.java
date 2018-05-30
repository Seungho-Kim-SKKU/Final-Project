import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class MainProcess {
	Signin signin;
	TestFrm testFrm;
	Signup signup;
	public static void main(String[] args) throws FileNotFoundException {
		MainProcess main = new MainProcess();
        main.signin = new Signin(); // 로그인창 보이기
        main.signin.setMain(main); // 로그인창에게 메인 클래스보내기
        
        writetheprofile a = new writetheprofile();
		
		a.write_ID("dfawef123", 3);
	}
	
	public void showFrameTest(){
		
        signin.dispose(); // 로그인창닫기
        this.testFrm = new TestFrm(); // 테스트프레임 오픈
    }	
	
	public void showSignup() {
		this.signup = new Signup();
	}
}

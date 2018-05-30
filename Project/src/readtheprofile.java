
import java.io.*;

public class readtheprofile {

	int Order;
    int Student_ID;
    String Name;
    String Resident_Registration_Number;
    String ID;
    String Password;
    int Position;
    
    void read_Resident_Registration_Number(int order) throws IOException {
    	    
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("C:\\Users\\heesun\\Desktop\\leesangho\\src\\leesangho\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Resident_Registration_Number = a[3];
	    }
	    catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	    catch (IOException e){
			e.printStackTrace();
		}
	    finally{
			br.close ();
		}
    }
    
    void read_ID(int order)throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\leesangho\\\\src\\\\leesangho\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    ID = a[4];
	    }
	    catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	    catch (IOException e){
			e.printStackTrace();
		}
	    finally{
			br.close ();
		}
    }
    
    void read_Password (int order)throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\leesangho\\\\src\\\\leesangho\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Password = a[5];
	    }
	    catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	    catch (IOException e){
			e.printStackTrace();
		}
	    finally{
			br.close ();
		}
    }
    
    void read_position ( int order )throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\leesangho\\\\src\\\\leesangho\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Position = Integer.parseInt(a[6]);
	    }
	    catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	    catch (IOException e){
			e.printStackTrace();
		}
	    finally{
			br.close ();
		}
    }
}

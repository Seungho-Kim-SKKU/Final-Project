package leesangho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class readtheprofile extends JFrame {

	int Order;
    String Student_ID;
    String Name;
    String Resident_Registration_Number;
    String ID;
    String Password;
    String Position;
    int Question_number;
    String Answer;
    int Fail_number;
    String Math;
    String Physics;
    String Chemistry;
    String Software;
    String Gongza;
    String Condition;
    String Rest_reason;
    
String read_Student_ID(int order) throws IOException {
	    
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Student_ID = a[1];		    
	    }
	    catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	    catch (IOException e){
			e.printStackTrace();
		}
		br.close ();
	    return Student_ID;
    }
    
    String read_Name(int order) throws IOException {
	    
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Name = a[2];		    
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
	    return Name;
    }
    
    String read_Resident_Registration_Number(int order) throws IOException {
    	    
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
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
	    return Resident_Registration_Number;
    }
    
    String read_ID(int order)throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
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
	    return ID;
    }
    
    String read_Password (int order)throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
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
	    return Password;
    }
    
    
    
    
    
    String read_Position ( int order )throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Position = a[6];
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
	    return Position;
    }
    
    int read_Question_number ( int order )throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Question_number = Integer.parseInt(a[7]);
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
	    return Question_number;
    }
    
    String read_Answer ( int order )throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Answer = a[8];
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
	    return Answer;
    }
    
    int read_Fail_number ( int order )throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Fail_number = Integer.parseInt(a[9]);
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
	    return Fail_number;
    }

     String read_Math( int order )throws IOException {
    	Reader isr;
	    InputStream fis;
	    BufferedReader br = null;
	    
	    try {
	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
		    String data = null;
		    for(int i=0;i<order+1;i++) {
		    	data = br.readLine();
		    }
		    String[] a = data.split(",");
		    
		    Math = a[10];
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
	    return Math;
    }
     
     String read_Physics( int order )throws IOException {
     	Reader isr;
 	    InputStream fis;
 	    BufferedReader br = null;
 	    
 	    try {
 	    	
 	    	fis = new FileInputStream ("./profile.csv");
 	    	isr = new InputStreamReader (fis);
 		    br  = new BufferedReader (isr);
 		    String data = null;
 		    for(int i=0;i<order+1;i++) {
 		    	data = br.readLine();
 		    }
 		    String[] a = data.split(",");
 		    
 		    Physics = a[11];
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
 	    return Physics;
     }
     String read_Chemistry( int order )throws IOException {
      	Reader isr;
  	    InputStream fis;
  	    BufferedReader br = null;
  	    
  	    try {
  	    	
  	    	fis = new FileInputStream ("./profile.csv");
  	    	isr = new InputStreamReader (fis);
  		    br  = new BufferedReader (isr);
  		    String data = null;
  		    for(int i=0;i<order+1;i++) {
  		    	data = br.readLine();
  		    }
  		    String[] a = data.split(",");
  		    
  		    Chemistry = a[12];
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
  	    return Chemistry;
      }
     
     String read_Software( int order )throws IOException {
       	Reader isr;
   	    InputStream fis;
   	    BufferedReader br = null;
   	    
   	    try {
   	    	
   	    	fis = new FileInputStream ("./profile.csv");
   	    	isr = new InputStreamReader (fis);
   		    br  = new BufferedReader (isr);
   		    String data = null;
   		    for(int i=0;i<order+1;i++) {
   		    	data = br.readLine();
   		    }
   		    String[] a = data.split(",");
   		    
   		    Software = a[13];
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
   	    return Software;
       }
    
     String read_Gongza( int order )throws IOException {
        	Reader isr;
    	    InputStream fis;
    	    BufferedReader br = null;
    	    
    	    try {
    	    	
    	    	fis = new FileInputStream ("./profile.csv");
    	    	isr = new InputStreamReader (fis);
    		    br  = new BufferedReader (isr);
    		    String data = null;
    		    for(int i=0;i<order+1;i++) {
    		    	data = br.readLine();
    		    }
    		    String[] a = data.split(",");
    		    
    		    Gongza = a[14];
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
    	    return Gongza;
        }
     
     String read_Condition( int order )throws IOException {
     	Reader isr;
 	    InputStream fis;
 	    BufferedReader br = null;
 	    
 	    try {
 	    	
 	    	fis = new FileInputStream ("./profile.csv");
 	    	isr = new InputStreamReader (fis);
 		    br  = new BufferedReader (isr);
 		    String data = null;
 		    for(int i=0;i<order+1;i++) {
 		    	data = br.readLine();
 		    }
 		    String[] a = data.split(",");
 		    
 		    Condition = a[15];
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
 	    return Condition;
     }
     
     String read_Rest_reason( int order )throws IOException {
      	Reader isr;
  	    InputStream fis;
  	    BufferedReader br = null;
  	    
  	    try {
  	    	
  	    	fis = new FileInputStream ("./profile.csv");
  	    	isr = new InputStreamReader (fis);
  		    br  = new BufferedReader (isr);
  		    String data = null;
  		    for(int i=0;i<order+1;i++) {
  		    	data = br.readLine();
  		    }
  		    String[] a = data.split(",");
  		    
  		    Rest_reason = a[16];
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
  	    return Rest_reason;
      }
    
}

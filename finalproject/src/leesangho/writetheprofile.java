package leesangho;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class writetheprofile extends readtheprofile {
	
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
    
    void write_ID( String id , int order ) throws FileNotFoundException {
    	
    	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try{
	    	    	
	    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
	        osw = new OutputStreamWriter (fos);
            bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
            for(int i=0;i<21;i++) {
            	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<17;j++) {
            		if(i==(order)&&j==4) {
            			bw.write(id);
            			if(j!=16) {
             			   bw.write(",");
             			}
            		}
            		else {
            		  bw.write(a[j]);
            		  if(j==16)
            			break;
            		  bw.write(",");
            		}
            	}
            	bw.newLine();
            }
        	br.close();
        	bw.close();
        	
	    }
	    catch(IOException e){
	    	
	    }
	    
    }
    
    void write_Password( String password , int order )throws FileNotFoundException {
    	
    	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try{
	    	    	
	    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	    	
	    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
	        osw = new OutputStreamWriter (fos);
            bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
	        for(int i=0;i<21;i++) {
            	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<17;j++) {
            		if(i==(order)&&j==5) {
            			bw.write(password);
            			if(j!=16) {
             			   bw.write(",");
             			}
            		}
            		else {
            		  bw.write(a[j]);
            		  if(j==16)
            			break;
            		  bw.write(",");
            		}
            	}
            	bw.newLine();
            }
        	bw.close();
        	br.close();
		    	        
	    }
	    catch(IOException e){
	    	
	    }
	    
    	
    }
    
    
    
    
  void write_Position ( String position ,int order ) throws FileNotFoundException {
    	
    	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try{
	    	    	
	    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
	        osw = new OutputStreamWriter (fos);
            bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
	        for(int i=0;i<21;i++) {
            	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<17;j++) {
            		if(i==(order)&&j==6) {
            			bw.write(position);
            			if(j!=16) {
            			   bw.write(",");
            			}
            		}
            		else {
            		  bw.write(a[j]);
            		  if(j==16)
            			break;
            		  bw.write(",");
            		}
            	}
            	bw.newLine();
            }
        	bw.close();
        	br.close();
		    	        
	    }
	    catch(IOException e){
	    	
	    }
	    
    }
  
  
  void write_Question_number ( int question_number ,int order ) throws FileNotFoundException {
  	
  	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try{
	    	    	
	    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
	        osw = new OutputStreamWriter (fos);
          bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
	        for(int i=0;i<21;i++) {
          	data=br.readLine();
          	a = data.split(",");
          	for(int j=0;j<17;j++) {
          		if(i==(order)&&j==7) {
          			bw.write(Integer.toString(question_number));
          			if(j!=16) {
          			   bw.write(",");
          			}
          		}
          		else {
          		  bw.write(a[j]);
          		  if(j==16)
          			break;
          		  bw.write(",");
          		}
          	}
          	bw.newLine();
          }
      	bw.close();
      	br.close();
		    	        
	    }
	    catch(IOException e){
	    	
	    }
	    
  }
  void write_Answer ( String answer ,int order ) throws FileNotFoundException {
  	
  	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try{
	    	    	
	    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
	        osw = new OutputStreamWriter (fos);
          bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
	        for(int i=0;i<21;i++) {
          	data=br.readLine();
          	a = data.split(",");
          	for(int j=0;j<17;j++) {
          		if(i==(order)&&j==8) {
          			bw.write(answer);
          			if(j!=16) {
          			   bw.write(",");
          			}
          		}
          		else {
          		  bw.write(a[j]);
          		  if(j==16)
          			break;
          		  bw.write(",");
          		}
          	}
          	bw.newLine();
          }
      	bw.close();
      	br.close();
		    	        
	    }
	    catch(IOException e){
	    	
	    }
	    
  }
  
  
  void write_Math ( String math ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
				isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<21;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<17;j++) {
	          		if(i==(order)&&j==10) {
	          			bw.write(math);
	          			if(j!=16) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==16)
	          			break;
	          		  bw.write(",");
	          		}
	          	}
	          	bw.newLine();
	          }
	      	bw.close();
	      	br.close();
			    	        
		    }
		    catch(IOException e){
		    	
		    }
		    
	  }
    
  void write_Physics ( String physics ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
				isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<21;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<17;j++) {
	          		if(i==(order)&&j==11) {
	          			bw.write(physics);
	          			if(j!=16) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==16)
	          			break;
	          		  bw.write(",");
	          		}
	          	}
	          	bw.newLine();
	          }
	      	bw.close();
	      	br.close();
			    	        
		    }
		    catch(IOException e){
		    	
		    }
		    
	  }
  
  void write_Chemisty ( String chemistry ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
				isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<21;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<17;j++) {
	          		if(i==(order)&&j==12) {
	          			bw.write(chemistry);
	          			if(j!=16) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==16)
	          			break;
	          		  bw.write(",");
	          		}
	          	}
	          	bw.newLine();
	          }
	      	bw.close();
	      	br.close();
			    	        
		    }
		    catch(IOException e){
		    	
		    }
		    
	  }
  
  void write_Software ( String software ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
				isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<21;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<17;j++) {
	          		if(i==(order)&&j==13) {
	          			bw.write(software);
	          			if(j!=16) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==16)
	          			break;
	          		  bw.write(",");
	          		}
	          	}
	          	bw.newLine();
	          }
	      	bw.close();
	      	br.close();
			    	        
		    }
		    catch(IOException e){
		    	
		    }
		    
	  }
  
  void write_Gongza ( String gongza ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
				isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<21;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<17;j++) {
	          		if(i==(order)&&j==14) {
	          			bw.write(gongza);
	          			if(j!=16) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==16)
	          			break;
	          		  bw.write(",");
	          		}
	          	}
	          	bw.newLine();
	          }
	      	bw.close();
	      	br.close();
			    	        
		    }
		    catch(IOException e){
		    	
		    }
		    
	  }
  
  void write_Condition ( String condition ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
				isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<21;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<17;j++) {
	          		if(i==(order)&&j==15) {
	          			bw.write(condition);
	          			if(j!=16) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==16)
	          			break;
	          		  bw.write(",");
	          		}
	          	}
	          	bw.newLine();
	          }
	      	bw.close();
	      	br.close();
			    	        
		    }
		    catch(IOException e){
		    	
		    }
		    
	  }
  
  void write_Rest_reason ( String rest_reason ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
				isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<21;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<17;j++) {
	          		if(i==(order)&&j==16) {
	          			bw.write(rest_reason);
	          			if(j!=16) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==16)
	          			break;
	          		  bw.write(",");
	          		}
	          	}
	          	bw.newLine();
	          }
	      	bw.close();
	      	br.close();
			    	        
		    }
		    catch(IOException e){
		    	
		    }
		    
	  }
    
    void changecsvfile() throws IOException {
    	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try {
			
	    	fis = new FileInputStream("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\newprofile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("C:\\\\Users\\\\heesun\\\\Desktop\\\\finalproject\\\\src\\\\leesangho\\\\profile.csv");
	        osw = new OutputStreamWriter (fos);
	        bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        for(int i=0;i<21;i++){
	        	data=br.readLine();
	        	a = data.split(",");
	        	for(int j=0;j<17;j++) {
	            	bw.write(a[j]);
	            	if(j==16)
	            		break;
	            	bw.write(",");
	        	}
	        	if(i==20)
	        		break;
	        	bw.newLine();
	        }
	        bw.close();
        	br.close();  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
    }

}

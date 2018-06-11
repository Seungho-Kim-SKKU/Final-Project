package leesangho;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class writetheprofile {
	
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
            	for(int j=0;j<10;j++) {
            		if(i==(order)&&j==4) {
            			bw.write(id);
            			if(j!=9) {
             			   bw.write(",");
             			}
            		}
            		else {
            		  bw.write(a[j]);
            		  if(j==9)
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
            	for(int j=0;j<10;j++) {
            		if(i==(order)&&j==5) {
            			bw.write(password);
            			if(j!=9) {
             			   bw.write(",");
             			}
            		}
            		else {
            		  bw.write(a[j]);
            		  if(j==9)
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
            	for(int j=0;j<10;j++) {
            		if(i==(order)&&j==6) {
            			bw.write(position);
            			if(j!=9) {
            			   bw.write(",");
            			}
            		}
            		else {
            		  bw.write(a[j]);
            		  if(j==9)
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
          	for(int j=0;j<10;j++) {
          		if(i==(order)&&j==7) {
          			bw.write(Integer.toString(question_number));
          			if(j!=9) {
          			   bw.write(",");
          			}
          		}
          		else {
          		  bw.write(a[j]);
          		  if(j==9)
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
          	for(int j=0;j<10;j++) {
          		if(i==(order)&&j==8) {
          			bw.write(answer);
          			if(j!=9) {
          			   bw.write(",");
          			}
          		}
          		else {
          		  bw.write(a[j]);
          		  if(j==9)
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
	        	for(int j=0;j<10;j++) {
	            	bw.write(a[j]);
	            	if(j==9)
	            		break;
	            	bw.write(",");
	        	}
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

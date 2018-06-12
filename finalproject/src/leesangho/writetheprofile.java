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
    String Rest_count;
    String Major;
    int Semester;
    String House_number;
    String Address;
    String Address_details;
    String Post_number;
    String Fore;
    String Phone_number1;
    String Phone_number2;
    
    
    int category_Number=26;
    int person_Number=21; /*실제수보다 1크게 설정*/
    
    void write_ID( String id , int order ) throws FileNotFoundException {
    	
    	
	    
	    
	    
    	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try{
	    	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("./newprofile.csv");
	        osw = new OutputStreamWriter (fos);
            bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
            for(int i=0;i<person_Number;i++) {
            	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<category_Number+1;j++) {
            		if(i==(order)&&j==4) {
            			bw.write(id);
            			if(j!=category_Number) {
             			   bw.write(",");
             			}
            		}
            		else {
            		  bw.write(a[j]);
            		  if(j==category_Number)
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
	    	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	    	
	    	fos = new FileOutputStream ("./newprofile.csv");
	        osw = new OutputStreamWriter (fos);
            bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
	        for(int i=0;i<person_Number;i++) {
            	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<category_Number+1;j++) {
            		if(i==(order)&&j==5) {
            			bw.write(password);
            			if(j!=category_Number) {
             			   bw.write(",");
             			}
            		}
            		else {
            		  bw.write(a[j]);
            		  if(j==category_Number)
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
	    	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("./newprofile.csv");
	        osw = new OutputStreamWriter (fos);
            bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
	        for(int i=0;i<person_Number;i++) {
            	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<category_Number+1;j++) {
            		if(i==(order)&&j==6) {
            			bw.write(position);
            			if(j!=category_Number) {
            			   bw.write(",");
            			}
            		}
            		else {
            		  bw.write(a[j]);
            		  if(j==category_Number)
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
	    	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("./newprofile.csv");
	        osw = new OutputStreamWriter (fos);
          bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
	        for(int i=0;i<person_Number;i++) {
          	data=br.readLine();
          	a = data.split(",");
          	for(int j=0;j<category_Number+1;j++) {
          		if(i==(order)&&j==7) {
          			bw.write(Integer.toString(question_number));
          			if(j!=category_Number){
          			   bw.write(",");
          			}
          		}
          		else {
          		  bw.write(a[j]);
          		  if(j==category_Number)
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
	    	    	
	    	fis = new FileInputStream ("./profile.csv");
	    	isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("./newprofile.csv");
	        osw = new OutputStreamWriter (fos);
          bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
	        for(int i=0;i<person_Number;i++) {
          	data=br.readLine();
          	a = data.split(",");
          	for(int j=0;j<category_Number+1;j++) {
          		if(i==(order)&&j==8) {
          			bw.write(answer);
          			if(j!=category_Number) {
          			   bw.write(",");
          			}
          		}
          		else {
          		  bw.write(a[j]);
          		  if(j==category_Number)
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
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==10) {
	          			bw.write(math);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==11) {
	          			bw.write(physics);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==12) {
	          			bw.write(chemistry);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==13) {
	          			bw.write(software);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==14) {
	          			bw.write(gongza);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	          bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==15) {
	          			bw.write(condition);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==16) {
	          			bw.write(rest_reason);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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
  
  void write_Rest_count ( String rest_count ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==17) {
	          			bw.write(rest_count);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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
 
  void write_Major ( String major ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==18) {
	          			bw.write(major);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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

  void write_Semester ( int semester ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==19) {
	          			bw.write(Integer.toString(semester));
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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

  void write_House_number ( String house_number ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==20) {
	          			bw.write(house_number);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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

  void write_Address ( String address ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==21) {
	          			bw.write(address);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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

  void write_Address_details ( String address_details ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==22) {
	          			bw.write(address_details);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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

  void write_Post_number ( String post_number ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==23) {
	          			bw.write(post_number);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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

  void write_Fore ( String fore ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==24) {
	          			bw.write(fore);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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

  void write_Phone_number1 ( String phone_number1 ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==25) {
	          			bw.write(Phone_number1);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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

  void write_Phone_number2 ( String phone_number2 ,int order ) throws FileNotFoundException {
	  	
	  	Writer osw;
			BufferedWriter bw;
		    OutputStream fos;
		    
		    Reader isr;
		    InputStream fis;
		    BufferedReader br;
		    
		    try{
		    	    	
		    	fis = new FileInputStream ("./profile.csv");
		    	isr = new InputStreamReader (fis);
			    br  = new BufferedReader (isr);
		        
		    	fos = new FileOutputStream ("./newprofile.csv");
		        osw = new OutputStreamWriter (fos);
	            bw  = new BufferedWriter (osw);
		        
		        String data;
		        String[] a;
		        
		        for(int i=0;i<person_Number;i++) {
	          	data=br.readLine();
	          	a = data.split(",");
	          	for(int j=0;j<category_Number+1;j++) {
	          		if(i==(order)&&j==26) {
	          			bw.write(Phone_number1);
	          			if(j!=category_Number) {
	          			   bw.write(",");
	          			}
	          		}
	          		else {
	          		  bw.write(a[j]);
	          		  if(j==category_Number)
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
			
	    	fis = new FileInputStream("./newprofile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
		    fos = new FileOutputStream ("./profile.csv");
		    osw = new OutputStreamWriter (fos);
	        bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        for(int i=0;i<person_Number;i++){
	        	data=br.readLine();
	        	a = data.split(",");
	        	for(int j=0;j<category_Number+1;j++) {
	            	bw.write(a[j]);
	            	if(j==category_Number)
	            		break;
	            	bw.write(",");
	        	}
	        	if(i==person_Number-1)
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

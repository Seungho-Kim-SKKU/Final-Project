
import java.io.*;

public class writetheprofile {
	
    int Order;
    int Student_ID;
    String Name;
    String Resident_Registration_Number;
    String ID;
    String Password;
    int position;
    
    void write_ID( String id , int order ) throws FileNotFoundException {
    	
    	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try{
	    	    	
	    	fis = new FileInputStream("C:\\\\\\\\Users\\\\\\\\heesun\\\\\\\\Desktop\\\\\\\\leesangho\\\\\\\\src\\\\\\\\leesangho\\\\\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\heesun\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\leesangho\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\leesangho\\\\\\\\\\\\\\\\nprofile.csv");
	        osw = new OutputStreamWriter (fos);
            bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
            for(int i=0;i<order;i++) {
            	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<7;j++) {
            		bw.write(a[j]);
            		if(j==6)
            			break;
            		bw.write(",");
            	}
            	bw.newLine();
            }
            data = br.readLine();
		    a = data.split(",");
		    bw.write(a[0]);
		    bw.write(",");
		    bw.write(a[1]);
		    bw.write(",");
		    bw.write(a[2]);
		    bw.write(",");
		    bw.write(a[3]);
		    bw.write(",");
		    
		    bw.write(id);
		    bw.write(",");
		    
		    bw.write(a[5]);
		    bw.write(",");
		    bw.write(a[6]);
		    bw.newLine();
		    
		    for(int i=order+1;i<20;i++) {
		    	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<7;j++) {
            		bw.write(a[j]);
            		if(j==6)
            			break;
              		bw.write(",");
            	}
            	bw.newLine();
		    }
		    data=br.readLine();
        	a = data.split(",");
        	for(int j=0;j<7;j++) {
        		bw.write(a[j]);
        		if(j!=6) {
          		  bw.write(",");
          		}
        	}
        	bw.close();
        	br.close();
	    }
	    catch(IOException e){
	    	
	    }
	    
    }
    
    void password_ID( String password , int order )throws FileNotFoundException {
    	
    	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try{
	    	    	
	    	fis = new FileInputStream("C:\\\\\\\\Users\\\\\\\\heesun\\\\\\\\Desktop\\\\\\\\leesangho\\\\\\\\src\\\\\\\\leesangho\\\\\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\heesun\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\leesangho\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\leesangho\\\\\\\\\\\\\\\\nprofile.csv");
	        osw = new OutputStreamWriter (fos);
            bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
            for(int i=0;i<order;i++) {
            	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<7;j++) {
            		bw.write(a[j]);
            		if(j==6)
            			break;
            		bw.write(",");
            	}
            	bw.newLine();
            }
            data = br.readLine();
		    a = data.split(",");
		    bw.write(a[0]);
		    bw.write(",");
		    bw.write(a[1]);
		    bw.write(",");
		    bw.write(a[2]);
		    bw.write(",");
		    bw.write(a[3]);
		    bw.write(",");
		    bw.write(a[4]);
		    bw.write(",");
		    
		    bw.write(password);
		    bw.write(",");
		    
		    bw.write(a[6]);
		    bw.newLine();
		    
		    for(int i=order+1;i<20;i++) {
		    	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<7;j++) {
            		bw.write(a[j]);
            		if(j==6)
            			break;
              		bw.write(",");
            	}
            	bw.newLine();
		    }
		    data=br.readLine();
        	a = data.split(",");
        	for(int j=0;j<7;j++) {
        		bw.write(a[j]);
        		if(j!=6) {
          		  bw.write(",");
          		}
        	}
        	bw.close();
        	br.close();
		    	        
	    }
	    catch(IOException e){
	    	
	    }
	    
    	
    }
    
    void write_position ( int position ,int order ) throws FileNotFoundException {
    	
    	Writer osw;
		BufferedWriter bw;
	    OutputStream fos;
	    
	    Reader isr;
	    InputStream fis;
	    BufferedReader br;
	    
	    try{
	    	    	
	    	fis = new FileInputStream("C:\\\\\\\\Users\\\\\\\\heesun\\\\\\\\Desktop\\\\\\\\leesangho\\\\\\\\src\\\\\\\\leesangho\\\\\\\\profile.csv");
			isr = new InputStreamReader (fis);
		    br  = new BufferedReader (isr);
	        
	    	fos = new FileOutputStream ("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\heesun\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\leesangho\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\leesangho\\\\\\\\\\\\\\\\nprofile.csv");
	        osw = new OutputStreamWriter (fos);
            bw  = new BufferedWriter (osw);
	        
	        String data;
	        String[] a;
	        
            for(int i=0;i<order;i++) {
            	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<7;j++) {
            		bw.write(a[j]);
            		if(j==6)
            			break;
            		bw.write(",");
            	}
            	bw.newLine();
            }
            data = br.readLine();
		    a = data.split(",");
		    bw.write(a[0]);
		    bw.write(",");
		    bw.write(a[1]);
		    bw.write(",");
		    bw.write(a[2]);
		    bw.write(",");
		    bw.write(a[3]);
		    bw.write(",");	    
		    bw.write(a[4]);
		    bw.write(",");
		    bw.write(a[5]);
		    bw.write(",");
		    
		    bw.write(position);
		    bw.newLine();
		    
		    for(int i=order+1;i<20;i++) {
		    	data=br.readLine();
            	a = data.split(",");
            	for(int j=0;j<7;j++) {
            		bw.write(a[j]);
            		if(j==6)
            			break;
              		bw.write(",");
            	}
            	bw.newLine();
		    }
		    data=br.readLine();
        	a = data.split(",");
        	for(int j=0;j<7;j++) {
        		bw.write(a[j]);
        		if(j!=6) {
          		  bw.write(",");
          		}
        	}
        	bw.close();
        	br.close();
		    	        
	    }
	    catch(IOException e){
	    	
	    }
	    
    }
    
    
    
	
}

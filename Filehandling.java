package Assistedpracticeproject2;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Filehandling{
	public static void write() throws IOException {
	    File file=new File("C:\\Users\\admin\\jeniferjava\\filehandling");
	    
	    //Write
	    FileWriter writer=new FileWriter(file);
	    writer.write("COLLEGE LIFE IS THE BEST LIFE");
	    writer.close();
	    
	    if(file.createNewFile()) {
			System.out.println("File is Created");
		 }
		else {
			System.out.println("File  is already Exist");
		 }
		}
		
	    //Read
		public static void read()throws IOException{
	    FileReader reader=new FileReader("C:\\Users\\admin\\jeniferjava\\filehandling");
	    int data;
	     while((data=reader.read())!=-1) {
	    	System.out.print((char) data);
	     }
		}
		
		//Append
	    public static void append() throws IOException{
	    	Path path=Paths.get("C:\\Users\\admin\\jeniferjava\\filehandling");
	    	System.out.println("\n");
	    	String appendString=",WE ARE MISSING CLG LIFE(APPENDED LINE)";
	    	byte input[]=appendString.getBytes();
	    	
	    	Files.write(path, input, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	    	System.out.println("Date written successfully");
	    	read();
	    }
	    
		public static void main(String[] args) {
			try{
				 write();
				 read();
				 append();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

}



package codeinteracts.level2.oop.encapsulation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingFile {
	private static void readAndWriteByte() {

		 try {
	            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\rushm\\OneDrive\\Desktop\\md.pub");
	            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\rushm\\OneDrive\\Desktop\\md1.pub");

	            int number;

	            while ((number = fileInputStream.read()) != -1){
	                fileOutputStream.write(number);
	            }
	            fileOutputStream.flush();
	            fileInputStream.close();
	            fileOutputStream.close();
	            
	            

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	public static void main(String[] args) {

		System.out.println("Read using Byte streams");
		readAndWriteByte();
	}
}

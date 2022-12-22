package FileReadAndWrite;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteFile {
	String data;
	
	public static void writeFile(String fileName, String data) {
		try {
			FileWriter fileWrite = new FileWriter("C:\\Users\\rushm\\OneDrive\\Desktop\\" + "\\" + fileName);
			fileWrite.write(data);
			System.out.println("Data Written Sucessfully");
			fileWrite.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any words to write in createdd file");
		String data = scan.nextLine();
		writeFile(fileName, data);
	}

}

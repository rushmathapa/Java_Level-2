package FileReadAndWrite;

import java.io.File;
import java.util.Scanner;

public class CreatePathDirectory {
	String folderName;

	public static void createDirectory(String folderName) {
		File myFile = new File("C:\\Users\\rushm\\OneDrive\\Desktop\\" + "\\" + folderName);
		try {
			if (myFile.mkdir()) {
				System.out.println("Folder is created");
			} else {
				System.out.println("folder is not created ");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter folder name");
		String folderName = scan.nextLine();
		createDirectory(folderName);
	}

}

package FileReadAndWrite;

import java.io.File;
import java.util.Scanner;

public class CreateFileInFolderDesktop extends CreatePathDirectory {
	String fileName;
	

	public static void createFile(String fileName) {
		File file = new File("C:\\Users\\rushm\\OneDrive\\Desktop\\rst" + "\\" + fileName);
		try {
			if (file.createNewFile()) {
				System.out.println(fileName + "File is created inside folder" + "\\");
			} else {
				System.out.println("File is not created ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter file Name");
		String fileName = scan.nextLine();
		createFile(fileName);
	}

}

package FileReadAndWrite;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateDirectory {

	public static void createDirectory(String folderName) {

		try {
			File file = new File("C:\\Users\\rushm\\OneDrive\\Desktop\\" + "\\" + folderName);
			if (file.mkdir()) {
				System.out.println(folderName + "Folder is created");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createFiles(String folderName, String fileName) {
		try {
			File file = new File("C:\\Users\\rushm\\OneDrive\\Desktop\\" + "\\" + folderName + "\\" + fileName);
			if (file.createNewFile()) {
				System.out.println(fileName + "File created inside " + folderName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void countFileAndDirectory(String folderName) {
		try {

			File file = new File("C:\\Users\\rushm\\OneDrive\\Desktop\\" + "\\" + folderName);
			Integer folderLength = file.list().length;
			System.out.println("Total files and Directories in " + folderName + ". " + folderLength);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeFile(String fileName, String data) {
		try {
			FileWriter fileWrite = new FileWriter("C:\\Users\\rushm\\OneDrive\\Desktop\\" + "\\" + "\\" + fileName + data);
			fileWrite.write(data);
			System.out.println("Data is written in file sucessfully");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public static void deleteFileAndDirectory(String folderName, String fileName
	// )

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter folder name:");
		String folderName = scan.nextLine();
		createDirectory(folderName);

		System.out.println();

		System.out.println("Enter file 1 name:");
		String fileName = scan.nextLine();
		createFiles(folderName, fileName);
		System.out.println();

		System.out.println("Enter file 2 name:");
		String fileName2 = scan.nextLine();
		createFiles(folderName, fileName2);
		System.out.println();

		System.out.println("Enter file 3 name");
		String file3 = scan.nextLine();
		createFiles(folderName, file3);

	}

}

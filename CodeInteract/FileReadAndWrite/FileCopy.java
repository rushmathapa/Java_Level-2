package FileReadAndWrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		{
			try {
				FileReader inFile = new FileReader("input.txt");
				FileWriter outFile = new FileWriter("output.txt");
				int ch;
				while ((ch = inFile.read()) != -1) {
					outFile.write(ch);
				}
				System.out.println("Sucessfully copied");
				inFile.close();
				outFile.close();
			} catch (FileNotFoundException e) {
				System.out.println("Error");
			}

		}
	}
}

package pavanSDET_QA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;
//https://www.youtube.com/watch?v=M8xFzcWiORE&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=29
public class Java29ReadDataFromTextFile {
	@Test
	public void fileReaderAndBufferReader() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\hossa\\Test123.txt");

		BufferedReader br = new BufferedReader(fr);
		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);

		}
		br.close();

	}

	@Test
	public void fileAndScanner() throws IOException {
		File file = new File("C:\\Users\\hossa\\Test123.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());

		}
		sc.close();

	}

	@Test
	public void useDelimiter() throws IOException {
		File file = new File("C:\\Users\\hossa\\Test123.txt");

		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		sc.close();
	}
}

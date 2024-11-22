package pavanSDET_QA;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//https://www.youtube.com/watch?v=wMR6fTe2B-U&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=30
public class Java30WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\hossa\\Test123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Selenium with Java, ");
		bw.write("Selenium with Python, ");
		bw.write("Selenium with C#, ");
		bw.write("Selenium with .net");
		System.out.println("Finished!!!!!");
		bw.close();

	}

}
 
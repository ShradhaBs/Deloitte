package pro8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[] args) throws IOException {
		String fs=File.separator;//to get the separator of the operating system in which its used
		File file=new File("C:"+fs+"Deloitte"+fs+"Batch"+fs+"doc.txt");//to replace '\\' in ("C:\\Deloitte\\Batch\\doc.txt");
		System.out.println("done");
		
		//to read contents of a file
		
		FileReader reader=new FileReader(file);
		int i=0;
		while((i=reader.read()) != -1) {
			System.out.println((char)i);
			
		}
		reader.close();
	}
}

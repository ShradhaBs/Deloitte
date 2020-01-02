package pro8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readndwrite {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Deloitte\\Batch\\doc.txt");
	FileReader reader=new FileReader(file);
	FileWriter fw=new FileWriter("C:\\Deloitte\\Batch\\assn.txt");
	int i=0;
	while((i=reader.read()) != -1) {
		fw.write((char)i);
		
	}
	reader.close();
	fw.close();
}
}


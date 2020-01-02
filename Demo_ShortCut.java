package pro8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Demo_ShortCut {
public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("C:\\Deloitte\\Batch\\doc.txt")));
	BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(new File("C:\\Deloitte\\Batch\\assn.txt")));
	int i=0;
	while((i=bufferedReader.read()) != -1) {
		bufferedWriter.write((char)i);
		
	}
	bufferedReader.close();
	bufferedWriter.close();
}
}

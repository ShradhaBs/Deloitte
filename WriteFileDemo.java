package pro8;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("C:\\Deloitte\\Batch\\doc.txt");
	fw.write("hello");
	fw.close();
	System.out.println("done");
}
}

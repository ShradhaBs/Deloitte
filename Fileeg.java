package pro8;

import java.io.File;
import java.io.IOException;

public class Fileeg {
	public static void main(String[] args) throws IOException {
		
	
File file1=new File("C:\\deloitte\\Batch");
File file2=new File("C:\\deloitte\\Batch\\BatchMates.txt");
File filesList[] = file1.listFiles();
for(File file : filesList) {
    if (file.isFile()) {
    	System.out.println("file is"+file);
    	
    }
    else if(file.isDirectory()) {
    	System.out.println("directory is:"+file);
    }
}
//checking if file exists
if(file1.exists()){
	System.out.println("File is there");
}
else {
	file1.mkdirs();
	file2.createNewFile();
	System.out.println("new file created");
}
	}
}


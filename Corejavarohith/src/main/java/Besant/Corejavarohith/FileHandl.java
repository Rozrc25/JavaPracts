package Besant.Corejavarohith;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileHandl {
	
	String filepath = "D:\\java\\Firstroz\\src\\main\\java\\Aserts\\data.txt";

//	public void ReadData() throws IOException
//	{
//		File f = new File(filepath);
//		FileInputStream FS = new FileInputStream(f);
//		int i;
//		while((i=FS.read())!=-1)
//		{
//			System.out.print((char)i);
//		}
//	}
	
	public void ChkWd() throws IOException {
		
	        String searchWord = "rohith";
	        File file = new File(filepath);
	        FileInputStream frc = new FileInputStream(file);
	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);
	        String line;
	        int lineNumber = 0;
	        boolean found = false;
	        
	        while ((line = br.readLine()) != null) {
	            lineNumber++;
	            String[] words = line.split(" ");
	            for (int i = 0; i < words.length; i++) {
	                if (words[i].equals(searchWord)) {
	                    found = true;
	                    System.out.println("Word found at line " + lineNumber + ", position " + (i + 1));
	                }
	            }
	        }
	        if (!found) {
	            System.out.println("Word not found in the file.");
	        }
	        br.close();
	        fr.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileHandl FC = new FileHandl();
		FC.ChkWd();
	}

}

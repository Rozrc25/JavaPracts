package Besant.Corejavarohith;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharChkFromFile {


	String filepath = "D:\\java\\Firstroz\\src\\main\\java\\Aserts\\data.txt";
	
	private static int countOccurrences(String line, char letter) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
	
	public void ReadCharFromFileAndChk() throws IOException, InterruptedException
	{
		
//			System.out.print((char)i);
//			Thread.sleep(500);      this will work as timeout delays the output
		
	        char searchLetter = 'o';
	        int totalOccurrences = 0;

	        File file = new File(filepath);
	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);

	        String line;
	        while ((line = br.readLine()) != null) {
	            line = line.toLowerCase();
	            int occurrencesInLine = countOccurrences(line, searchLetter);
	            totalOccurrences += occurrencesInLine;
	        }

	       if (totalOccurrences > 0) {
	            System.out.println("Total occurrences of letter '" + searchLetter + "': " + totalOccurrences);
	        } else {
	            System.out.println("Letter '" + searchLetter + "' not found in the file.");
	        }

	        br.close();
	        fr.close();
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		CharChkFromFile Ck = new CharChkFromFile();
		Ck.ReadCharFromFileAndChk();
	}

}

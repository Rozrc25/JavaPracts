package Besant.Corejavarohith;


public class StringRev {

	 
	public static void main(String[] args) {
	            String name = "Besant Technology Tambram";
	            
	            String[] words = name.split(" ");
	            
	           char[] charary = words[1].toCharArray();
	            
	           for(int i=charary.length-1;i>=0;i--) {
	        	   System.out.print(charary[i]);
	           }
	            
	        }

}
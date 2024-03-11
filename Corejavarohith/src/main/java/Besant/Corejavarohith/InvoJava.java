package Besant.Corejavarohith;

public class InvoJava {
	
	public void Extsion(String name){
		
		String ext = name.substring(name.lastIndexOf('.') + 1).toLowerCase();
//		String[] files = {"java","txt","Cpp","c","py","r","mp3","mp4"};
//		if(ext.equals(name)== files) {
//			System.out.println("Given file is of " + ext +" type: " + name);
//		}else {
//			System.out.println("give valid file file");
//		}
		
		switch(ext.toLowerCase()) {
			case "txt":
				System.out.println("Given file is a text file: " + name);
				break;
			case "java":
				System.out.println("Given file is a Java file: " + name);
				break;
			case "zip":
				System.out.println("Given file is a zip file: " + name);
				break;
			default:
				System.out.println("Given file is of " + ext +" type: " + name);
				break;
		}	
}

	public static void main(String[] args) {
	InvoJava In = new InvoJava();
	In.Extsion("hel.java");
}

	}
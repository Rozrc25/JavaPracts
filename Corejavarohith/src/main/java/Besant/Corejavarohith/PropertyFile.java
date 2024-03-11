package Besant.Corejavarohith;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	String filepath= "C:\\rohith\\fullstack java\\Corejavarohith\\src\\main\\java\\assert\\env.properties";
	public void ReadProperty() throws IOException
	{
		File f = new File(filepath);
		FileInputStream FS = new FileInputStream(f);
		Properties p = new Properties();
		p.load(FS); // it is used to understand the java to read as key value pair

		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		p.setProperty("address", "Tambaram");
		System.out.println(p.getProperty("address"));

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyFile P1= new PropertyFile();
		P1.ReadProperty();
	}

}

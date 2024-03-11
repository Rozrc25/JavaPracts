package Besant.Corejavarohith;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWrite {

	String filepath = "C:\\rohith\\fullstack java\\Corejavarohith\\src\\main\\java\\assert\\StudentData.xlsx";
	String[] name= {"sathish","raja","vicky","dinesh"};

	int[] age = new int[5];

	public void WriteData() throws IOException
	{
		File F = new File(filepath);
		FileOutputStream Fs = new FileOutputStream(F);

		XSSFWorkbook wbk = new XSSFWorkbook();
		Sheet sh =wbk.createSheet("Result");
		Row eachRow = sh.createRow(0);
		Row eachRow1 = sh.createRow(1);
		Cell eachCell = eachRow.createCell(0);
		eachCell.setCellValue("Sathish");
		Cell eachCell1 = eachRow1.createCell(0);
		eachCell1.setCellValue("kumar");
		wbk.write(Fs);
		System.out.println("Done");
	}

	public void WriteDataWithArray() throws IOException
	{
		File F = new File(filepath);
		FileOutputStream Fs = new FileOutputStream(F);

		XSSFWorkbook wbk = new XSSFWorkbook();
		Sheet sh =wbk.createSheet("Result");

		int totalArraySize = name.length;
		for(int i=0;i<totalArraySize;i++)
		{
			Row eachRow = sh.createRow(i);
			Cell eachCell = eachRow.createCell(i);
			eachCell.setCellValue(name[i]);
		}
		wbk.write(Fs);
		System.out.println("Done");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileWrite e = new ExcelFileWrite();
		e.WriteDataWithArray();
	}

}

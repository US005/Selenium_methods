package D40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Excelsx {
//Excel >> WorkBook >> Sheet >> Row >> Cells
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream( System.getProperty("user.dir") + "\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");   // getSheetName(0); by index
		
		int totalrows=sheet.getLastRowNum();
		int totalcell=sheet.getRow(1).getLastCellNum();
		
		
		System.out.println("Total rows" + totalrows);
		System.out.println("Total column" + totalcell);
		
		for(int r=0; r<=totalrows; r++)
		{
			XSSFRow CurrentRow=sheet.getRow(r);
			
			for(int c=0; c<totalcell; c++)
			{
				XSSFCell Cell=CurrentRow.getCell(c);
				System.out.print(Cell.toString() +"\t");
				
			}
			System.out.println();
		}
	}

}

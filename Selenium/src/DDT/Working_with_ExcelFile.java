package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_with_ExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Files/DDT_ExcelData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		//1 way read single data
		Sheet sheet = wb.getSheet("Sheet1");
//		Row row = sheet.getRow(2);
//		Cell cell = row.getCell(1);
//		String value = cell.getStringCellValue();
//		System.out.println(value);
//		
//		//2 way using method Chaining
//		value=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(value);
		
		//To read multiple Data
		int rownum=sheet.getPhysicalNumberOfRows();
		int cellnum=sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 1; i < rownum; i++) {
			for (int j = 0; j < cellnum; j++) {
				String value=sheet.getRow(i).getCell(j).toString();
				System.out.println(value);	
			}	
		}
			
		
	}

}

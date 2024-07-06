package Selenium_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//All the imports arefrom ss usermodel, make sure everything follow the same
public class ExcelSheetProgram_DDT_Hard {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\Thejashwini L\\eclipse-workspace\\Selenium_Basics\\TestData\\Thejashwini_TestData.xlsx");
//creating obj of FileInputStream cls and passed param as location of s=Excel sheet present, 
		//rc on test data >prperties>copy the path and paste above
		Workbook  wb = WorkbookFactory.create(f1);//open the excel sheet using the method Workbookfactory.create method, rt is workbook
		Sheet st = wb.getSheet("login");//provide corret sheet name, rt is sheet
		Row rw = st.getRow(1
				);//given the row co-ords, rt is row
		Cell cl = rw.getCell(1);//given the cell/column co-ords, rt is cell
		String str1 = cl.getStringCellValue();
		System.out.println(str1);
	}
	

}

package Selenium_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetProgram_DDT_Moderate {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1 = new FileInputStream("c:\\Users\\Thejashwini L\\eclipse-workspace\\Selenium_Basics\\TestData\\Thejashwini_TestData.xlsx");
		//creating obj of FileInputStream cls and passed param as location of s=Excel sheet present, 
		//rc on test data >prperties>copy the path and paste above
		Workbook  wb = WorkbookFactory.create(f1);//open the excel sheet using the method Workbookfactory.create method, rt is workbook
		String username = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();//whenever we use many abs method in single line, then the rt is last methid's one
		System.out.println(username);
		
		String pwd = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();//whenever we use many abs method in single line, then the rt is last methid's one
		System.out.println(pwd);
	}

}

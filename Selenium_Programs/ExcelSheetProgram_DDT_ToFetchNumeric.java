package Selenium_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ExcelSheetProgram_DDT_ToFetchNumeric {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("c:\\Users\\Thejashwini L\\eclipse-workspace\\Selenium_Basics\\TestData\\Thejashwini_TestData.xlsx");
		Workbook  wb = WorkbookFactory.create(f1);
		//String username = wb.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		String phonenum = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(2).getNumericCellValue());//we are using this method to get numeric/integer value from excel
		System.out.println(phonenum);
		
		
	}

}

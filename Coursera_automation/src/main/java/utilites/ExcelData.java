package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	
	
	//store course details
	
	// Method to select specific information from an excel spreadsheet
		public static String desiredFile(int desiredsheet, int desiredRow, int desiredCell) {

			XSSFWorkbook wb;
			FileInputStream file;

			try {
				file = new FileInputStream("Login_Credentials.xlsx");
				wb = new XSSFWorkbook(file);
				XSSFSheet sheet = wb.getSheetAt(desiredsheet);
				XSSFRow row = sheet.getRow(desiredRow);
				XSSFCell cell = row.getCell(desiredCell);
				String data = cell.toString();
				wb.close();
				return data;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}

		}
		// Method to send specific information to an excel spreadsheet
	
	
	
	
	
}

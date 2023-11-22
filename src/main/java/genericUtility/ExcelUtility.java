package genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is the generic class for all test data present in excel
 * @author Aniruddha
 */

public class ExcelUtility {
/**
 * This method is a generic method to fetch data from excel
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws Exception
 */
	public String getDataFromExcel(String sheetname , int row , int cell) throws Exception
	{
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		DataFormatter format = new DataFormatter();
		String cellValue =format.formatCellValue(sh.getRow(row).getCell(cell));
		return cellValue;
	}
}

package util;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUtil {

	public Object[][] readExcel()
	{
		String data[][]=null;
		try {
			// TODO Auto-generated method stub
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\LoginData.xls");
			Workbook wBook = new HSSFWorkbook(fis);
			Sheet s = wBook.getSheet("Sheet1");

			int rowCount = s.getPhysicalNumberOfRows();
			data=new String[rowCount][2];
			for (int i = 0; i < rowCount; i++) {
				
				Row r = s.getRow(i);
				Cell username = r.getCell(0);
				Cell pass = r.getCell(1);
				System.out.println(username.getStringCellValue() + "\t" + pass.getStringCellValue());
				data[i][0]=username.getStringCellValue();
				data[i][1]=pass.getStringCellValue();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}

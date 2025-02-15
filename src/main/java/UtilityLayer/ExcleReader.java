package UtilityLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcleReader extends BaseClass {

	private static XSSFSheet sheet;

	public ExcleReader(String excleSheetPath, String sheetName) throws IOException {
		FileInputStream file = new FileInputStream(excleSheetPath);
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		sheet = workBook.getSheet(sheetName);

	}

	public Object getCellValue(int row, int cell) {
		XSSFCell cells = sheet.getRow(row).getCell(cell);

		if (cells == null || cells.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
			return " ";
		} else {
			if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {
				return cells.getStringCellValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
				return cells.getRawValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
				return cells.getBooleanCellValue();
			} else {
				return "Please check excel sheet test data format";
			}
		}
	}

	public List<Map<String, Object>> readExcelData() {
		int rowCount = sheet.getLastRowNum() + 1;
		int colCount = sheet.getRow(0).getLastCellNum();

		List<Map<String, Object>> testData = new ArrayList<Map<String, Object>>();

		for (int i = 0; i < rowCount; i++) {

			Map<String, Object> ColumData = new LinkedHashMap<String, Object>();

			for (int j = 0; j < colCount; j++) {
				String columName = getCellValue(0, j).toString();
				Object columValue = getCellValue(i, j);
				ColumData.put(columName, columValue);
			}
			testData.add(ColumData);
		}
		return testData;
	}

}

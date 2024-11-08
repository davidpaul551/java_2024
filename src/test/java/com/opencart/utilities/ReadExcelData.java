package com.opencart.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import com.opencart.testdata.*;

public class ReadExcelData {
	@DataProvider(name="login")
	public String[][] readdatafromexcel() throws IOException {
		String[][] data = new String[2][2];
		FileInputStream input = new FileInputStream("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\Login.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(input);

        // Print available sheet names for debugging
        System.out.println("Available sheets:");
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            System.out.println(workbook.getSheetName(i));
        }

        // Check if the sheet exists
        Sheet sheet = workbook.getSheet("Login");
        if (sheet == null) {
            System.out.println("The sheet 'Login' was not found in the Excel file.");
            workbook.close();
            
        }

        int noofrows = sheet.getPhysicalNumberOfRows();
        System.out.println("Rows: " + noofrows);

        for (int i = 0; i < noofrows; i++) {
            //String url = sheet.getRow(i).getCell(0).getStringCellValue();
            String uname = sheet.getRow(i).getCell(1).getStringCellValue();
            String pword = sheet.getRow(i).getCell(2).getStringCellValue();
            data[i][0]=uname;
            data[i][1]=pword;

           // System.out.println("URL: " + url);
            System.out.println("Username: " + uname);
            System.out.println("Password: " + pword);

	}
        return data;

}
}

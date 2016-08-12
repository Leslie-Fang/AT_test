package Utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ReadAndWriteExcel {
    public XSSFSheet ExcelWSheet;
    public XSSFWorkbook ExcelWBook;

    //Constructor to connect to the Excel with sheetname and Path
    public ReadAndWriteExcel(String Path, String SheetName) throws Exception
    {
        try
        {
            // Open the Excel file
            FileInputStream ExcelFile = new FileInputStream(Path);
            // Access the required test data sheet
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
        }
        catch (Exception e)
        {
            throw (e);
        }
    }


    //This method to get the data and get the value as strings.
    public String getCellDataAsString(int RowNum, int ColNum) throws Exception
    {
        try
        {
            String cellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
            System.out.println("The value of CellData " + cellData);
            return cellData;
        }
        catch (Exception e)
        {
            return "Errors in Getting Cell Data";
        }
    }


    //This method to get the data and get the value as number.
    public double getCellDataAsNumber(int RowNum, int ColNum) throws Exception
    {
        try
        {
            double cellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
            System.out.println("The value of CellData " + cellData);
            return cellData;
        }
        catch (Exception e)
        {
            return 000.00;
        }
    }



    public void updateCellDataAsString(int RowNum, int ColNum, String str, String Path)
            throws Exception {
        try {
            ExcelWSheet.getRow(RowNum).getCell(ColNum).setCellValue(str);

            FileOutputStream fos = new FileOutputStream(Path);
            ExcelWBook.write(fos);
            fos.close();
        } catch (Exception e) {
            throw (e);
        }
    }
}

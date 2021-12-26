//package data;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.DataProvider;
//
//import com.opencsv.CSVReader;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class CSVHandler {
//	CSVReader reader;
//	
//	public void getElementLocators() throws FileNotFoundException
//	{
//	
//	
//	
//	 String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data\\SearchWord.csv";
//	  reader = new CSVReader(new FileReader(CSV_file));
//	
//	StringBuffer buffer = new StringBuffer();
//	
//	String elements[][];
//	
//	while( (elements = reader.readNext()) != null)
//	{
//	
//	
//	
//	
//	
//	
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	  private static XSSFWorkbook workbook;
////	  private static XSSFSheet sheet;
////	  public Object[][] objectIDs;
////	  public static BufferedReader csvReader;
////
////	  public void readExcelSheet(String sheetName) {
////
////
////	     try {
////	        FileInputStream fis = new FileInputStream(FilePaths.elementLocators_FilePath);
////
////	        workbook = new XSSFWorkbook(fis);
////	        sheet = workbook.getSheet(sheetName);
////
////	     } catch (Exception e) {
////	        e.printStackTrace();
////	     }
////
////	  }
////
////	  public Object[][] readObjectIDsFromCSVSheet(String sheetName) throws IOException, IOException {
////
////	     int totalRows = getCSVRowCount(sheetName);
////	     int rowCount = 0;
////	     String[][] csvData = new String[totalRows][2];
////	     objectIDs = new String[totalRows][2];
////
////	     BufferedReader csvReader = new BufferedReader(new FileReader(FilePaths.elementLocators_FilePath + ".csv"));
////
//////	     String line;
////	     int i=0;
////     while ((line = csvReader.readLine()) != null) {
//////
//////	        System.out.println(i);
//////	        System.out.println(line);
//////
//////
//////	        i++;
//////	        line = line.replace("\"\"", "\"");
//////	        csvData[rowCount] = line.split(",");
//////
//////	        String objectName = csvData[rowCount][0].toString();
//////	        if (objectName.startsWith("\"")){
//////	           objectName = objectName.substring(0);
//////	        }
//////	        String androidID = csvData[rowCount][4].toString();
//////	        if(androidID.startsWith("\"") & androidID.endsWith("\"")){
//////	           androidID = androidID.substring(1,androidID.length()-1);
//////	        }
//////	        String iosID = csvData[rowCount][6].toString();
//////	        if(iosID.startsWith("\"")) {
//////	           System.out.println("EnteredHereee");
//////
//////	           iosID = iosID.substring(1, iosID.length() - 1);
//////	        }
//////
//////	        String webID = csvData[rowCount][2].toString();
//////	        if(webID.startsWith("\"") & webID.endsWith("\"")){
//////	           webID = webID.substring(1,webID.length()-1);
//////
//////	        }
////
////
////	        objectIDs[0][0] = Locator_key;
////	        objectIDs[0][1] = Locator_value;
////	        objectIDs[0][2] = Find_By;
////	       
////
////	        rowCount++;
////	     }
////	     csvReader.close();
////	     return objectIDs;
////	  }
////
////	  public Object[][] getObjectIDs(String sheetName) {
////	     readExcelSheet(sheetName);
////	     objectIDs = new String[getRowCount(sheetName)][4];
////	     int i = 0;
////	     for (Row myRow : sheet) {
////
////
////	        String objectName = myRow.getCell(0).getStringCellValue();
////	        String androidID = myRow.getCell(4).getStringCellValue();
////	        String iosID = myRow.getCell(6).getStringCellValue();
////	        String webID = myRow.getCell(2).getStringCellValue();
////
////	        objectIDs[i][0] = objectName;
////	        objectIDs[i][1] = androidID;
////	        objectIDs[i][2] = iosID;
////	        objectIDs[i][3] = webID;
////	        i++;
////
////
////	     }
////
////	     return objectIDs;
////	  }
////
////	  public int getRowCount(String sheetName) {
////
////	     int index = workbook.getSheetIndex(sheetName);
////	     if (index == -1)
////	        return 0;
////	     else {
////	        sheet = workbook.getSheetAt(index);
////	        int number = sheet.getLastRowNum() + 1;
////	        return number;
////	     }
////
////	  }
////
////	  public int getCSVRowCount(String sheetName) throws IOException {
////	     BufferedReader csvReader = new BufferedReader(new FileReader(FilePaths.objectIDs_folderPath + sheetName + ".csv"));
////
////	     int rowCount = 0;
////	     String line;
////	     while ((line = csvReader.readLine()) != null) {
////	        rowCount++;
////	     }
////	     System.out.println("Row Count is :"+rowCount);
////	     csvReader.close();
////
////	     return rowCount;
////
////
////	  }
//
//	
//	
//
//}

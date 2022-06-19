package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

 class Utility {

	 // to fetch data from excel sheet
	 
	public static String getDataFromexcelSheet(String sheet,int row,int col)
	{
		String path = "D:\\Desktop\\Book1.xlsx";
		
		
		FileInputStream file =new FileInputStream(path); // Class used to fetch data from external file
														// when we creates its object JVM creates instance of excel	
														// as soon as object created JVM knows where file is
//	    String s=WorkbookFactory.create(file).getSheet("data").getRow(0).getCell(0).getStringCellValue();
//	    System.out.println(s);
	    
	    /* create() ---> this static method helps JVM to open the file
	    				when we add object of FileInputStream upcasting happens
	    */
	    
	    Sheet sheet=WorkbookFactory.create(file).getSheet("Anjali");
	    int lastrow =sheet.getLastRowNum(); // starts from 0.
//	    System.out.println(lastrow);
	    Row row = sheet.getRow(0);
	    int lastcell=row.getLastCellNum();  // implicit casting since short is assigned to  int
	    									// starts from 0
//	    System.out.println(lastcell);
	    
	    String value = row.getCell(1).getStringCellValue();
	    
	    
	    for (int i=0;i<lastrow;i++)
	    {
	    	for (int j=0;j<lastcell;j++)
	    	{
	    		row=sheet.getRow(i);
	    		System.out.print(row.getCell(j).getStringCellValue()+"		");
	    	}
	    	System.out.println();
	    }
	return data;
	
}
	//To take SS
	public static void getScreenShot(WebDriver driver,int testId) throws IOException
	{
		SimpleDateFormat formate =  new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
		Date date = new Date();
		String k =formate.format(date);

		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\ScreenShot Selenium\\anjali"+k+".jpg");
		FileHandler.copy(src, dest);
	}
}
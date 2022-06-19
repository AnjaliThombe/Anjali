package worksheet1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		{
			String path = "D:\\Desktop\\Book1.xlsx";
			
			
			FileInputStream file =new FileInputStream(path); // Class used to fetch data from external file
															// when we creates its object JVM creates instance of excel	
															// as soon as object created JVM knows where file is
//		    String s=WorkbookFactory.create(file).getSheet("data").getRow(0).getCell(0).getStringCellValue();
//		    System.out.println(s);
		    
		    /* create() ---> this static method helps JVM to open the file
		    				when we add object of FileInputStream upcasting happens
		    */
		    
		    Sheet sheet=WorkbookFactory.create(file).getSheet("Anjali");
		    int lastrow =sheet.getLastRowNum(); // starts from 0.
//		    System.out.println(lastrow);
		    Row row = sheet.getRow(0);
		    int lastcell=row.getLastCellNum();  // implicit casting since short is assigned to  int
		    									// starts from 0
//		    System.out.println(lastcell);
		    
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
		}
	}
}
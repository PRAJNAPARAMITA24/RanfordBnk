package excel;

import java.io.File;

import TestBase.Base;
import jxl.Sheet;
import jxl.Workbook;

public class Excel extends Base{

	public static void main(String[] args) {
	String folderpath=GetConfig("excelfolderpath");
	static Sheet sh;
	public static void excelconnection(String filename,String sheetname)
	{
		try {
		File f= new File(folderpath+filename);
		Workbook wb=Workbook.getWorkbook(f);
		sh=wb.getSheet(sheetname);
		}catch(Exception e ) {
		
	}
	{
		
	}
	

	}

}

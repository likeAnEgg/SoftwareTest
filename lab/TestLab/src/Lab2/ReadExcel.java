package Lab2;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {

    public static void main(String[] args) throws Exception{
        //1:����workbook
    	String xlsPath = System.getProperty("user.dir") + "/src/Lab2/students.xls";
        Workbook workbook=Workbook.getWorkbook(new File(xlsPath)); 
        //2:��ȡ��һ��������sheet
        Sheet sheet=workbook.getSheet(0);
        //3:��ȡ����
        //System.out.println("�У�"+sheet.getRows());
        //System.out.println("�У�"+sheet.getColumns());
        int startRow=2;
        int totalnum=sheet.getRows()-startRow;
        totalnum--;//�����һ�п���
        String[][] studentArray=new String[200][4];
        for(int i=startRow;i<sheet.getRows();i++){    	
            for(int j=0;j<sheet.getColumns();j++){
            	Cell cell=sheet.getCell(j,i);
            	studentArray[i-startRow][j]=cell.getContents();              
            }      
        }
        //���һ�����ر���Դ
        workbook.close();
        for(int i=0;i<totalnum;i++){
        	System.out.print("{");
        	for(int j=0;j<4;j++){
        		System.out.print("\""+studentArray[i][j]+"\"");
        		if(j!=3)System.out.print(",");
        	}
        	System.out.println("},");
        }
        
    }
    
    
}
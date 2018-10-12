package dataProviderXls;

import java.util.ArrayList;

public class XlsDataReaderUtil {

    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

    ArrayList<Object[]> myData = new ArrayList<Object[]>();
    try {
        reader = new Xls_Reader("../Generic/src/main/java/dataProviderXls/items.xls");
    }
    catch (Exception e){
        e.printStackTrace();
    }

    for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
        String  items = reader.getCellData("Sheet1", "items",rowNum );
        Object obj[] = {items};
        myData.add(obj);
       }

    return  myData;
   }
}

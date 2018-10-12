package iPhone;

import common.Base;
import dataProviderXls.XlsDataReaderUtil;
import navigate.NavigateUi;
import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

import static common.Base.ad;

/**
 * riadh 09/18
 */
public class TextFieldsTest extends Base {
    @BeforeMethod
    public TextFields textFields() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getTextFields();
        return PageFactory.initElements(ad, TextFields.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }

    //******************** providing data from excel sheet ************************************
    @Test(priority = 5, dataProvider = "supplyDataExcel")
    public void testSearchWithExcelData(String items) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        textFields().writeTextToFields(items);
    }
    //******************** data from script itself ********************************************
    @Test(priority = 1, enabled = true)
    public void testTypeOnFields()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        textFields().writeTextToFields("test123");
    }
}

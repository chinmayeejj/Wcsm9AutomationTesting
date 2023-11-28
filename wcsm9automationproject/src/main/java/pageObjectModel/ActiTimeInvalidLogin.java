package pageObjectModel;

import org.apache.poi.EncryptedDocumentException;

public class ActiTimeInvalidLogin extends BaseTest
{
	public static void main(String[] args) throws EncryptedDocumentException, InterruptedException, Exception 
	{
		BaseTest bt=new BaseTest();
		bt.setUp();
		LoginPage lp=new LoginPage(driver);
		Flib flib =new Flib();
	    int	rowCount=flib.getRowCount(EXCEL_PATH, INVALIDCREDS_SHEET);
		for(int i=1;i<=rowCount;i++)
		{
			//get the method from loginPage class
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH, INVALIDCREDS_SHEET, i, 0), flib.readExcelData(EXCEL_PATH, INVALIDCREDS_SHEET, i, 1));
			
		}
		bt.tearDown();
		
	}

}

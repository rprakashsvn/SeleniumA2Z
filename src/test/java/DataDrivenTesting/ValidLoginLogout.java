package DataDrivenTesting;

import org.testng.annotations.Test;

public class ValidLoginLogout extends SuperClass {

	@Test
	public void verifyLoginWithValidCred() throws InterruptedException {

		// Clicking on Login button
		LoginPage clickLoginBtn = new LoginPage(driver);

		// Reading the data from excel file by the specified path
		String xl = "C:\\Users\\prakash.r\\Desktop\\Data Excel.xlsx";
		String Sheet = "Sheet";
		int rowCount = Excel.getRowCount(xl, Sheet);
		System.out.println("Row Counts : " + rowCount);

		for (int i = 1; i <= rowCount; i++) {
			String UserName = Excel.getCellValue(xl, Sheet, i, 0);
			String Pwd = Excel.getCellValue(xl, Sheet, i, 1);

			// Passing Username and password as parameters
			LoginPage login = new LoginPage(driver);
			login.Login(UserName, Pwd);

			// Submitting the data by clicking on login button
			LoginPage clckLoginBtn = new LoginPage(driver);
			clckLoginBtn.clickLoginBtn();

			/*
			 * // Clicking on setting icon in home page HomePage clckSettingsIcon = new
			 * HomePage(driver); clckSettingsIcon.clickSettingIcon();
			 * 
			 * // Clicking on Logout link in home page HomePage clckLogoutLnk = new
			 * HomePage(driver); clckLogoutLnk.clickLogoutLink(); Thread.sleep(1000);
			 */

			// Again clicking on Login button to continue the loop
			clickLoginBtn.clickLoginBtn();

		}
	}
}
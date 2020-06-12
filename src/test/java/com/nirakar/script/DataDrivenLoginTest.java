package com.nirakar.script;

import org.testng.annotations.Test;

import com.nirakar.UtilityLib.Constants;
import com.nirakar.UtilityLib.GenUtilityLib;
import com.nirakar.poModel.Guru99LoginPage;




public class DataDrivenLoginTest extends BaseClase{
	@Test
	public void  dataDrivenloginTest() throws Exception {
		
		GenUtilityLib genUtilityLib = new GenUtilityLib();
		genUtilityLib.setExcelFile(Constants.Path_TestData + Constants.File_TestData,"Sheet1");
		String sUserName = genUtilityLib.getCellData(1,1 );
		 
		String sPassword = genUtilityLib.getCellData(2, 2);
		
		System.out.println("password="+sPassword);
		System.out.println("username="+sUserName);
		
	Guru99LoginPage loginpageobj = new Guru99LoginPage(driver);
	 loginpageobj.loginToGuru99(sUserName,sPassword );

}
}
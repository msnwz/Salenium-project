package Dataprovider;

import org.testng.annotations.DataProvider;

public class dataprovider {
	
@DataProvider(name="login")
	public String[][] datas() {
		String[][]saar={
				{ "shahnawazm855@gmail.com","ssnwz855"},
				{ "salenium@gmail.com", "salenium@123"},
				{ "ms@gmail.com", "me@123"}
				
		};
		return saar;
	}
}

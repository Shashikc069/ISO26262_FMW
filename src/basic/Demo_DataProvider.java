package basic;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_DataProvider 
{
     @DataProvider
      public Object[][] getData()
      {
    	 Object[][] data=new Object[2][2];
    	 data[0][0]="user1";
    	 data [0][1]="123";
    	 data[1][0]="user2";
    	 data[1][1]="123456779";
		return data;
      }
		@Test(dataProvider = "getData")
		public void CreateUser(Object un, Object pw)
		{
    	 Reporter.log(un +"-------" + pw ,true);
      }
}

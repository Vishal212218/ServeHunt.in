package com.servhunt.in;


import org.testng.annotations.Test;

import Base.BaseClass;
import POM.Dashboard;
import POM.LoginPage;
import POM.ManageOrder;
import POM.RegisterUser;




public class ServHunt {

	@Test
	public void servHuntTest() throws InterruptedException
	{

		BaseClass.openUrl();
		//RegisterUser.registerUser();
		LoginPage.verifyLogin("https://www.servhunt.in/login");
		Dashboard.verifyDashboardEmelment();
		
		  ManageOrder.verifyOrder();
		 System.out.println("We can see the order of customer..!");
		 /* ManageOrder.manageOrder(); System.out.println("View the Report..!");
		 * ManageOrder.verifyViewDetailsReport();
		 */
		
		BaseClass.closeUrl();
		
	}

}

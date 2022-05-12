package com.crm.Campaign;

import org.testng.annotations.Test;

public class CampaignTest {
	@Test(groups={"SmokeTest"})
	public void createCampaignTest() {
		String value = System.getProperty("browser");
		System.out.println("Browser:  "+value);
		System.out.println("execute  createCampaignTest");
		 
		
	}
	@Test(groups={"RegressionTest"})
	public void modifyCampaignTest() {
		System.out.println("execute  modifyCampaignTest");
	}
	@Test(groups={"RegressionTest"})
	public void deleteCampaignTest() {
		System.out.println("execute  deleteCampaignTest");
	}

//THIKA AMIKAND CORRECT EDENA NODU
}

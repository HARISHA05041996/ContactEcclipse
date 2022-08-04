package com.crm.practise;

import org.testng.annotations.Test;

public class OrganizationTest {
	@Test(groups={"SmokeTest"})
	public void createOrgTest() {
		System.out.println("execute  createOrgTest");
		
	}
	@Test(groups={"RegressionTest"})
	public void modifyOrgTest() {
		System.out.println("execute  modifyOrgTest");
	}
	@Test(groups={"RegressionTest"})
	public void deleteOrgTest() {
		System.out.println("execute  deleteOrgTest");
	}

}



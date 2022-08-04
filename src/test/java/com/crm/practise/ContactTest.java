package com.crm.practise;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups={"SmokeTest"})
	public void createCustomerTest() {
		System.out.println("execute  createCustomerTest");
		
	}
	@Test(groups={"RegressionTest"})
	public void modifyCustomerTest() {
		System.out.println("execute  modifyCustomerTest");
	}
	@Test(groups={"RegressionTest"})
	public void deleteCustomerTest() {
		System.out.println("execute  deleteCustomerTest");
	}

}

package com.colorStreet.steps;

import com.colorStreet.commonUtils.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverInitialization  {
	
	@Before
	public void loadFiles () {
		System.out.println("loaded the properties file");
		BaseUtil.initializeProps();
	}
	
	@After
	public void tearDown () {
		System.out.println("closing browser");
		BaseUtil.driver.close();
		BaseUtil.driver.quit();
	}
}

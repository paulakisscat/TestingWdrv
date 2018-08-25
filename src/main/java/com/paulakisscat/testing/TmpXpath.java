package com.paulakisscat.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 
 * @author paulakisscat
 *
 */
@Test
public class TmpXpath {

		static WebDriver driver = null;
		@BeforeClass
		public static void befor() {

			System.setProperty("webdriver.firefox.driver", "/usr/local/bin/geckodriver");
			driver = new FirefoxDriver();
		    try {
		    	
		    	driver.get("https://www.alipay.com/");
//		    	driver.manage().window().maximize();
//		    	driver.quit();
		    	
			} catch (Exception e) {
				e.fillInStackTrace();
			} finally {
				System.out.println("check coding!check coding!check coding!check coding!check coding!"
						+ "check coding!check coding!check coding!check coding!check coding!check coding!check coding!"
						+ "check coding!check coding!check coding!check coding!check coding!check coding!check coding!"
						+ "check coding!check coding!check coding!check coding!check coding!check coding!check coding!check coding!");
			}
		}
		
		
//		@AfterClass
//		public void after() {
//
//		}
		
		
		public static void main(String[] args) {

			befor();
		}
	}



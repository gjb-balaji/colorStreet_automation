package com.colorStreet.commonUtils;

import java.io.*;
import java.io.BufferedReader;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtil {

	public static WebDriver driver;
	public static BufferedReader reader;
	public static Properties props = new Properties();
	public static String dummyXpath = "//*[text()='dummyPath']";
	
	//Opening a browser
	public static boolean openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					(System.getProperty("user.dir") + "//drivers//chromedriver.exe"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			System.out.println("User opened Chrome browser");
			return true;
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("User not able to open with Chrome browser");
			return false;
		}
	}
 
	//Select a value from a drop down
	public static boolean selectAValueFromDD(String xpath, String value) {
		try {
			WebElement ele = driver.findElement(By.xpath(xpath));
			Select sel = new Select(ele);
			sel.selectByVisibleText(value);
			System.out.println("User selected '" + value + "' from the drop down");
			return true;
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("User not able to select " + value + " from the drop down");
			return false;
		}
	}

	//launching an application
	public static void launchApp() {
		try {
			driver.get(props.getProperty("url"));
			//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			System.out.println("Application is launched");
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Application is not launched");
		}
	}

	//reading properties file
	public static void initializeProps() {
		try {
			reader = new BufferedReader(
					new FileReader((System.getProperty("user.dir")) + "\\Data\\ConfigData.properties"));
			try {
				props.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("ConfigData.properties not found at "
					+ (System.getProperty(("user.dir")) + "\\Data\\ConfigData.properties"));
		}
	}

	//constructing an Xpath using a text
	public static String constructXpath(String value) {
		try {
			String orgXpath = dummyXpath.replace("dummyPath", value);
			return orgXpath;
		} catch (Exception a) {
			a.printStackTrace();
			return null;
		}
	}

	//entering a text value
	public static void enterText(String path, String value) {
		try {
			driver.findElement(By.xpath(path)).sendKeys(value);
			System.out.println("Entered " + value + " to the text field");
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not able to enter " + value + " to the text field");
		}
	}

	//clicking a button
	public static void clickButton(String path) {
		try {
			WebDriverWait w = new WebDriverWait(driver, 40);
			w.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
			WebElement ele = driver.findElement(By.xpath(path));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
			ele.click();
			System.out.println("Click the button");
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not able to click the button");
		}
	}

	//mouse hover on any web element
	public static void mouseHover(String path) {
		try {
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath(path));
			action.moveToElement(we).build().perform();
			System.out.println("Hovered on " + path + " web element");
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not hovered on " + path + " web element");
		}
	}

	//constructing an xpath using string replace method
	public static String shopXpath(String xpath, String value) {
		String myXpath = xpath.replace("dummy", value);
		return myXpath;
	}

	//getting a web element text value
	public static String getElementTextValue(String path) {
		try {
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			WebElement ele = driver.findElement(By.xpath(path));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
			System.out.println("The text value is = " + ele.getText());
			return ele.getText();
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not able to get the label");
			return null;
		}
	}

	public static void listElementClick(String path) {
		try {
			List<WebElement> li1 = driver.findElements(By.xpath(path));
			String e = "";
			int i = 1;
			JavascriptExecutor js = (JavascriptExecutor)driver;
			for (WebElement ee : li1) {
				if (i <= 3) {
					js.executeScript("arguments[0].scrollIntoView(true);", ee);
					js.executeScript("arguments[0].click();", ee);
				}
				
			}
			
//			List<WebElement> li1 = driver.findElements(By.xpath("//div[@class='relative w-full h-full aspect-square']/div/span/img"));
//			for (WebElement ee : li1) {
//				js.executeScript("arguments[0].scrollIntoView(true);", ee);
//				
//			}
//			
//			String e = "";
//			WebDriverWait w = new WebDriverWait(driver, 20);
//			w.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
//			List<WebElement> li = driver.findElements(By.xpath(path));
//			for (int i = 1; i < 10; i ++) {
//				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", li.get(i - 1));
//				if (i <= 3) {
//					e = li.get(i - 1).getText();
//					li.get(i - 1).click();
//				}
//			}
//			System.out.println("The text value is " + e);
//			return e;
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not able to get the label");
		}
	}

	public static void selectAValue() {
		try {
			List<WebElement> li = driver
					.findElements(By.xpath("//button[@class='btn btn-secondary trigger-datalayer-push-addtocart']"));
			for (WebElement e : li) {
				e.click();
				break;
			}
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not able to get the label");
		}
	}

}

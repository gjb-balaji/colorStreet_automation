package com.colorStreet.commonUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

	public static void launchApp() {
		try {
			// driver.manage().window().maximize();
			driver.get(props.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			System.out.println("Application is launched");
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Application is not launched");
		}
	}

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

	public static String constructXpath(String value) {
		try {
			String orgXpath = dummyXpath.replace("dummyPath", value);
			return orgXpath;
		} catch (Exception a) {
			a.printStackTrace();
			return null;
		}
	}

	public static void enterText(String path, String value) {
		try {
			driver.findElement(By.xpath(path)).sendKeys(value);
			System.out.println("Entered " + value + " to the text field");
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not able to enter " + value + " to the text field");
		}
	}

	public static void clickButton(String path) {
		try {
			WebDriverWait w = new WebDriverWait(driver, 20);
			w.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
			WebElement ele = driver.findElement(By.xpath(path));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
			ele.click();
			System.out.println("Click the button");
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not able to click the button");
		}
	}

//	public static void javaScriptclickButton(String path) {
//		try {
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			List<WebElement> li = driver.findElements(By.xpath(path));
//			js.executeScript("arguments[0].click();", li);
//			//driver.findElement(By.xpath(path)).click();
//			System.out.println("Click the button");
//		} catch (Exception a) {
//			a.printStackTrace();
//			System.out.println("Not able to click the button");
//		}
//	}

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

	public static String shopXpath(String xpath, String value) {
		String myXpath = xpath.replace("dummy", value);
		return myXpath;
	}

	public static String getElementTextValue(String path) {
		try {
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			WebElement ele = driver.findElement(By.xpath(path));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
			System.out.println("The text value is = " + ele.getText());
			return ele.getText();
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not able to get the label");
			return null;
		}
	}

	public static String listElementClick(String path) {
		try {
			String e = "";
			WebDriverWait w = new WebDriverWait(driver, 20);
			w.until(ExpectedConditions.elementToBeClickable(
					By.xpath(path)));
			List<WebElement> li = driver
					.findElements(By.xpath(path));
			for (int i = 0; i < 10; i++) {
				if (i % 3 == 0 && i > 0) {
					e = li.get(i - 1).getText();
					li.get(i - 1).click();
					System.out.println(e);
				}
			}
			// System.out.println("The text value is " + e.getText());
			return e;
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("Not able to get the label");
			return null;
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

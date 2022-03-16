package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizableExample {



            public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver", "/home/redbytes/Desktop/selenium/chromedriver");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\chromedriver.exe");
			//When you create object then automatically browser will lauch
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/resizable");
			driver.manage().window().maximize();
			Actions action=new Actions(driver);
			WebElement source=driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']/span"));
			action.clickAndHold(source).moveByOffset(50, 50).release().build().perform();

		}

	}

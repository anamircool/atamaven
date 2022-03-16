package practiceselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class simpleDrag {

	



		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver", "/home/redbytes/Desktop/selenium/chromedriver");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\chromedriver.exe");
			//When you create object then automatically browser will lauch
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/dragabble");
			driver.manage().window().maximize();
			Actions action=new Actions(driver);
			WebElement source=driver.findElement(By.id("dragBox"));
			//action.moveToElement(source).perform();
			int x=source.getLocation().getX();
			int Y=source.getLocation().getY();
		   //action.dragAndDropBy(source,500,55).perform(); 
			//action.moveToElement(source).dragAndDropBy(source,500,55).build().perform();
			}
	}


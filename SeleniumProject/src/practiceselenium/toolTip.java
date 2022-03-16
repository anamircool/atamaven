package practiceselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class toolTip {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/tool-tips");
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("toolTipButton"))).perform();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.className("tooltip-inner")).getText());
		
		
		
		
	}

}

package switchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		WebElement Clickbutton=driver.findElement(By.xpath("//button[@id='promtButton']"));
	
		Clickbutton.click();
		
		
		Alert obj=driver.switchTo().alert();
		obj.sendKeys("alert messeging");
		Thread.sleep(5000);
		
		
		obj.accept();
		
		
	}

}

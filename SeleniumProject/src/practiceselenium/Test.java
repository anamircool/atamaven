package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/text-box");
		//System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement FullName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		//FullName.sendKeys("testing");
	}

}

package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyStokes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		username.sendKeys("Admin ");
		//password.sendKeys("admin123");
		//loginbtn.sendKeys(Keys.ENTER);
		
		//Actions action=new Actions(driver);
		//action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//password.click();
		//action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		String select=Keys.chord(Keys.CONTROL, "a");
		String copy=Keys.chord(Keys.CONTROL, "c");
		String paste=Keys.chord(Keys.CONTROL, "v");
		username.sendKeys(select);
		username.sendKeys(copy);
		password.click();
		password.sendKeys(paste);
		
		}

}

package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class submitButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/text-box");
		WebElement Email=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		Email.sendKeys("anamircool@gmail.com");
		WebElement Submit=driver.findElement(By.id("submit"));
		System.out.println(Submit.getText());
		System.out.println("Height"+Submit.getSize().getHeight());
		System.out.println("Widith"+Submit.getSize().getWidth());
		
		System.out.println(Email.getAttribute("id"));
		
		
		//Submit.click();
		//driver.close();
		
	}

}

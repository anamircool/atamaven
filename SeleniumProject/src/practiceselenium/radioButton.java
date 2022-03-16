package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/radio-button");
		WebElement yesRadioButton=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yesRadioButton.click();
		
		WebElement NORadioButton=driver.findElement(By.xpath("//input[@id='noRadio']"));
		System.out.println(NORadioButton.isEnabled());
		
		
		if(!NORadioButton.isEnabled()) {
			System.out.println("Radio button is disable - test case pass");
		}else {
			System.out.println("Radio button is enable - test case fail");
		}

		
		
		driver.close();

	}

}

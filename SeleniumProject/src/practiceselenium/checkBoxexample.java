package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBoxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/checkbox");
		//System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement HomeCheckbox=driver.findElement(By.xpath("//label[@for='tree-node-home']/span"));
		if(!HomeCheckbox.isSelected()) {
			HomeCheckbox.click();
		}
		WebElement Result=driver.findElement(By.xpath("//div[@id='result']"));
		if(Result.isDisplayed()) {
			System.out.println(Result.getText());
		}
		
		//FullName.sendKeys("testing");
		//label[@for='tree-node-desktop']//preceding-sibling::button
		//span[text()='Desktop']//parent::label//preceding-sibling::button

	}

}

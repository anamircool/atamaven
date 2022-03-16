package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame("content");
		
		WebElement header=driver.findElement(By.tagName("h1"));
		System.out.println(header.getText());
		
		
		
		
	}

}

package switchTo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\chromedriver.exe");
			//When you create object then automatically browser will lauch
			ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
			//Enter the URL which you want to enter in the browser
			driver.get("http://www.londonfreelance.org/courses/frames/index.html");
			//Switch to frame by name
			driver.switchTo().frame("content");
			WebElement header=driver.findElement(By.tagName("h1"));
			System.out.println(header.getText());
			//switch to frame by webelement
			driver.switchTo().defaultContent();
			WebElement frame=driver.findElement(By.xpath("//frame[@name='navbar']"));
			driver.switchTo().frame(frame);
			WebElement noframe=driver.findElement(By.xpath("//a[text()='No frames']"));
			System.out.println(noframe.getText());
			
		}

	}


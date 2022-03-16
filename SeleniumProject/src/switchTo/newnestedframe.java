package switchTo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newnestedframe {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\chromedriver.exe");
			//When you create object then automatically browser will lauch
			ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
			//Enter the URL which you want to enter in the browser
			driver.get("https://demoqa.com/nestedframes");
			WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
			driver.switchTo().frame(iframe);
			System.out.println(driver.findElement(By.tagName("body")).getText());
			WebElement iframeobj=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
			driver.switchTo().frame(iframeobj);
			System.out.println(driver.findElement(By.tagName("body")).getText());
		}

	}


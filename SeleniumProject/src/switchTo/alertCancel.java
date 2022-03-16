package switchTo;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertCancel {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\chromedriver.exe");
			//When you create object then automatically browser will lauch
			ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
			//Enter the URL which you want to enter in the browser
			driver.get("https://demoqa.com/alerts");
			WebElement clickbutton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
			clickbutton.click();
			//We have to click on OK button of pop up window
			//step 1 --we have to move to Alert
				Alert obj=driver.switchTo().alert();
				Thread.sleep(5000); //Thread inbuilt class of jave which help to wait for give time
			//Step 2--> call accept method if you want to click on OK
						//call dismiss method if you want to click on cancel
				System.out.println(obj.getText());
				obj.dismiss();

		}

	}

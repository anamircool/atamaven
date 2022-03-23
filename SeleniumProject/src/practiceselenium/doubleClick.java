package practiceselenium;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	
            public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\chromedriver.exe");
			//When you create object then automatically browser will lauch
			ChromeDriver newdriver=new ChromeDriver(); //driver is a reference of chromedriver class
			//Enter the URL which you want to enter in the browser
			newdriver.get("https://demoqa.com/buttons");
			///To do double click 
			Actions obj=new Actions(newdriver);
			obj.doubleClick(newdriver.findElement(By.id("doubleClickBtn"))).perform(); 
			obj.contextClick(newdriver.findElement(By.id("rightClickBtn"))).perform(); 
			System.out.println(obj.getClass());
 
		}

	}



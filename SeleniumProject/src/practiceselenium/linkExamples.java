package practiceselenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumProject\\Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/webtables");
		List<WebElement> Columnname=driver.findElements(By.xpath("//div[@role='columnheader']"));
		for(int i=0; i<Columnname.size(); i++) {
			System.out.println(Columnname.get(i).getText());
			
		}
		System.out.println(Columnname.size());
		Iterator<WebElement> itr=Columnname.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		
		
		
		
		
	}

}

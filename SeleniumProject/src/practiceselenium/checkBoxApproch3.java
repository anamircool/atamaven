package practiceselenium;


	



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxApproch3 {


	public static void main(String[] args) {
		
		//APPROACH 3 -WHAT HAPPEN IF CHECK BOX IS NOT SELECTED THEN WHAT WILL HAPPEN TO RESULT
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/checkbox");
		
		//Find the address of home checkbox
		/*
		 * List<WebElement>
		 * table=driver.findElements(By.xpath("div[@role='columnheader']")); Iterator
		 * iterator=table.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.); }
		 */
				
		//Check the Home checkbox only if it is not already selected
		/*
		 * 
		 * //div[@role='columnheader']
		 * //div[@role='gridcell']
		 * if(!HomeCheckbox.isSelected()) { HomeCheckbox.click(); }
		 */
		//Print the result which display after selecting the checkbox home 
		//Using Webelements instead of Webelement as if result is not display it will not throw no such element exception
		//Retun type of Webelements is list of webelements 
		List<WebElement> Result=driver.findElements(By.xpath("//div[@id='result']"));
		//Read the Result only if it is display
		if(Result.size()>0) { //size is the method of collection
			System.out.println(Result.get(0).getText());
		} else {
			System.out.println("On clicking on Home check , message is not display , marking the test case as fail");
		}
		
		//imp - Difference between Findelement and findelements and when to use what
		

	}
	
}


package webdriversep17;

/*.1import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider1 {

	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver", "C:\\seleniumsoftware\\chromedriver.exe");
		   ChromeDriver slidertemp=new ChromeDriver();
		   
		   slidertemp.get("http://jqueryui.com/slider/");
		   WebElement slider = slidertemp.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[11]/a"));
		   Actions act1=new Actions(slidertemp);
		   act1.moveToElement(slider).perform();
		  // macys1.findElement(By.xpath(".//*[@id='flexLabel_/shop/kids-clothes/kids-jeans/Size_range/Boys%202-7%7CBoys%208-20?id=63008']/a")).click();
		   
				   

	}

}
*/


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class slider1 {

	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumsoftware\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/slider/");
				
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		
		
		WebElement mytest=driver.findElement((By.xpath("//iframe[@src='/resources/demos/slider/default.html']")));//webelement is the datatype
		
		driver.switchTo().frame(mytest);//switchto() is a method
		
		 Actions action =new Actions(driver);//action is a class
		 
		 WebElement slider= driver.findElement((By.xpath(".//*[@id='slider']/span")));//slider is a variable 
	
		
			action.dragAndDropBy(slider, 8000, 0).perform();
			
			System.out.println("TESTING");
		
	}

}

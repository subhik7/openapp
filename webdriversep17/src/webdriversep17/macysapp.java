package webdriversep17;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class macysapp 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumsoftware\\chromedriver.exe");
		   ChromeDriver macys1=new ChromeDriver();
		   
		   macys1.get("http://www.macys.com/");
		   WebElement menu_kids = macys1.findElement(By.xpath(".//*[@id='flexLabel_5991']/a"));
		   Actions act=new Actions(macys1);
		   act.moveToElement(menu_kids).perform();
		   macys1.findElement(By.xpath(".//*[@id='flexLabel_/shop/kids-clothes/kids-jeans/Size_range/Boys%202-7%7CBoys%208-20?id=63008']/a")).click();
		   
				   
		   
		
	}

}

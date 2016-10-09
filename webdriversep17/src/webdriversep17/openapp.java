package webdriversep17;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class openapp
{
   public static void main(String[] args)
   
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\seleniumsoftware\\chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.name("email")).clear();
	   driver.findElement(By.name("email")).sendKeys("subhik7@gmail.com");
	   driver.findElement(By.name("pass")).clear();
	  driver.findElement(By.name("pass")).sendKeys("mill$subh1");
	   driver.findElementById("u_0_n").click();
	   //driver.findElementByLinkText().click();
	   driver.findElementByClassName("_54nh").click();
	   driver.manage().window().maximize();
	 //  driver..getText();

   }
}

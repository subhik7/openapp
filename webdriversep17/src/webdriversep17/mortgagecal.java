package webdriversep17;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class mortgagecal
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumsoftware\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://www.mortgagecalculator.org/");
		
		
		
		
		c1.findElement(By.name("param[homevalue]")).clear();
		c1.findElement(By.name("param[homevalue]")).sendKeys("242000");
		
		c1.findElement(By.name("param[principal]")).clear();
		c1.findElement(By.name("param[principal]")).sendKeys("202000");
		
		c1.findElement(By.name("param[interest_rate]")).clear();
		c1.findElement(By.name("param[interest_rate]")).sendKeys("3");
		
		c1.findElement(By.name("param[term]")).clear();
		c1.findElement(By.name("param[term]")).sendKeys("15");
				
		//c1.findElement(By.name("param[start_month]")).clear();
		//c1.findElement(By.name("param[start_month]")).sendKeys("Oct");
		
		
		//c1.findElement(By.name("param[start_year]")).clear();
		//c1.findElement(By.name("param[start_year]")).sendKeys("2012");
		//  c1.findElement(By.xpath("param[start_month]")).sendKeys("Oct");
		
		c1.findElement(By.name("param[property_tax]")).clear();
		c1.findElement(By.name("param[property_tax]")).sendKeys("5");
		
		c1.findElement(By.name("param[pmi]")).clear();
		c1.findElement(By.name("param[pmi]")).sendKeys("0");
		
		c1.findElement(By.name("param[hoi]")).clear();
		c1.findElement(By.name("param[hoi]")).sendKeys("1000");
		
		c1.findElement(By.name("param[hoa]")).clear();
		c1.findElement(By.name("param[hoa]")).sendKeys("226");
		
		c1.findElement(By.name("cal")).click();
		

	}

}

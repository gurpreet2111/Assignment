package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Assignment {
	
	public WebDriver driver;
	//6- Launch a browser in @Beforesuite annotation and open url . url -
		//https://opensource-demo.orangehrmlive.com/
		
		@BeforeSuite
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\TestNG\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		
		//7- Login to application again in @Test method, set priority 1 of the same method
		//Afterlogging

		@Test(priority=1)
		public void login()
		{
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password' or @name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
		}
		
		//8- Write Test method and page title for different menus- in order(Admin, PIM,
			//	Leave Dashboard, Directory and Maintenance)
		@Test(priority=2)
		public void AdminTitle()
		{
			driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
			System.out.println("Admin page title "+driver.getTitle());
		}
	
	@Test(priority=3)
	public void PIMTitle()
	{
		driver.findElement(By.xpath("//*[contains(text(),'PIM')]")).click();
		System.out.println("PIM page title "+driver.getTitle());
	}

	@Test(priority=4)
	public void Leave()
	{
		driver.findElement(By.xpath("//*[contains(text(),'Leave')]")).click();
		System.out.println("Leave page title "+driver.getTitle());
	}
	
	@Test(priority=5)
	public void dashboard()
	{		
	driver.findElement(By.xpath("//*[contains(text(),'Dashboard')]")).click();
	
	
	System.out.println("Dashboard page title "+driver.getTitle());
	}
	
	@Test(priority=6)
	public void Directory()
	{		
		driver.findElement(By.xpath("//*[contains(text(),'Directory')]")).click();
		
		System.out.println("Directory page title "+driver.getTitle());
		}
	
		@Test(priority=7)
		public void Maintenance()
		{		
			driver.findElement(By.xpath("//*[contains(text(),'Maintenance')]")).click();
			
			System.out.println("Maintenance page title "+driver.getTitle());
			}
		
		@Test(priority=8,retryAnalyzer = Tests.RetryAnalyzer.class)
		public void dashBoardHeading()
		{
			driver.findElement(By.xpath("//*[contains(text(),'Dashboard')]")).click();
			String dashboardHeading =driver.findElement(By.xpath("//h1")).getText();
			//System.out.println("Dashboard heading is "+dashboardHeading);
			Assert.assertEquals(dashboardHeading, "xys");
		    //Shutterbug.shootPage(driver).save();
		}

}

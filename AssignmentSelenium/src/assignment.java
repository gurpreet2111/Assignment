import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		//1- Open the above URL in Chrome browser. 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//2- Print the title of this application.
		System.out.println("Title of application is "+driver.getTitle());
		
		//3-Write Xpath and CssSelector of login page for following web objects - All Text box’s,
		//All - Hyperlinks, All Images.
		
		
		
		//4- Login with given User Name and Password and validate Dashboard. 
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password' and @name='txtPassword']"));
		password.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		String actualURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String expectedURL = driver.getCurrentUrl();
		if(actualURL.equalsIgnoreCase(expectedURL))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		

		
//		5- Click on Admin Link in Home Page and validate following text-
//		• User Management
//		• Job
//		• Organization
//		• Qualifications
		
		WebElement Admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		Admin.click();
		
		WebElement UserManagement = driver.findElement(By.xpath("//a[text()='User Management']"));
		WebElement Job = driver.findElement(By.xpath("//a[text()='Job']"));
		WebElement Organization = driver.findElement(By.xpath("//a[text()='Organization']"));
		WebElement Qualifications = driver.findElement(By.xpath("//a[text()='Qualifications']"));
		
		System.out.println("User Management: "+UserManagement.isDisplayed());
		System.out.println("Job: "+Job.isDisplayed());
		System.out.println("Organization: "+Organization.isDisplayed());
		System.out.println("Qualifications: "+Qualifications.isDisplayed());
		
		//9- Write a method (avoid using Test annotation) to minimize the window.
		
		driver.manage().window().setPosition(new Point(-2000, 0));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//10- Read Dashboard heading using [driver.findelement(by.xpath()).gettext()]. Refer 
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Dashboard')]")).click();
		String dashboardHeading =driver.findElement(By.xpath("//h1")).getText();
		System.out.println("Dashboard heading is "+dashboardHeading);
	    Shutterbug.shootPage(driver).save();

		
		//driver.close();

		
		
		


		
		
		

	}

}

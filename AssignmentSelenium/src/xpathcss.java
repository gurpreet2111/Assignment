import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcss {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password' and @name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//14-css
		WebElement Admin = driver.findElement(By.cssSelector("a.firstLevelMenu"));
		Admin.click();
		
		WebElement PIM = driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
		PIM.click();
		
		WebElement Time = driver.findElement(By.cssSelector("a#menu_time_viewTimeModule"));
		Time.click();
		
		WebElement Maintenance = driver.findElement(By.cssSelector("a#menu_maintenance_purgeEmployee"));
		Maintenance.click();
		
		driver.findElement(By.cssSelector("a#menu_dashboard_index")).click();
		WebElement Assignleave=driver.findElement(By.cssSelector("img[src='/webres_5fee89a90600f2.94309009/orangehrmLeavePlugin/images/ApplyLeave.png']"));
		Assignleave.click();
		
		driver.findElement(By.cssSelector("a#menu_dashboard_index")).click();

		WebElement TimeSheets = driver.findElement(By.cssSelector("img[src='/webres_5fee89a90600f2.94309009/orangehrmTimePlugin/images/MyTimesheet.png']"));
		TimeSheets.click();
		
		driver.findElement(By.cssSelector("a#menu_dashboard_index")).click();
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.cssSelector("div#div_graph_display_emp_distribution"));
		System.out.println(img.isDisplayed());	
		driver.close();
		
		
		
		
		
		
		
		
		
		
		/*//15-xpath
		WebElement leavelist = driver.findElement(By.xpath("//span[contains(text(),'Leave List')]"));
		leavelist.click();
		
		WebElement MarketPlace= driver.findElement(By.xpath("//input[@id='MP_link']"));
		MarketPlace.click();
		
		WebElement welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
		welcome.click();
		
		WebElement admin = driver.findElement(By.xpath("//*[contains(text(),'Admin')]"));
		admin.click();
		driver.close();*/

		
	}

}

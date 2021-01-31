import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcsslogin {

	public static void main(String[] args) {
/*
		3- Write Xpath and CssSelector of login page for following web objects - All Text box’s,
		All - Hyperlinks, All Images.*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement forgotPW=driver.findElement(By.cssSelector("a[href='/index.php/auth/requestPasswordResetCode']"));
		forgotPW.click();
		driver.findElement(By.cssSelector("input#btnCancel")).click();
		WebElement fpw=driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
		fpw.click();
		driver.findElement(By.id("btnCancel")).click();
		
		WebElement img1 = driver.findElement(By.cssSelector("img[src='/webres_5fee89a90600f2.94309009/themes/default/images/login/logo.png']"));
		System.out.println("image present "+img1.isDisplayed());
		
		WebElement img2 = driver.findElement(By.xpath("//div[@id='divLogo']"));
		System.out.println("image present "+img2.isDisplayed());
		
		
		
		
		//css
		WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.cssSelector("input#btnLogin"));
		login.click();
		
		
		
		/*//xpath login
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//input[@type='password' and @name='txtPassword']"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		*/

		driver.close();
	}

}

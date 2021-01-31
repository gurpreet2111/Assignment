import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scenario {

	private static final String FileUtils = null;

	public static void main(String[] args) throws Exception {
		
//		13- Execute followingscenario
		
//		• Login to OrangeHRM
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password' and @name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		• Click on PIM
		driver.findElement(By.xpath("//*[contains(text(),'PIM')]")).click();

//		• Enter Employee Name-Linda Anderson in Search box (refer below image)
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Linda Anderson");
		driver.findElement(By.id("searchBtn")).click();
		
//		• Validate and capture screenshot
		WebElement FN = driver.findElement(By.xpath("//a[text()='Linda Jane']"));
		WebElement LN = driver.findElement(By.xpath("//a[text()='Anderson']"));

		System.out.println("validate first name is "+FN.isDisplayed());
		System.out.println("validate last name is "+LN.isDisplayed());
		
		/*TakesScreenshot ts =(TakesScreenshot)driver;		
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyfile(source,new File("./Screenshot/orange.png"));*/
		
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //FileUtils.copyFile(scrFile, new File("./Screenshot/orange.png"));
		 
		FileHandler.copy(scrFile, new File("./Screenshot/orange.png"));
		System.out.println("Screenshot taken");

	}

}

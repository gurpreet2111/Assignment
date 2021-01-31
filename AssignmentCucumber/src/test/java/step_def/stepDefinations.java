package step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinations {
	WebDriver driver;
	
	@Given("^I am in OrangeHRP Application$")
	public void i_am_in_OrangeHRP_Application() {
		System.out.println("I am in OrangeHRP Application");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("I am in OrangeHRP Application");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			}

	@Then("^Login to Application$")
	public void login_to_Application()  {
		//driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
		//driver.findElement(By.xpath("//input[@type='password' and @name='txtPassword']")).sendKeys("admin123");;
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		System.out.println("Login to application");
		
		
		
		
	}

	@When("^Dashboard page is available$")
	public void dashboard_page_is_available() {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	    System.out.println("Dashboard page is available");
	}

	@When("^Click on Admin menu$")
	public void click_on_Admin_menu() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		System.out.println("clicked on Admin menu");
	}
	
	@Given("^I click on Admin Link$")
	public void i_click_on_Admin_Link()  {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

	}

	@Then("^Click on Job$")
	public void click_on_Job()  {
		driver.findElement(By.xpath("//a[text()='Job']")).click();
		System.out.println("click on job");

	}

	@Then("^validate text Job Title$")
	public void validate_text_Job_Title()  {
		System.out.println(driver.findElement(By.id("menu_admin_viewJobTitleList")).getText().contains("Job Titles"));	
		System.out.println("validate job title");
	}
	
	@Given("^I click on PIM$")
	public void i_click_on_PIM(){
		driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
		System.out.println("click on PIM");

	}

	@Then("^I click on Employee List$")
	public void i_click_on_Employee_List() {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		System.out.println("click on employee list");
	}

	@Then("^Validate text Employee list$")
	public void validate_text_Employee_list() {
		System.out.println(driver.findElement(By.id("menu_pim_viewEmployeeList")).getText().contains("Job Titles"));	
		System.out.println("validate text employee text");
	}

	@Then("^I Enter Employee Name Lindain Search box$")
	public void i_Enter_Employee_Name_Lindain_Search_box()  {
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Linda Anderson");
		System.out.println("enter employee name");
	}

	@Then("^I click on search button$")
	public void i_click_on_search_button()  {
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("click on search button");
  
	}

	@Then("^Validate Employee Name$")
	public void validate_Employee_Name()  {
		WebElement FN = driver.findElement(By.xpath("//a[text()='Linda Jane']"));
		WebElement LN = driver.findElement(By.xpath("//a[text()='Anderson']"));

		System.out.println("validate first name is "+FN.isDisplayed());
		System.out.println("validate last name is "+LN.isDisplayed());
	}



	@After
	public void closeBrowser()
	{
		driver.close();
	}



}

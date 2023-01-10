package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration_Page {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\My_Java_Workspace\\Online_Java_Traning_2022\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		

		// click on register  in button
		Thread.sleep(2000);
		driver.findElement(By.className("ico-register")).click();
		
//		Radio button

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='M']")).click();
		driver.findElement(By.xpath("//input[@value='F']")).isSelected();

		 Thread.sleep(2000);
//		first name
		driver.findElement(By.id("FirstName")).sendKeys("Rahul");
		
//		last name
		driver.findElement(By.name("LastName")).sendKeys("khonde");
		
		
//	Select Month
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("26");
		 driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("june");
		 driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1988");
		 
		 Thread.sleep(2000);
//		 email
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rahul909@gmail.com");
		 
		
		 
		 Thread.sleep(2000);
		//enter company name
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("admin12");
		
//		click on checkbox
		 Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(checkbox);
		actions.perform();
		
			//enter username
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("R1232252");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("R1232252");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='register-button']")).click();
		

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]")).click();
		

	}

}

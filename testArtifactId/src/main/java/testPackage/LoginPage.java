package testPackage;

import static org.testng.Assert.assertEquals;



import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class LoginPage {

	public static void main(String[] args) throws Exception {
	
			System.setProperty("webdriver.chrome.driver","E:\\My_Java_Workspace\\Online_Java_Traning_2022\\Drivers\\new\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.nopcommerce.com/");	
		// use explicitl wait to check if pwd field is visible end enter pass
			
			// click on log in button
			Thread.sleep(2000);
			driver.findElement(By.className("ico-login")).click();
//			
			 Thread.sleep(2000);
			 
				//enter username
				driver.findElement(By.id("Email")).sendKeys("rahul909@gmail.com");
				
				WebDriverWait wt = new WebDriverWait(driver, 30);
				wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password"))).sendKeys("R1232252");
				
				

				//javascript executorScript
				
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				
				//Scroll Dwon using javascript
				Thread.sleep(3000);
				jse.executeScript("window.scrollBy(0, 500)");
				
				
				
		
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();

				
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
			
				
				
//			
//			
//				jse.executeScript("window.scrollBy(0, -500)");
//			
				Thread.sleep(3000);
				
				//Accept the alert
				driver.switchTo().alert().accept();
				System.out.println("Alert Accepted");
				
				
				Thread.sleep(2000);
				 driver.findElement(By.name("q")).sendKeys("xyz");
				 
				
				   
				Thread.sleep(3000);
				  driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
					
				
//				 My Account
				  Thread.sleep(3000);
				  driver.findElement(By.className("ico-account")).click();
				  
				  
				  
				  Thread.sleep(2000);
				  driver.findElement(By.name("q")).sendKeys("cell phone");
					
				  
				  Thread.sleep(2000);
				  List<WebElement> auto= driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li"));
				  
				  
				 int count=  auto.size();
				 System.out.println(count);
				 auto.get(count-1).click();
				 
				 
				 
				 //Add to Cart
				 Thread.sleep(3000);
				 driver.findElement(By.id("add-to-cart-button-20")).click();
				 
				 
//				
//				 driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")).click();
//				  
//				  
				   Thread.sleep(3000);
				 driver.findElement(By.xpath("//*[text()='Wishlist']")).click();
//				 
				 
				// create webelement ref.
				 Thread.sleep(3000);
				 WebElement Comp = driver.findElement(By.xpath("//html/body/div[6]/div[2]/ul[1]/li[1]/a"));
				 
				 //mouse simulation using action class
				 Actions act = new Actions(driver);
				 
				 // mouse over to computor web element
				 act.moveToElement(Comp).build().perform();
				 
				 //right click on web page
				 Thread.sleep(2000);
				 act.contextClick().build().perform();
				 
				 
				 //perfom key event
				 Thread.sleep(3000);
				 act.sendKeys(Keys.ENTER).build().perform();
				 
				 //Press enter key to Jewelry web element
				 WebElement Jwly = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a"));
				 
				 //mouse simulation using action class
				 Actions act1 = new Actions(driver);
				 
				// mouse over to computor web element
				 act.moveToElement(Comp).build().perform();
				 
				 //perfom key event
				 Thread.sleep(3000);
				 act.sendKeys(Keys.ENTER).build().perform();
				 
				 Thread.sleep(3000);
				 driver.navigate().refresh();
				
				 Thread.sleep(3000);
				 WebElement home = driver.findElement(By.xpath("//*[text()='Home']"));
				act.sendKeys(home, Keys.ENTER).build().perform();
				System.out.println("home option clicked");
				 
				 
//				  //Logout
//				  Thread.sleep(3000);
//				  driver.findElement(By.className("ico-logout")).click();
//				  
//				  
				  
				  //
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
//				  //// verfiy text is same or not by using assertion //
//				  Assert.assertEquals(driver.switchTo().alert().getText(), expResult); //
//				  System.out.println("Alert text varified");
////			
//				 
//				 driver.findElement(By.xpath("//button[@type='submit']")).click();
//					Thread.sleep(2000);
//					
//					 
//					  driver.findElement(By.name("q")).sendKeys("Cell phones");
//					  Thread.sleep(3000);
//					
//					  driver.findElement(By.xpath("//button[@type='submit']")).click();
//						Thread.sleep(2000);
//						
				 
//		
//		driver.close();
	}

	
	}




	


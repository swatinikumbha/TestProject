package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Account {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","E:\\My_Java_Workspace\\Online_Java_Traning_2022\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");	
	// use explicitl wait to check if pwd field is visible end enter pass
	}

}

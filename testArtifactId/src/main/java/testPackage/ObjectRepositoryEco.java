package testPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepositoryEco {

	public static void main(String[] args) throws Exception {
		
		// Specify the location of properties file
		
		File src = new File("E:\\My_Java_Workspace\\testArtifactId\\Repository\\object_repo_eco.properties");
		
				
				
		// create fileInputstream class object to load the file
		FileInputStream fis = new FileInputStream(src);
		
		
		
		//create properties class object  to read the file
		Properties pro = new Properties();
		pro.load(fis);
		
		//Setting the property of chrome browser and passing chromedirver path
		System.setProperty("webdriver.chrome.driver","E:\\My_Java_Workspace\\testArtifactId\\drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));			//Open url
		
		//getProperty() method accept key and it returns value for the same key
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("TestData1"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("TestData2"));
		Thread.sleep(3000);
		driver.close();

	}

}

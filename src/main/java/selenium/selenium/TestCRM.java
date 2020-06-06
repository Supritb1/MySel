package selenium.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCRM {
	WebDriver driver;

	@BeforeClass
	public void befoerClass() {

		String exePath = "C:\\Users\\suprit\\eclipse-workspace\\selenium\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");

	}

	@Test
	public void login() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divyaballurgi008@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Supya123@");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//span[text()='Companies']")).click();
		System.out.println(driver.getCurrentUrl());
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File out = ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(out, new File(System.getProperty("user.dir")+"/screenshot.png"));
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		
		
//		driver.findElement(By.xpath("//div[@class='ui right corner labeled input']/input")).sendKeys("Omkar");
//		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("mahadwar");
//		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	}
	
	
	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}

}

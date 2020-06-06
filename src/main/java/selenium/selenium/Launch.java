package selenium.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\suprit\\eclipse-workspace\\selenium\\driver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://ui.cogmento.com/");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divyaballurgi008@gmail.com");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("divyaballurgi008@gmail.com");
		 driver.findElement(By.xpath("//div[text()='Login']")).click();
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 driver.close();
		

	}

}

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick 
{

	public static void main(String[] args)  throws Exception
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharun\\Downloads\\chromedriver_win32");
		driver.manage().window().maximize();
/*example1*/		
//		driver.get("https://www.facebook.com/");o
		
//		Thread.sleep(2000);
//		Actions a=new Actions(driver);
//		a.contextClick().perform(); //should RightClick anywhere on page
//		Thread.sleep(2000);
//		a.release().perform();
//	
		
/*example2*/
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		Actions b=new Actions(driver);
		b.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform(); //should right click on 'right click me & show edit,cut
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		a1.accept();
	


	}

}

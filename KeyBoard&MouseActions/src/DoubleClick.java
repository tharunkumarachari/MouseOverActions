import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharun\\Downloads\\chromedriver_win32");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement w=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		w.sendKeys("books");
		Actions a=new Actions(driver);
		a.doubleClick(w).perform();	
		
	}

}

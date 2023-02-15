import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold 
{

	public static void main(String[] args)  throws Exception
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Tharun\\Downloads\\chromedriver_win32");
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.clickAndHold(driver.findElement(By.id("clickable"))).perform(); //should show as 'focused' beside clickable box
		Thread.sleep(2000);  
		
		

	}

}

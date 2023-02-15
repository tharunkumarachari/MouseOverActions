import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndRelease 
{

	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharun\\Downloads\\chromedriver_win32");
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		Thread.sleep(2000);
//		a.click(driver.findElement(By.xpath("//a[text()='Sign In']"))).perform(); //should click on "SignIn" and navigate to SingIn page
		a.click(driver.findElement(By.cssSelector("a[title='Sign In'"))).perform(); //should click on "SignIn" and navigate to SingIn page

}
}


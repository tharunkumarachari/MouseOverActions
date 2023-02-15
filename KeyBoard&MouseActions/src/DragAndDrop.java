import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{

	public static void main(String[] args)  throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharun\\Downloads\\chromedriver_win32");
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
/*example1*/
		WebElement source=driver.findElement(By.id("draggable")); //find draggable element and should drag that element 
		WebElement destination=driver.findElement(By.id("droppable")); //should drop 'draggbale' element into 'droppable' element and show as dropped
		a.dragAndDrop(source, destination).perform();
		
/*example2*/		
//		a.clickAndHold(driver.findElement(By.id("draggable"))).perform();
//		Thread.sleep(2000);
//		a.moveToElement(driver.findElement(By.id("droppable")));
//		a.release();
//		a.perform();
//		System.out.println("drag and drop sucessfully perfomred");
		
		

	}

}

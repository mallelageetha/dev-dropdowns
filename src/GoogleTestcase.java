import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		

		//create driver object
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("selenium");
        element.submit();
        //driver.close();
	}

}

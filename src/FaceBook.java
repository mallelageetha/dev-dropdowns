import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		
	
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("prasads_hari@yahoo.com");
	    driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("chandru88");
	    driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
	    System.out.println(driver.findElement(By.xpath("//*[@id=\'navItem_100001644928139\']/a/div")).getText().equals("Hari Prasad P"));
	}

}

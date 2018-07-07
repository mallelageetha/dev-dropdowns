import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cheapoair.com");
		
		driver.findElement(By.xpath("//*[@id=\'ember761\']")).sendKeys("T");
		
		WebDriverWait fromSuggsWait = new WebDriverWait(driver, 100);
		fromSuggsWait.until((d) -> {
			WebElement suggestionBoxDiv = d.findElement(By.xpath("//*[@id=\"ember760\"]/div[2]/div/section/div"));
			String className = suggestionBoxDiv.getAttribute("class");
			System.out.println("function called " + className);
			return !className.contains("hidden");
		});
		
		List<WebElement> fromLiList = driver.findElements(By.xpath("//*[@id=\'ember760\']/div[2]/div/section/div/ul/li"));
		
		for(WebElement liele: fromLiList ) {
			System.out.println(liele.getText());			
			String litext = liele.getText();
			if(litext.contains("Tucson All Airports")) {
				liele.click();
				break;
			}
		}
		
		//driver.findElement(By.xpath("//*[@id=\"\'ember766\']")).sendKeys("DCA");
		
//added aug code
	}

}

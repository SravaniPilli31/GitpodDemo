import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchBrowser {
	
	@BeforeMethod
	public void getConection(){
		System.out.println("Step 1");
	WebDriver driver = new ChromeDriver();
	System.out.println("Step 2");
		driver.get("https://www.indeed.com/");
		System.out.println("Step 3");
	}
	@AfterMethod
//	public void closeConnection(){
//		driver.close();
//	}
	public static void main(String[] args){
		LaunchBrowser lb = new LaunchBrowser();
		lb.getConection();
	}
}
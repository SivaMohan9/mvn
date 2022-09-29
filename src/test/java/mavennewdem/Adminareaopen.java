package mavennewdem;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Adminareaopen {

	static WebDriver driver;
	String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
	@Given("^Admin area Home Page$")
	public void admin_area_Home_Page() throws Exception {
		   driver = new ChromeDriver();
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		   //Thread.sleep(5000);
		  
		
	}

	@Then("^The Title is$")
	public void the_Title_is() throws Exception {
		System.out.println(driver.getTitle());
		driver.quit();
	
	
	
}
}
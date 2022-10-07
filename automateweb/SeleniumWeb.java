package automateweb;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWeb {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\\\selenium\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//email
		WebElement email_address= driver.findElement(By.id("sView1:r1:0:email::content"));
		email_address.sendKeys("jeni1326@gmail.com");
				
		WebElement password= driver.findElement(By.id("sView1:r1:0:password::content"));
		password.sendKeys("3175@123");
		
		WebElement retype_password= driver.findElement(By.name("sView1:r1:0:retypePassword"));
		retype_password.sendKeys("3175@123");
		
		WebElement first_name= driver.findElement(By.id("sView1:r1:0:firstName::content"));
		first_name.sendKeys("jeni");
		
		WebElement last_name= driver.findElement(By.id("sView1:r1:0:lastName::content"));
		last_name.sendKeys("prasanna");
		
		WebElement job_title= driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		job_title.sendKeys("SoftwareEngineer");
				
		WebElement work_phone = driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		work_phone.sendKeys("9866556622");
		
		WebElement company_name= driver.findElement(By.id("sView1:r1:0:companyName::content"));
		company_name.sendKeys("xyz");
		
		WebElement address1= driver.findElement(By.id("sView1:r1:0:address1::content"));
		address1.sendKeys("abc street, ");
				
		WebElement address2= driver.findElement(By.id("sView1:r1:0:address2::content"));
		address2.sendKeys("food park ,anna nagar");
		
		WebElement city= driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Chennai");
		
		WebElement state= driver.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("Tamil nadu");
		
		WebElement zip_code= driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		zip_code.sendKeys("600015");
				
		WebElement element = driver.findElement(By.className("xfp"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		driver.navigate().forward();
		
	
	}

}
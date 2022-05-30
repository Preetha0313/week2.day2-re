package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("http://leaftaps.com/opentaps/control/main");
	      driver.manage().window().maximize();
	      WebElement eleUserName = driver.findElement(By.xpath("//input[@id='username']"));
	      eleUserName.sendKeys("DemoSalesManager");
	      driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("crmsfa");
	      driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	      driver.findElement(By.linkText("CRM/SFA")).click();
	      driver.findElement(By.linkText("Leads")).click();
          driver.findElement(By.linkText("Find Leads")).click();
          driver.findElement(By.name("firstName")).sendKeys("Babu");
	      driver.findElement(By.linkText("Find Leads")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("firstName")).sendKeys("Babu");
	      driver.findElement(By.linkText("Babu")).click();
	      System.out.println("The title is :"+ driver.getTitle());
          driver.findElement(By.linkText("Edit")).click();
          Thread.sleep(2000);
          driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("LiveTestLeafLive TestLeafLiveTestLeafLive TestLeaf4");
          driver.findElement(By.name("submitButton")).click();
          System.out.println("LiveTestLeafLive TestLeafLiveTestLeafLive TestLeaf4");
	      driver.close();

          
          
          
          
	      

	      
	      
	}

}

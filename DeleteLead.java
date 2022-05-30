package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
	      driver.findElement(By.xpath("//span[text()='Phone']")).click();
	      driver.findElement(By.name("phoneNumber")).sendKeys("99");
	      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	      Thread.sleep(2000);
	      String  i= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
	      System.out.println(i);
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	      driver.findElement(By.linkText("Delete")).click();
	      driver.findElement(By.linkText("Find Leads")).click();
	      driver.findElement(By.xpath("//input[@name='id']")).click();
	      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
         if(driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).isDisplayed())
         {
        	 
         
        	 System.out.println("No Records found");
         }
         
         else 
         
         {
        	 System.out.println("Records are displayed");
        	 
         }
         
	      driver.close();
         }
}

         
         


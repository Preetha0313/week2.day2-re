package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
	      driver.findElement(By.xpath("//span[text()='Email']")).click();
	      driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
	      driver.findElement(By.linkText("Find Leads")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("firstName")).sendKeys("Babu");
	      driver.findElement(By.linkText("Babu")).click();
	      System.out.println("Babu");
	      String  i= driver.findElement(By.id("viewLead_companyName_sp")).getText();
	      System.out.println(i);
	      driver.findElement(By.linkText("Duplicate Lead")).click();
	      System.out.println("The title is :"+ driver.getTitle());
	      driver.findElement(By.name("submitButton")).click();
	      String  d= driver.findElement(By.id("viewLead_companyName_sp")).getText();
	      System.out.println(d);
	      if(i.equals(d))
	      {
	    	  
	    	  System.out.println("Duplicates are having same records");
	      }
	      else
	      {
	    	  System.out.println("Records are different");
	    	  
	      }
	      driver.close();
	      }
	    		  

          }


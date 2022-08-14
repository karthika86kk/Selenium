package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	 public static void main(String[] args) {
			

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			 
			 driver.manage().window().maximize();
			 WebElement elementUsername = driver.findElement(By.id("username"));
			 elementUsername.sendKeys("Demosalesmanager");
			 
			 WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
			 elementPassword.sendKeys("crmsfa");

			 WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
			 elementLogin.click();
			 
			 WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
			 elementCRMSFA. click();

			 
			 WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		     elementLeads.click();
		     
		     WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		 	 elementCreateLead.click();
		 	
		 	 WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		 	 elementCompanyName.sendKeys("TCS");
		 	 
		 	 WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
			 elementFirstName.sendKeys("Karthika");
		 	 
			 WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
			 elementLastName.sendKeys("V");
			 
			 WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
			 elementDepartment.sendKeys("IT");
			 
			 WebElement elementDescription =driver.findElement(By.id("createLeadForm_description"));
			 elementDescription .sendKeys("Create admin");
			 
			 WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
			 elementEmail.sendKeys("karthika86kk@gmail.com");
			 
			 WebElement elementStateDD =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			 Select dd =new Select(elementStateDD);
			 dd.selectByVisibleText("California");
			 
			 WebElement elementCreateButton=driver.findElement(By.className("smallSubmit"));
			 elementCreateButton.click();
			 
			 System.out.println("Title of resulting page"  +driver.getTitle());
			 
			 
			
		}

}

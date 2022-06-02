package com.FacebookTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
	
	WebDriver driver;
	
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe"); //Setting the chromedriver path
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
	}
	
	
	public void getSignUpDetails() {
				
		driver.navigate().to("https://www.facebook.com/signup"); //Opening the URL
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Rahul");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Deshmukh");
		
		WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("vstl@gmail.com");
		
		WebElement ConfirmEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		ConfirmEmail.sendKeys("vstl@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Password.sendKeys("Admin123");
		
		WebElement DayDropdown = driver.findElement(By.xpath("//select[@id='day']"));		
		Select drpDate = new Select(DayDropdown);
		drpDate.selectByVisibleText("1");
		
		WebElement MonthDropdown = driver.findElement(By.xpath("//select[@id='month']"));		
		Select drpMonth = new Select(MonthDropdown);
		drpMonth.selectByVisibleText("Jan");
		
		WebElement YearDropdown = driver.findElement(By.xpath("//select[@id='year']"));		
		Select drpYear = new Select(YearDropdown);
		drpYear.selectByVisibleText("1990");
		
		WebElement Gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		Gender.click();
				
		
	}
	
	public void closeBrowser() {
		
		driver.close();
	}

}

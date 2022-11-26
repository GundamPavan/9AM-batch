package com.automationframework.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("pavankumarreddygundam");
		driver.findElement(By.name("pass")).sendKeys("7893439809");
		WebElement login_button = driver.findElement(By.name("login"));
		login_button.click();

		String expected_url = "https://www.facebook.com/";
		String actual_url = driver.getCurrentUrl();
		if (actual_url.equals(expected_url)) {
			System.out.println("Facebook Application is logged in,test pass");
		} else {
			System.out.println("test fail");
		}
		Thread.sleep(3000);
		driver.close();

	}
}

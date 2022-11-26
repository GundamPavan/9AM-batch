package com.automationframework.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class DropDownMethod {
	public void carsSelect(String cartoselect) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement carslist = driver.findElement(By.id("carselect"));
		Select Cars = new Select(carslist);
		Cars.selectByValue(cartoselect);
		Thread.sleep(3000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		DropDownMethod method = new DropDownMethod();
		method.carsSelect("benz");
	}
}

package com.automationframework.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement cars = driver.findElement(By.id("carselect"));
		Select carsdata = new Select(cars);
		List<WebElement> carslist = carsdata.getOptions();
		System.out.println("list of cars available");
		for (WebElement car : carslist) {
			System.out.println(car.getText());
		}
		driver.close();

	}

}

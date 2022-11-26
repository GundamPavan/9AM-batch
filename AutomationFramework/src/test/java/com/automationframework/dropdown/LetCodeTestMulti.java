package com.automationframework.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeTestMulti {

	public void multiFruitSelect(String slectByValue) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement fruitslist = driver.findElement(By.id("multiple-select-example"));
		Select fruits = new Select(fruitslist);
		fruits.selectByValue(slectByValue);
		Thread.sleep(2000);
		fruits.deselectByValue(slectByValue);
		Thread.sleep(3000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		LetCodeTestMulti fruit = new LetCodeTestMulti();
		fruit.multiFruitSelect("apple");
	}

}

package com.automationframework.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommands {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		/*
		 * Thread.sleep(3000); driver.navigate().to("https://github.com");
		 */
		String opened_page_url = driver.getCurrentUrl();
		String opened_page_title = driver.getTitle();
		System.out.println(opened_page_url);
		System.out.println(opened_page_title);

		/*
		 * Thread.sleep(3000); driver.navigate().back(); Thread.sleep(3000);
		 * driver.navigate().forward(); Thread.sleep(3000); driver.navigate().refresh();
		 */
		driver.close();

	}

}

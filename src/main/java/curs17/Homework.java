package curs17;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Homework {

	@Test
	public void OpenBrowser() {
		//System.setProperty("webdriver.chrome.driver", "E:\\Descarcari\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://keybooks.ro/");
		WebElement login =  driver.findElement(By.className("menu_user_login"));
		WebElement user = driver.findElement(By.name("log"));
		WebElement pass = driver.findElement(By.name("pwd"));
		if (login.isDisplayed()) {
			System.out.println("Campul login-ului este vizibil");
		}
		if (user.isDisplayed()) {
			System.out.println("Campul userului este vizibil!");
		}else { System.out.println("Campul userului nu este vizibil!");
		
		}
		if (pass.isDisplayed()) {
			System.out.println("Campul parolei este vizibil!");
		}else {System.out.println("Campul parolei nu este vizibil!");
		
		}
		login.click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		if (user.isDisplayed()) {
			System.out.println("Campul userului este vizibil!");
		}
		
		if (pass.isDisplayed()) {
			System.out.println("Campul parolei este vizibil!");
		}
		
		}
}

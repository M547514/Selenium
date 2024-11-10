package com.mavenproject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OpenBrowser {
	WebDriver driver;
    String url="https://www.jobserve.com";
    public OpenBrowser() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\manju\\chrome-win64\\chrome.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
    }
@Test
    public void openUrl() {
        driver.get(url);
    }
    public void closeBrowser() {
        driver.quit();
    }
}
	


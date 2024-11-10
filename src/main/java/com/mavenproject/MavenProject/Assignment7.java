package com.mavenproject.MavenProject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\manju\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.espncricinfo.com/series/wi-w-in-eng-and-ire-2019-1168009/ireland-women-vs-west-indies-women-2nd-t20i-1185155/full-scorecard");
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='ds-w-full ds-table ds-table-md ds-table-auto  ci-scorecard-table']")); 

        // And iterate over them and get all the cells 
        for (WebElement row : allRows) { 
            List<WebElement> cells = row.findElements(By.tagName("td")); 

            // Print the contents of each cell
            for (WebElement cell : cells) {         

            System.out.println(cell.getText());
            
        
                }

		


	}

}
}
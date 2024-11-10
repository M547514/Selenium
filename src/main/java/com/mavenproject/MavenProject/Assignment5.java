package com.mavenproject.MavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment5 extends OpenBrowser {
	@Test
		public void checkbox() {
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath("//span[@id='ddcl-selInd']//span[@class='ui-dropdownchecklist-selector ui-state-default']")).click();
		    driver.findElement(By.cssSelector(".ddcl-selInd-i0-fake.fakeInput")).click();
		    String labelText = "Education";
	        WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(), '" + labelText + "')]"));
	        checkbox.click();
		}

	}




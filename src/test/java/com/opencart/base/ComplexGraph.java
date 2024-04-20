package com.opencart.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ComplexGraph {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://emicalculator.net/");
		
		//String pieChart ="//*[local-name()='g' and contains(@class,'highcharts-label')]//*[name()='tspan']";
		Thread.sleep(5000);
		List<WebElement> percentagePieChart =driver.findElements
				(By.xpath("//*[local-name()='g' and contains(@class,'highcharts-label')]//*[name()='tspan']"));
		String pieChartTooltip= "//*[local-name()='g' and contains(@class,'highcharts-label highcharts-tooltip')]//*[name()='text']";
		
//		List<WebElement> percentagePieChart =driver.findElements
//				(By.xpath("//*[local-name()='g' and contains(@class,'highcharts-data-labels')]//*[name()='g']"));
		
		Actions act = new Actions(driver);
		for(WebElement element : percentagePieChart) {
			act.moveToElement(element).perform();
			
			String text = driver.findElement(By.xpath(pieChartTooltip)).getText();
			System.out.println(text);
			Thread.sleep(500);
		}
		
		System.out.println(percentagePieChart.size());
		

	}

}

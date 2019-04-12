package com.cg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		Actions a1=new Actions(d);
		
		d.get("http:\\www.google.com");
		d.manage().window().maximize();
	//	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //used for failures
		
		
//		WebElement w1=d.findElement(By.cssSelector("input.gLFyf[name='q']"));
//		
//		WebElement w2=d.findElement(By.partialLinkText("Business"));
//		a1.moveToElement(w2).clickAndHold(w2).build().perform();
//		WebElement w3=d.findElement(By.className("fa-envelope-o"));
		
		WebElement w2=d.findElement(By.linkText("Gmail"));
		
		if(w2.isDisplayed()) {System.out.println("done");}else {System.out.println("not done");}
		if(w2.getCssValue("text-underline") != null) {System.out.println("underlined");}else {System.out.println("not underlined");}
		//String str=d.getTitle();
		WebElement w3=d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		w3.sendKeys("tutorialspoint");
		//w3.sendKeys(Keys.TAB);
		//Thread.sleep(10000);
		//WebElement w31=d.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]"));

		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	//WebElement w4=d.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']"));
		WebDriverWait w4=new WebDriverWait(d,20);
		w4.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));

 		WebElement w41=d.findElement(By.name("btnK"));
	//	System.out.println(w31.isDisplayed());
		//*[@id="tsf"]/div[2]/div/div[2]/div[2]/div/center/input[1]
		if((w41).isDisplayed())
		{System.out.println("btn found");w41.click();}
		else {System.out.println("btn not found");}
	}
}

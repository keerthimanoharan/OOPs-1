package org.student;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();	//DESELECT CHECKBOX
	    Thread.sleep(1000);
		driver.findElement(By.id("txtStationFrom")).clear();  //from
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();   //to
		driver.findElement(By.id("txtStationTo")).sendKeys("MMCT",Keys.ENTER);
		Thread.sleep(2000);
		WebElement table=driver.findElement(By.xpath("(//table[@class='DataTable TrainList TrainListHeader']//tr/td)[2]"));
		List<String> train=new ArrayList<String>();
		List<WebElement> trains=table.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr"));
		System.out.println("the number of available trains are:"+trains.size()); 
	for(int i=1;i<trains.size();i++) {
	String text=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
    System.out.println(text);

Set<String> set=new HashSet<String>(train);
System.out.println(set);;
int size=set.size();
	System.out.println(size);
}}}

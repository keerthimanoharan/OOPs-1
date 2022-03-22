package org.student;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {
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
	/*List<WebElement> train1=driver.findElements(By.xpath("//a[text()='MS  CSMT EXP']"));  //1st train-USING FOREACH
	for(WebElement WebElement: train1) {
		String text = WebElement.getText();
		System.out.println("the first displayed train nameis:"+text);}*/
	
	WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
	table.getText();
	List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
	System.out.println("the number of trains are:"+rows.size());
	List<String> train=new ArrayList<String>();
	System.out.println(train);
	for (int i = 1; i < rows.size(); i++) {
		String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
	System.out.println(text);
	}}}

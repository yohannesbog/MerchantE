package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class merchante {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\john\\Desktop\\eclipse\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://ec2-54-174-213-136.compute-1.amazonaws.com:8080/admin");
		driver.findElement(By.xpath("//a[@href='/admin/products']")).click();
		driver.findElement(By.xpath("//a[@href='/admin/products/new']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='product_title']")).sendKeys("merchantEProduct");
		driver.findElement(By.cssSelector("[id='product_description']")).sendKeys("merchantE New Product");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='product_author']")).sendKeys("Yohannes B");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='product_price']")).sendKeys("$2");
		driver.findElement(By.xpath("//input[@id='product_featured']")).click();
		driver.findElement(By.xpath("//select[@id='product_available_on_1i']")).click();
		driver.findElement(By.xpath("//select[@id='product_available_on_1i']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//select[@id='product_available_on_2i']")).click();
		driver.findElement(By.xpath("//select[@id='product_available_on_2i']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//select[@id='product_available_on_3i']")).click();
		driver.findElement(By.xpath("//select[@id='product_available_on_3i']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("[id='product_image_file_name']")).sendKeys("YohannesProduct image");
		driver.findElement(By.xpath("//input[@name='commit']")).submit();
		driver.close();
	}
	
}

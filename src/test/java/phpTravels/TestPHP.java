package phpTravels;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;

public class TestPHP {
	
	ChromeDriver driver;
	
	@BeforeClass
	public static void setupDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
	}
	
	@Before
	public void setup() {
		this.driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException {
		this.driver.get("https://www.phptravels.net/");
		this.driver.manage().window().maximize();
		this.driver.findElement(By.cssSelector("#s2id_autogen8 > a")).click( );
		this.driver.findElement(By.cssSelector("#select2-drop > div > input")).sendKeys("lon");
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#select2-drop > ul > li > ul > li.select2-results-dept-1.select2-result.select2-result-selectable.select2-highlighted")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#dpd1 > div > input")).click();
		this.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > tbody > tr:nth-child(3) > td.day.active")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.id("travellersInput")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#adultPlusBtn > i")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#HOTELS > form > div.col-md-2.form-group.go-right.col-xs-12.search-button > button")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#body-section > div.listingbg > div > div.col-md-9.col-xs-12 > div.row > div > table > tbody > tr > td > div.col-md-3.col-xs-4.col-sm-4.go-left.pull-right.price_tab > a > button")).click();
		Thread.sleep(2000);
		this.driver.executeScript("$('html, body').scrollTop(700);", true);
		this.driver.findElement(By.xpath("//*[@id=\"ROOMS\"]/div/table/tbody/tr[3]/td/div[2]/div[2]/div/div[3]/div/button")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#guestform > div:nth-child(1) > div:nth-child(2) > input")).sendKeys("1");
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#guestform > div:nth-child(1) > div:nth-child(3) > input")).sendKeys("2");
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#guestform > div:nth-child(2) > div:nth-child(2) > input")).sendKeys("test@test.test");
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#guestform > div:nth-child(2) > div:nth-child(3) > input")).sendKeys("test@test.test");
		Thread.sleep(2000);
		this.driver.findElement(By.cssSelector("#body-section > div > div > div.loadinvoice > div > div.col-md-8.offset-0.go-right > div:nth-child(2) > div.form-group > button")).click();
		Thread.sleep(10000);
		assertEquals("Falied booking", "UNPAID", this.driver.findElement(By.cssSelector("#invoiceTable > tbody > tr:nth-child(1) > td > div")).getText());
	}

}

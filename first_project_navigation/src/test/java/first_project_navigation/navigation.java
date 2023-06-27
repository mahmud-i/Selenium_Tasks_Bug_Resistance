package first_project_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class navigation {

	public static void main(String[] args) {
		
	String expectedmessage= "THANK YOU FOR YOUR ORDER";
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.saucedemo.com/v1/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
	driver.findElement(By.id("shopping_cart_container")).click();
	driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")).click();
	driver.findElement(By.id("first-name")).sendKeys("John");
	driver.findElement(By.id("last-name")).sendKeys("Abraham");
	driver.findElement(By.id("postal-code")).sendKeys("1213");
	driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_buttons > input")).click();
	driver.findElement(By.cssSelector("#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button")).click();
	driver.findElement(By.cssSelector("#menu_button_container > div > div:nth-child(3) > div > button")).click();
	driver.findElement(By.id("logout_sidebar_link")).click();
	driver.quit();
		
	}
}

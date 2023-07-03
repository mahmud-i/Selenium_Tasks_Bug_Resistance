package task_navigation_eclispe;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_to_check_out {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver first_browser = new ChromeDriver();

		first_browser.manage().window().maximize();
		first_browser.navigate().to("https://www.saucedemo.com/v1/");
		first_browser.findElement(By.id("user-name")).sendKeys("standard_user");
		first_browser.findElement(By.id("password")).sendKeys("secret_sauce");
		first_browser.findElement(By.id("login-button")).click();
		first_browser.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		first_browser.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
		first_browser.findElement(By.id("shopping_cart_container")).click();
		first_browser.findElement(
				By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button"))
				.click();
		first_browser.findElement(By.id("first-name")).sendKeys("John");
		first_browser.findElement(By.id("last-name")).sendKeys("Abraham");
		first_browser.findElement(By.id("postal-code")).sendKeys("1213");
		first_browser.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_buttons > input"))
				.click();
		first_browser.findElement(By.cssSelector(
				"#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button"))
				.click();
		first_browser.findElement(By.cssSelector("#menu_button_container > div > div:nth-child(3) > div > button")).click();
		first_browser.findElement(By.id("logout_sidebar_link")).click();
		first_browser.quit();

	}

}

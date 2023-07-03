package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_to_Checkout {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver test_browser = new FirefoxDriver();

        test_browser.manage().window().maximize();
        test_browser.get("https://www.saucedemo.com/v1/");
        test_browser.findElement(By.id("user-name")).sendKeys("standard_user");
        test_browser.findElement(By.id("password")).sendKeys("secret_sauce");
        test_browser.findElement(By.id("login-button")).click();
        test_browser.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
        test_browser.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
        test_browser.findElement(By.id("shopping_cart_container")).click();
        test_browser.findElement(
                By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button"))
                .click();
        test_browser.findElement(By.id("first-name")).sendKeys("John");
        test_browser.findElement(By.id("last-name")).sendKeys("Abraham");
        test_browser.findElement(By.id("postal-code")).sendKeys("1213");
        test_browser.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_buttons > input"))
                .click();
        test_browser.findElement(By.cssSelector(
                "#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button"))
                .click();
        test_browser.findElement(By.cssSelector("#menu_button_container > div > div:nth-child(3) > div > button"))
                .click();
        test_browser.findElement(By.id("logout_sidebar_link")).click();
        test_browser.quit();

    }
}

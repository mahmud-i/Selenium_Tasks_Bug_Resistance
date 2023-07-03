package soowgood_automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class navigate_to_login {

    public static void main (String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();

        browser.manage().window().maximize();
        browser.navigate().to("http://204.93.160.159:8080/");
        browser.findElement(By.cssSelector("body > app-root > layout > enterprise-layout > div > div.relative.flex.flex-col.flex-0.justify-center.w-full.h-16.sm\\:h-20.md\\:h-20.overflow-hidden.z-49.shadow.print\\:hidden > div > div > div.flex.items-center.pl-2.ml-auto.space-x-2 > div:nth-child(4) > button")).click();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        browser.findElement(By.xpath("/html/body/app-root/layout/empty-layout/div/div/auth-sign-in/div/div[1]/div[2]/form/div[1]/input")).sendKeys("test1coppa@gmail.com");
        browser.findElement(By.xpath("/html/body/app-root/layout/empty-layout/div/div/auth-sign-in/div/div[1]/div[2]/form/div[2]/input")).sendKeys("coppa123");
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        browser.findElement(By.xpath("/html/body/app-root/layout/empty-layout/div/div/auth-sign-in/div/div[1]/div[2]/form/div[4]/button")).click();
    }

}

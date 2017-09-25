package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;
import java.util.List;
import java.util.Set;

public class SimpleTest {

    @Test
    public void navigate(){
        //ChromeOptions options = new ChromeOptions();
       // options.setBinary("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
       // ChromeDriver browser = new ChromeDriver(options);
       // System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Downloads/Default/chromedriver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();

       driver.get("https://uk-ua.facebook.com");
       // driver.findElement(By.xpath(".//*[@id='email']"));
       driver.findElement(By.xpath("//*[@data-testid='royal_email']"));

       driver.findElement(By.xpath("//*[@ data-testid='royal_pass']"));

       driver.findElement(By.xpath("//*[@id='loginbutton']"));

       driver.findElement(By.xpath(".//*[@id='u_0_1b']/div/div[1]/a/div"));

       driver.findElement(By.xpath(".//*[@id='js_cj']/div"));

       driver.findElement(By.xpath(".//*[@id='u_ps_0_0_a']/div[2]/div[1]"));

       driver.findElement(By.xpath(".//*[@id='navItem_2305272732']/a/div"));





    }

}

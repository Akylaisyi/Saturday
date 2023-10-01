package Saturday.stepdefs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US {
    @Test
    public void US1() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.turkishairlines.com/en-int/index.html?gclid=CjwKCAjwseSoBhBXEiwA9iZtxiZPXcabqToZqYbBIU7ZZrgxyW2-IJoTkrLtFOVsHQYbProC9up1mRoC53oQAvD_BwE");
        //driver.switchTo().frame("//button[.='I accept all cookies']");
        //driver.findElement(By.xpath("//button[.='I accept all cookies']")).click();
      //  driver.findElement(By.xpath("//a[@id='signupbtn']")).click();

    }
}

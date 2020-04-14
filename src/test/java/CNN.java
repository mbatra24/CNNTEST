import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CNN {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void CNN() {

        driver.get("https://www.cnn.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/header/div/div[1]/div/div[2]/nav/ul/li[5]/a")).click();
        System.out.println(driver.getTitle());

    }

    }


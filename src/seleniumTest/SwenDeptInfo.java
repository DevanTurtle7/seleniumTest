package seleniumTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static seleniumTest.DriverPreference.driverName;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

class SwenDeptInfos {

    private WebDriver driver;
    private String baseUrl;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "webdrivers/" + driverName); // can be replaced with Firefox driver
        driver = new ChromeDriver(); // can be replaced with Firefox
        baseUrl = "https://"; // TARGET URL
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
    
    //written by cws2525
    @Test
    public void testSwenDepartment() throws Exception {
    	System.out.println("***SWEN DEPARTMENT TEST***");
    	driver.get(baseUrl+"rit.edu/");
        //click academics
        driver.findElement(By.xpath("//*[@id=\"main-nav--link--academics\"]")).click();
        //click colleges
        driver.findElement(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-rit-main-menu\"]/ul/li[2]/div/div/ul[2]/li[1]/a")).click();
        //click golisano
        driver.findElement(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-content\"]/div[3]/div[3]/div/div/div/div/div/div/div/div/ul/li[3]/a")).click();
        //click contact
        driver.findElement(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-rit-main-menu\"]/ul/li[7]/a")).click();
        //click department of software engineering
        driver.findElement(By.xpath("//*[@id=\"card-header-4291\"]/p/a/span[1]")).click();
        Thread.sleep(3000);
        //print name
        String name = (driver.findElement(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article/div/div[2]/div[1]/a"))).getText();
        System.out.println(name);
        //print email
        String email = (driver.findElement(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article/div/div[3]/div[1]/a"))).getText();
        System.out.println(email);
        //print title
        String title = (driver.findElement(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article/div/div[2]/div[2]"))).getText();
        System.out.println(title);
        //print department
        String department = (driver.findElement(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article/div/div[2]/div[3]"))).getText();
        System.out.println(department);
        //print college
        String college = (driver.findElement(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article/div/div[2]/div[4]"))).getText();
        System.out.println(college);
        //print address
        String address = (driver.findElement(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article/div/div[3]/div[2]"))).getText();
        System.out.println(address);
           
        Thread.sleep(3000);
        
    }


}
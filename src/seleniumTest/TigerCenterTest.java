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

class TigerCenterClass {

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

    @Test
    public void testClassSearchButton() throws Exception {
        driver.get(baseUrl+"tigercenter.rit.edu/tigerCenterApp/landing");
        WebElement classButton = driver.findElement(By.xpath("//*[@id=\"angularApp\"]/app-root/div[2]/mat-sidenav-container[2]/mat-sidenav-content/div[2]/landing-page/div/div/div/div/div[4]/a[1]"));
        assertEquals("Class Search", classButton.getText());
        classButton.click();
    }
    
    //written by cws2525
    @Test
    public void testClassSearchSWEN352() throws Exception {
    	
        driver.get(baseUrl+"tigercenter.rit.edu/tigerCenterApp/landing");
        WebElement classButton = driver.findElement(By.xpath("//*[@id=\"angularApp\"]/app-root/div[2]/mat-sidenav-container[2]/mat-sidenav-content/div[2]/landing-page/div/div/div/div/div[4]/a[1]"));
        //assertEquals("Class Search", classButton.getText());
        classButton.click();
        
        //select term
        new Select (driver.findElement(By.xpath("//*[@id=\"hideTerm\"]/div/select"))).selectByVisibleText("2023-24 Fall (2231)");
        
        //clear search bar
        driver.findElement(By.xpath("//*[@id=\"ng2Completer\"]/div/input")).clear();
        
        //type swen 352
        driver.findElement(By.xpath("//*[@id=\"ng2Completer\"]/div/input")).sendKeys("swen 352");
        
        //click search
        driver.findElement(By.xpath("//*[@id=\"classSearchContainer\"]/div[2]/form/div/button")).click();
        
        //get list of webelements from class details table
        WebElement classDetails = driver.findElement(By.xpath("//*[@id=\"classSearchContainer\"]/div[2]/div[4]/div[5]"));
        
        //convert to list
        String tableText = classDetails.getText();
        String[] lines = tableText.split("\n");
        
        System.out.println("***SWEN 352 TEST***");
        //print days
        System.out.println("DAYS: " + lines[15]);
        //print time
        System.out.println("TIME: " + lines[16]);
     	//print location
        System.out.println("LOCATION: " + lines[17]);
     	//print instructor
        System.out.println("INSTRUCTOR: " + lines[18]);
        //3 second delay
        Thread.sleep(3000);
        
    }

    //written by jgw6160
    @Test
    public void testClassSearchSWEN101() throws Exception {
    	
        driver.get(baseUrl+"tigercenter.rit.edu/tigerCenterApp/landing");
        WebElement classButton = driver.findElement(By.xpath("//*[@id=\"angularApp\"]/app-root/div[2]/mat-sidenav-container[2]/mat-sidenav-content/div[2]/landing-page/div/div/div/div/div[4]/a[1]"));
        //assertEquals("Class Search", classButton.getText());
        classButton.click();
        
        //select term
        new Select (driver.findElement(By.xpath("//*[@id=\"hideTerm\"]/div/select"))).selectByVisibleText("2023-24 Fall (2231)");
        
        //clear search bar
        driver.findElement(By.xpath("//*[@id=\"ng2Completer\"]/div/input")).clear();
        
        //type swen 352
        driver.findElement(By.xpath("//*[@id=\"ng2Completer\"]/div/input")).sendKeys("swen 101");
        
        //click search
        driver.findElement(By.xpath("//*[@id=\"classSearchContainer\"]/div[2]/form/div/button")).click();
        
        //get list of webelements from class details table
        WebElement classDetails = driver.findElement(By.xpath("//*[@id=\"classSearchContainer\"]/div[2]/div[4]/div[5]"));
        
        //convert to list
        String tableText = classDetails.getText();
        String[] lines = tableText.split("\n");
        
        System.out.println("***SWEN 101 TEST***");
        //print days
        System.out.println("DAYS: " + lines[15]);
        //print time
        System.out.println("TIME: " + lines[16]);
     	//print location
        System.out.println("LOCATION: " + lines[17]);
     	//print instructor
        System.out.println("INSTRUCTOR: " + lines[18]);
        //3 second delay
        Thread.sleep(3000);
        
    }

}

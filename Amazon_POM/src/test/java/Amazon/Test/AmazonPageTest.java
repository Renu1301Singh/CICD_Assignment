package Amazon.Test;
import Amazon.Pages.AmazonAddToCart;
import Amazon.Pages.AmazonHomePage;
import Amazon.Pages.AmazonProceedToBuy;
import Amazon.Pages.AmazonProductColourPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class AmazonPageTest {
    WebDriver driver;
    String driverPath="/usr/bin/chromedriver";
    AmazonHomePage amazonHomePage;
    AmazonProductColourPage amazonProductColourPage;
    AmazonAddToCart amazonAddToCart;
    AmazonProceedToBuy amazonProceedToBuy;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
         
    }
    @Test(priority = 0, description = "This Test validates the Amazon page is launched")
    void AmazonLaunch(){
        amazonHomePage=new AmazonHomePage(driver);
        amazonHomePage.verifyPageLaunch();
    }
    @Test(priority = 1, description = "This Test Boat headphones are searched using Search box")
    void ProductSearch(){
        amazonHomePage.addsearch("Boat Headphones");
        amazonHomePage.clicksearch();
        amazonHomePage.VerifySearchItem();
    }
// If the first item appeared on the product list doesn't have colours the test will fail
    @Test(priority = 2,description = "This test validates First item selected and colour of the item can be changed")
    public void ProductColour(){
        amazonProductColourPage=new AmazonProductColourPage(driver);
        amazonProductColourPage.SelectProduct();
        for(String window: driver.getWindowHandles()){
            driver.switchTo().window(window);
        }
        amazonProductColourPage.ChangeColour();
        amazonProductColourPage.IsProductColour();

    }
    @Test(priority = 3,description = "This test validates First item selected is added to cart")
    public void IsAddedToCart(){
        amazonAddToCart=new AmazonAddToCart(driver);
        amazonAddToCart.AddToCartButton();
        amazonAddToCart.navigateToShoppingCart();
        amazonAddToCart.assertShoppingCartPage();
    }
    @Test(priority = 4,description = "This test validates Proceed to buy Button is clicked")
    public void IsProceedToBuy(){
        amazonProceedToBuy=new AmazonProceedToBuy(driver);
        amazonProceedToBuy.ProceedToBuy();
        amazonProceedToBuy.IsProceedToBuy();

    }
    @AfterTest

    public void tearDown(){
        driver.quit();
    }
}

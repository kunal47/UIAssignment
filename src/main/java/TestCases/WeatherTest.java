package TestCases;

import PageObjects.HomePage;
import PageObjects.WeatherDataPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WeatherTest {
    private WebDriver driver;
    private HomePage homePage;
    private WeatherDataPage weatherDataPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Test
    public void testWeatherForecast() {
        homePage.openPage("https://www.visualcrossing.com");
        weatherDataPage = homePage.navigateToWeatherDataPage();
        weatherDataPage.enterCityAndSearch("Bengaluru"); // Replace with your city name
        Assert.assertTrue(weatherDataPage.isWeatherForecastDisplayed(), "Weather forecast not displayed.");

        // You can add more assertions here to verify additional scenarios.
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

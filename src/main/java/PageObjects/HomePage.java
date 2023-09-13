package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public WeatherDataPage navigateToWeatherDataPage() {
        driver.findElement(By.linkText("Weather Data")).click();
        return new WeatherDataPage(driver);
        
    }
}

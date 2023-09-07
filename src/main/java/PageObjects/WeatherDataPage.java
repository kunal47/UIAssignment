
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeatherDataPage {
    private WebDriver driver;

    public WeatherDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCityAndSearch(String cityName) {
        driver.findElement(By.id("wxlocation")).sendKeys(cityName);
        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
    }

    public boolean isWeatherForecastDisplayed() {
        return driver.findElement(By.id("locationDropdownMenuButton")).isDisplayed();
    }
}

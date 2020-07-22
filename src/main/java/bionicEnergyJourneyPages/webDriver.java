package bionicEnergyJourneyPages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class webDriver {
    WebDriver driver;
    public webDriver(WebDriver driver)
    {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}

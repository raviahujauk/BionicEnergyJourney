package bionicEnergyJourneyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bionicEnergyJourneyLandingPage extends webDriver {

    public bionicEnergyJourneyLandingPage(WebDriver driver) {
        super(driver);
    }

    public bionicEnergyJourneyLandingPage navigateToBionicEnergyJourneyLandingPage (String url)
    {
        driver.manage().window().maximize();
        driver.get(url);
        return new bionicEnergyJourneyLandingPage(driver);
    }

    public bionicEnergyJourneyLandingPage enterPostcode (String postcode)
    {
        driver.findElement(By.id("postcode-input-top")).sendKeys(postcode);
        return new bionicEnergyJourneyLandingPage(driver);
    }

    public bionicEnergyJourneyLandingPage clickStartQuote()
    {
        driver.findElement(By.xpath("//form[@class='form-inline postcode-form-validate postcode-form-validate-top postcode-form-top d-none d-lg-flex']/button[@class='btn hover-ripple postcode-search-button postcode-form-top__button']")).click();
        return new bionicEnergyJourneySelectAddress(driver);
    }

}

package bionicEnergyJourneyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bionicEnergyJourneySelectAddress extends bionicEnergyJourneyLandingPage {
    public bionicEnergyJourneySelectAddress(WebDriver driver) {  super(driver);     }

    public bionicEnergyJourneySelectAddress enterOnSearchField(String searchAddress)
    {
        driver.findElement(By.xpath("//input[@class='addresses__search-input-field']")).sendKeys(searchAddress);
        return new bionicEnergyJourneySelectAddress(driver);
    }

    public bionicEnergyJourneySelectAddress clickOnAddress(String addressKeyWord)
    {
        driver.findElement(By.xpath("//input[contains(@value,'"+addressKeyWord+"') and @type='submit']")).click();
        return new bionicEnergyJourneyBusinessNamePage(driver);
    }

}

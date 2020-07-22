package bionicEnergyJourneyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bionicEnergyJourneyIndustryDataAgreementPage extends bionicEnergyJourneySwitchTypePage {
    public bionicEnergyJourneyIndustryDataAgreementPage(WebDriver driver) {   super(driver);    }

    public bionicEnergyJourneyIndustryDataAgreementPage clickOnYes()
    {
        driver.findElement(By.xpath("//input[@value='Yes']")).click();
        return new bionicEnergyJourneyIndustryDataPage(driver);
    }
}

package bionicEnergyJourneyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bionicEnergyJourneyIndustryDataPage extends bionicEnergyJourneyIndustryDataAgreementPage {
    public bionicEnergyJourneyIndustryDataPage(WebDriver driver) {    super(driver);   }

    public bionicEnergyJourneyIndustryDataPage clickNextStepOldJourney() throws Exception
    {

            driver.findElement(By.xpath("//div[@class='col-lg-3 text-right']/form/button[@name='button']")).click();

       // else
        //{
        //    driver.findElement(By.className("industry-data-review__next")).click();
        //}
        return new bionicEnergyJourneyChatPage(driver);
    }

    public bionicEnergyJourneyIndustryDataPage clickNextStepCDCJourney() throws Exception
    {
        driver.findElement(By.className("industry-data-review__next")).click();
        return new bionicEnergyJourneyIContractDetailsPage(driver);
    }
}

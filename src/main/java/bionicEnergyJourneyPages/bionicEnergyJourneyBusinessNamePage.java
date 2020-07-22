package bionicEnergyJourneyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bionicEnergyJourneyBusinessNamePage extends bionicEnergyJourneySelectAddress {
    public bionicEnergyJourneyBusinessNamePage(WebDriver driver) {  super(driver);   }

    public bionicEnergyJourneyBusinessNamePage enterBusinessName(String businessName)
    {
        driver.findElement(By.id("business_name")).sendKeys(businessName);
        return new bionicEnergyJourneyBusinessNamePage(driver);
    }

    public bionicEnergyJourneyBusinessNamePage clickNext()
    {
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        return new bionicEnergyJourneySwitchTypePage(driver);
    }
}

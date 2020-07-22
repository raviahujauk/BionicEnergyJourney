package bionicEnergyJourneyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bionicEnergyJourneyIContractDetailsPage extends bionicEnergyJourneyIndustryDataPage {
    public bionicEnergyJourneyIContractDetailsPage(WebDriver driver) {   super(driver);   }

    public bionicEnergyJourneyIContractDetailsPage clickIAmNotSureCDCPage() throws Exception{
            driver.findElement(By.xpath("//span[contains(text(),'m not sure')]")).click();
            return new bionicEnergyJourneyContactInfo(driver);
        }

    }



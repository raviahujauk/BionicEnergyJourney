package bionicEnergyJourneyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bionicEnergyJourneyContactInfo extends bionicEnergyJourneyIContractDetailsPage {
    public bionicEnergyJourneyContactInfo(WebDriver driver) {    super(driver);  }

    public bionicEnergyJourneyContactInfo enterFullName(String name) throws Exception
    {
        driver.findElement(By.name("Name")).sendKeys(name);
        return new bionicEnergyJourneyContactInfo(driver);
    }

    public bionicEnergyJourneyContactInfo enterPhoneNumber(String phone) throws Exception
    {
        driver.findElement(By.name("Phone")).sendKeys(phone);
        return new bionicEnergyJourneyContactInfo(driver);
    }

    public bionicEnergyJourneyContactInfo enterEmail(String email) throws Exception
    {
        driver.findElement(By.id("email-input")).sendKeys(email);
        return new bionicEnergyJourneyContactInfo(driver);
    }

    public bionicEnergyJourneyContactInfo enterFinaliseMyQuotes() throws Exception
    {
        driver.findElement(By.xpath("//button[contains(text(), 'Finalise my quotes')]")).click();
        return new bionicEnergyJourneyContactInfo(driver);
    }

}

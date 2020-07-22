package bionicEnergyJourneyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bionicEnergyJourneyChatPage extends bionicEnergyJourneyIndustryDataPage {
    public bionicEnergyJourneyChatPage(WebDriver driver) {  super(driver);    }

    public bionicEnergyJourneyChatPage selectIamNotSurefromChatPage() throws Exception
    {
        driver.findElement(By.xpath("//label[@for='contract-unsure']")).click();
        return new bionicEnergyJourneyChatPage(driver);
    }

    public bionicEnergyJourneyChatPage Scheduleforlater() throws Exception
    {
        WebElement calllater = driver.findElement(By.id("call-later"));
        if (calllater.isDisplayed())
        {
            calllater.click();
        }
        return new bionicEnergyJourneyChatPage(driver);
    }

    public bionicEnergyJourneyChatPage enterFullName(String name) throws Exception
    {
        driver.findElement(By.id("name")).sendKeys(name);
        return new bionicEnergyJourneyChatPage(driver);
    }

    public bionicEnergyJourneyChatPage enterEmail(String email) throws Exception
    {
        driver.findElement(By.id("email")).sendKeys(email);
        return new bionicEnergyJourneyChatPage(driver);
    }

    public bionicEnergyJourneyChatPage enterPhone(String phone) throws Exception
    {
        driver.findElement(By.id("telephone_number")).sendKeys(phone);
        return new bionicEnergyJourneyChatPage(driver);
    }

    public bionicEnergyJourneyChatPage clickScheduleCallButton() throws Exception
    {
        driver.findElement(By.id("schedule-callback-submit")).click();
        return new bionicEnergyJourneyChatPage(driver);
    }
}

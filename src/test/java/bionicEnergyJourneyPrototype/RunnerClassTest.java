package bionicEnergyJourneyPrototype;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        //glue="test.java.bionicTestPrototype",
        plugin={"pretty",
                "html:TargetReport/cucumber-html-report",
                "json:TargetReport/cucumber.json",
                "junit:TargetReport/cucumber.xml",
                "rerun:TargetReport/rerun.txt" },
        tags = {}
)

public class RunnerClassTest {
}

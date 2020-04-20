package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import runnerFiles.DriverFactory;



public class ConfigNav {

	private DriverFactory driverFactory;

//	@Before("@Firefox")
//	public void beforeScenario() {
//		driverFactory = new DriverFactory(1);
//	}

	@Before("@Chrome")
	public void beforeScenario1() {
		driverFactory = new DriverFactory(2);
	}


	@After
	public void FechaNavegador(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.write("FAIL_" + scenario.getName() + "_" + scenario.getStatus());
			byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		} else {
			scenario.write("SUCESS_" + scenario.getName() + "_" + scenario.getStatus());
			byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		driverFactory.closeBrowser();
	}
}

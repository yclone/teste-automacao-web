package runnerFiles;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	private static WebDriver driver = null;
	String gridAddress = "192.168.1.246:4444";
	DesiredCapabilities capability;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverFactory.driver = driver;
	}

	public DriverFactory() {

	}

	public DriverFactory(int browserType) {
		try {
			driver = getWebDriver(browserType);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		driver.quit();
	}

	public WebDriver getWebDriver(int browserType) throws MalformedURLException {
		switch (browserType) {
		// case "Firefox":
		case 1:
			capability = DesiredCapabilities.firefox();
			FirefoxOptions optionsF = new FirefoxOptions();
			// optionsF.addArguments("--headless");
			optionsF.addArguments("--start-maximized");
			capability = DesiredCapabilities.firefox();
			capability.setCapability("marionette", true);
			return new RemoteWebDriver(new URL("http://" + gridAddress + "/wd/hub"), optionsF);
		// case "Chrome":
		case 2:
			ChromeOptions optionsC = new ChromeOptions();
			// optionsC.addArguments("--headless");
			optionsC.addArguments("--start-maximized");
			optionsC.addArguments("use-fake-ui-for-media-stream");
			capability = DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
			capability.setCapability(ChromeOptions.CAPABILITY, optionsC);
			return new RemoteWebDriver(new URL("http://" + gridAddress + "/wd/hub"), capability);
		default:
			throw new RuntimeException("Browser N�o Suportado!!!!");
		}
	}

}

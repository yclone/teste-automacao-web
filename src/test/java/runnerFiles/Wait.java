package runnerFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	private static WebDriver driver;
	private static WebDriverWait jsWait;
	private static JavascriptExecutor jsExec;

	// Get driver
	public static void setDriver(WebDriver SetDriver) {
		driver = SetDriver;
		jsWait = new WebDriverWait(driver, 30);
		jsExec = (JavascriptExecutor) driver;
	}

	public void waitGifLoading(By resp) {
		try {
			// JavascriptExecutor js = (JavascriptExecutor) driver;
			if (driver.findElement(resp).isEnabled()) {
				// System.out.println("TEM LOADING");
				// System.out.println("VALOR DO DISPLAY = |" +
				// driver.findElement(resp).getCssValue("display") + "| " + resp.toString());
				if (("block".equals(driver.findElement(resp).getCssValue("display")))) {
					// System.out.println("Dentro do
					// ExpectedConditions.visibilityOfElementLocated");
					// System.out.println("GIF block is NOT Ready!");
					jsWait.until(ExpectedConditions.invisibilityOfElementLocated(resp));
					// System.out.println("PAROU DE RODAR");
				}
				if (!("none".equals(driver.findElement(resp).getCssValue("display")))) {
					System.out.println("GIF none is NOT Ready!");
					jsWait.until(ExpectedConditions.invisibilityOfElementLocated(resp));
					System.out.println("GIF Stop!");
				} else {
					System.out.println("GIF is Ready!");
				}
			}
		} catch (Exception e) {
			System.out.println("GIF is not defined on this site!");
		}

	}

	public boolean waitForLoadPage() {
		boolean resp = false;
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			resp = wait.until(pageLoadCondition);
			return resp;
		} catch (Exception e) {
			return resp;
		}

	}

	// Wait JQuery
	public static void waitForJQueryLoad() {
		// Wait for jQuery to load
		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
			}
		};

		// Get JQuery is Ready
		boolean jqueryReady = (Boolean) jsExec.executeScript("return jQuery.active==0");

		// Wait JQuery until it is Ready!
		if (!jqueryReady) {
			 System.out.println("JQuery is NOT Ready!");
			// Wait for jQuery to load
			jsWait.until(jQueryLoad);
		} else {
			 System.out.println("JQuery is Ready!");
		}
	}

	// Wait Angular
	public static void waitForAngularLoad() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;

		final String angularReadyScript = "return angular.element(document).injector().get('$http').pendingRequests.length === 0";

		// Wait for ANGULAR to load
		ExpectedCondition<Boolean> angularLoad = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return Boolean.valueOf(((JavascriptExecutor) driver).executeScript(angularReadyScript).toString());
			}
		};

		// Get Angular is Ready
		boolean angularReady = Boolean.valueOf(jsExec.executeScript(angularReadyScript).toString());

		// Wait ANGULAR until it is Ready!
		if (!angularReady) {
			 System.out.println("ANGULAR is NOT Ready!");
			 //Wait for Angular to load
			wait.until(angularLoad);
		} else {
			 System.out.println("ANGULAR is Ready!");
		}
	}

	// Wait Until JS Ready
	public static void waitUntilJSReady() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;

		// Wait for Javascript to load
		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};

		// Get JS is Ready
		boolean jsReady = (Boolean) jsExec.executeScript("return document.readyState").toString().equals("complete");

		// Wait Javascript until it is Ready!
		if (!jsReady) {
			// System.out.println("JS in NOT Ready!");
			// Wait for Javascript to load
			wait.until(jsLoad);
		} else {
			// System.out.println("JS is Ready!");
		}
	}

	// Wait Until JQuery and JS Ready
	public static void waitUntilJQueryReady() {
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;

		// First check that JQuery is defined on the page. If it is, then wait AJAX
		Boolean jQueryDefined = (Boolean) jsExec.executeScript("return typeof jQuery != 'undefined'");
		if (jQueryDefined == true) {
			// Pre Wait for stability (Optional)
			// sleep(20);

			// Wait JQuery Load
			waitForJQueryLoad();

			// Wait JS Load
			waitUntilJSReady();

			// Post Wait for stability (Optional)
			// sleep(20);
		} else {
			// System.out.println("jQuery is not defined on this site!");
		}
	}

	// Wait Until Angular and JS Ready
	public static void waitUntilAngularReady() {
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;

		// First check that ANGULAR is defined on the page. If it is, then wait ANGULAR
		Boolean angularUnDefined = (Boolean) jsExec.executeScript("return window.angular === undefined");
		if (!angularUnDefined) {
			Boolean angularInjectorUnDefined = (Boolean) jsExec
					.executeScript("return angular.element(document).injector() === undefined");
			if (!angularInjectorUnDefined) {
				// Pre Wait for stability (Optional)
				sleep(20);

				// Wait Angular Load
				waitForAngularLoad();

				// Wait JS Load
				waitUntilJSReady();

				// Post Wait for stability (Optional)
				sleep(20);
			} else {
				 System.out.println("Angular injector is not defined on this site!");
			}
		} else {
			 System.out.println("Angular is not defined on this site!");
		}
	}

	// Wait Until JQuery Angular and JS is ready
	public static void waitJQueryAngular() {
		waitUntilJQueryReady();
		waitUntilAngularReady();
	}

	public static void sleep(Integer seconds) {
		long secondsLong = (long) seconds;
		try {
			Thread.sleep(secondsLong);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Boolean WaitElementIsRead(By Element) {
		try {
			waitJQueryAngular();
			Shared.wait.until(ExpectedConditions.elementToBeClickable(Element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}

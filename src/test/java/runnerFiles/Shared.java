package runnerFiles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shared extends Wait {

	WebDriver driver;
	public static WebDriverWait wait;

	public Shared(WebDriver driver) {
		this.driver = driver;
		setDriver(driver);
		wait = new WebDriverWait(driver, 60);
	}

	public Shared nagevar(String url) {
		driver.switchTo().defaultContent();
		driver.manage().deleteAllCookies();
		driver.navigate().to(url);
		return new Shared(driver);
	}

	public Shared digitar(By iArg, String arg) {
		arg = arg.trim();
		wait.until(ExpectedConditions.elementToBeClickable(iArg));
		WebElement element = driver.findElement(iArg);
		element.click();
		element.clear();
		element.sendKeys(Keys.HOME);
		element.sendKeys(arg);
		element.sendKeys(Keys.TAB);
		return new Shared(driver);
	}

	public Shared clicar(By item) {
		wait.until(ExpectedConditions.elementToBeClickable(item));
		driver.switchTo().defaultContent();
		WebElement itemDig = driver.findElement(item);
		itemDig.click();
		waitUntilJQueryReady();
		return new Shared(driver);
	}

	public Shared selecionarCountr(By item, String arg1) {
		wait.until(ExpectedConditions.elementToBeClickable(item));
		arg1 = arg1.trim();
		WebElement itemSelect = driver.findElement(item);
		itemSelect.click();
		WebElement cpoBusca = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		cpoBusca.sendKeys(arg1);
		cpoBusca.sendKeys(Keys.TAB);
		return new Shared(driver);
	}

	public Shared selecionar(By item, String arg1) {
		 wait.until(ExpectedConditions.elementToBeClickable(item));
		    arg1 = arg1.trim();
		    WebElement itemSelect = driver.findElement(item);
		    itemSelect.click();
		    Select itemselect = new Select(itemSelect);
		    itemselect.selectByVisibleText(arg1);
		    return new Shared(driver);
	}

	public String ColetaTexto(By campo) {
		wait.until(ExpectedConditions.elementToBeClickable(campo));
		String textoColetado = DriverFactory.getDriver().findElement(campo).getText();
		System.out.println("Texto coletado : " + textoColetado);
		return textoColetado;
	}

}

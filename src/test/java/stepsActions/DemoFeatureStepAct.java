package stepsActions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import runnerFiles.Shared;

public class DemoFeatureStepAct {

	WebDriver driver;
	Shared steps;

	private final By cpoEmail = By.name("email");
	private final By cpoSenha = By.name("password");
	private final By btnLogin = By.xpath("//button[@type='submit']");
	private final By txtLogout = By.id("logout");
	private final By CpoAcounts = By.xpath("//a[contains(@href, '#ACCOUNTS')]");
	private final By optSupplier = By.xpath("//ul[@id='ACCOUNTS']/li[2]/a");
	private final By OptAdicionar = By.cssSelector("form.add_button > button.btn.btn-success");
	

	//Formulario
	private final By fname = By.name("fname");
	private final By lname = By.name("lname");
	private final By email = By.name("email");
	private final By password = By.name("password");
	private final By mobile = By.name("mobile");
	private final By country = By.xpath("//div[@id='s2id_autogen1']/a/span[2]/b");
	private final By address1 = By.name("address1");
	private final By address2 = By.name("address2");
	private final By applyfor = By.name("applyfor");
	private final By itemname = By.name("itemname");
	private final By BtnSubmit = By.xpath("//div[3]/button");
	
	private final By txtCadSucesso = By.xpath("//div[4]/div/h4");


	public DemoFeatureStepAct(WebDriver driver) {
		this.driver = driver;
		steps = new Shared(driver);
	}
	
	
	public void digitaEmail(String email) {
		steps.digitar(cpoEmail, email);
		
	}

	public void digitaSenha(String senha) {
		steps.digitar(cpoSenha, senha);
		
	}
	
	public void clicaLogar() {
		steps.clicar(btnLogin);
		
	}

	public void validaLogin() {
		String txtColetado = steps.ColetaTexto(txtLogout);
		assertEquals(txtColetado, "Logout");
	}


	public void clicarCpoAcounts() {
		steps.clicar(CpoAcounts);
		
	}


	public void ClicaroptSuppliers() {
		steps.clicar(optSupplier);
		
	}


	public void clicarOptAdicionar() {
		steps.clicar(OptAdicionar);
		
	}


	public void digitarFName(String string) {
		steps.digitar(fname, string);
		
	}


	public void digitarLName(String string) {
		steps.digitar(lname, string);
		
	}


	public void digitaremail(String string) {
		steps.digitar(email, string);
		
	}


	public void digitarPass(String string) {
		steps.digitar(password, string);
		
	}


	public void digitarMobile(String string) {
		steps.digitar(mobile, string);
		
	}


	public void selecionarCountry(String string) {
		steps.selecionarCountr(country, string);
		
		
	}


	public void digitaraddrs1(String string) {
		steps.digitar(address1, string);
		
	}


	public void digitaraddrs2(String string) {
		steps.digitar(address2, string);
		
	}


	public void digitaritemName(String string) {
		steps.digitar(itemname, string);
		
	}
	

	public void selecionarSup(String string) {
		steps.selecionar(applyfor, string);
		
	}


	public void clicarBtnSubmit() {
		steps.clicar(BtnSubmit);
		
	}

	public void validaCadastro() {
		String txtColetado = steps.ColetaTexto(txtCadSucesso);
		assertEquals(txtColetado, "Changes Saved!");
	}


	
//	--------------------------------------------------------------------------------


//	public DemoFeatureStepAct digitaBusca(String busca) {
//		steps.digitar(cpoBusba, busca);
//		return new DemoFeatureStepAct(driver);
//
//	}
//
//	public DemoFeatureStepAct clicaBtnBusca() {
//		steps.clicar(btnSearch);
//		return new DemoFeatureStepAct(driver);
//
//	}
//	
//	public DemoFeatureStepAct clicaProduto() {
//		steps.clicar(produto1);
//		return new DemoFeatureStepAct(driver);
//	}
//
//	public DemoFeatureStepAct addProdutoCarrinho() {
//		steps.clicar(addSacola);
//		return new DemoFeatureStepAct(driver);
//	}
//
//	public DemoFeatureStepAct clicaHome() {
//		steps.clicar(iconHome);
//		return new DemoFeatureStepAct(driver);
//	}
//
//	public DemoFeatureStepAct clicaIconCarrinho() {
//		steps.clicar(iconCar);
//		return new DemoFeatureStepAct(driver);
//	}
//
//	public DemoFeatureStepAct remItem() {
//		steps.clicar(btnRem);
//		return new DemoFeatureStepAct(driver);
//	}
//	
//	public DemoFeatureStepAct validaRetorno() {
//		String retornoCpo = steps.ColetaTexto(TxtColetado);
//		System.out.println(retornoCpo);
//		String value[] = retornoCpo.split(" ");
//		int num = 0;
//		boolean temValor;
//		try {
//			num = Integer.parseInt(value[0]);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		if(num == 0) {
//			temValor = true;
//		} else {
//			temValor = false;
//		}
//		try {
//			assertTrue(temValor);
//		} catch (Error e) {
//			System.err.println("campo n�o encontrado " + e);
//		}
//		return new DemoFeatureStepAct(driver);
//
//	}
//
//	public DemoFeatureStepAct validaRetornoParan(String resp) {
//		String retornoCpo = steps.ColetaTexto(TxtSacola);
//		System.out.println(retornoCpo);
//		try {
//			assertEquals(retornoCpo, resp);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return new DemoFeatureStepAct(driver);
//
//	}
//	
//	public DemoFeatureStepAct validaTxtRemove(String resp) {
//		String retornoCpo = steps.ColetaTexto(txtRemove);
//		System.out.println(retornoCpo);
//		try {
//			assertEquals(retornoCpo, resp);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return new DemoFeatureStepAct(driver);
//
//	}

}

package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import runnerFiles.DriverFactory;
import runnerFiles.Shared;
import stepsActions.DemoFeatureStepAct;

public class DemoFeatureStepDef {

	WebDriver webDriver = DriverFactory.getDriver();
	Shared action = new Shared(webDriver);

	@Dado("que o usuario acesse o site da phptravels pela URL {string}")
	public void que_o_usuario_acesse_o_site_da_phptravels_pela_URL(String url) {
		action.nagevar(url);
	}

	@Quando("digitar no campo de email o valor {string}")
	public void digitar_no_campo_de_email_o_valor(String email) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitaEmail(email);
	}

	@Quando("digitar no campo senha o valor {string}")
	public void digitar_no_campo_senha_o_valor(String senha) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitaSenha(senha);
	}

	@Quando("clicar em logar")
	public void clicar_em_logar() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.clicaLogar();
	}

	@Entao("deve ser logado no sistema")
	public void deve_ser_logado_no_sistema() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.validaLogin();
	}

	@Quando("clicar no campo Acounts")
	public void clicar_no_campo_Acounts() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.clicarCpoAcounts();
	}

	@Quando("clicar na opcao suppliers")
	public void clicar_na_opcao_suppliers() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.ClicaroptSuppliers();
	}

	@Quando("clicar no botao adiconar")
	public void clicar_no_botao_adiconar() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.clicarOptAdicionar();
	}

	@Quando("dentro do formulario digitar no campo First Name o valor {string}")
	public void dentro_do_formulario_digitar_no_campo_First_Name_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitarFName(string);
	}

	@Quando("dentro do formulario digitar no campo Last Name o valor {string}")
	public void dentro_do_formulario_digitar_no_campo_Last_Name_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitarLName(string);
	}

	@Quando("dentro do formulario digitar no campo email o valor {string}")
	public void dentro_do_formulario_digitar_no_campo_email_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitaremail(string);
	}

	@Quando("dentro do formulario digitar no campo Password o valor {string}")
	public void dentro_do_formulario_digitar_no_campo_Password_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitarPass(string);
	}

	@Quando("dentro do formulario digitar no campo Mobile Number o valor {string}")
	public void dentro_do_formulario_digitar_no_campo_Mobile_Number_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitarMobile(string);
	}

	@Quando("dentro do formulario selecionar no campo Country o valor {string}")
	public void dentro_do_formulario_selecionar_no_campo_Country_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.selecionarCountry(string);
	}

	@Quando("dentro do formulario digitar no campo Address 1 o valor {string}")
	public void dentro_do_formulario_digitar_no_campo_Address_1_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitaraddrs1(string);
	}
	
	@Quando("dentro do formulario digitar no campo Address 2 o valor {string}")
	public void dentro_do_formulario_digitar_no_campo_Address_2_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitaraddrs2(string);
	}

	@Quando("dentro do formulario selecionar no campo Supplier For o valor {string}")
	public void dentro_do_formulario_selecionar_no_campo_Supplier_For_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.selecionarSup(string);
	}

	@Quando("dentro do formulario digitar no campo intem name o valor {string}")
	public void dentro_do_formulario_digitar_no_campo_intem_name_o_valor(String string) {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.digitaritemName(string);
	}

	@Quando("dentro do formulario clicar no botao submit")
	public void dentro_do_formulario_clicar_no_botao_submit() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		stepAct.clicarBtnSubmit();
	}

	@Entao("o formulaio deve ser criado com sucesso")
	public void o_formulaio_deve_ser_criado_com_sucesso() {
		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
		
	}

//	_________________________________________________________________________________________

//	@Dado("que o usuario acesse o site da magazine Luiza pela URL {string}")
//	public void que_o_usuario_acesse_o_site_da_magazine_Luiza_pela_URL_https_www_magazineluiza_com_br(String url) {
//		action.nagevar(url);
//	}
//
//	@Quando("digitar no campo de busca o valor {string}")
//	public void digitar_no_campo_de_busca_o_valor_hd_ssd(String busca) {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
//		stepAct.digitaBusca(busca);
//	}
//
//	@Quando("clicar no icone de busca")
//	public void clicar_no_icone_de_busca() {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);		
//		stepAct.clicaBtnBusca();
//	}
//
//	@Entao("deve ser retornado busca do produto")
//	public void deve_ser_retornado_busca_do_produto() {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
//		stepAct.validaRetorno();
//	}
//
//	@Quando("clicar no produto retornado")
//	public void clicar_no_produto_retornado() {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
//		stepAct.clicaProduto();
//	}
//
//	@Quando("adicionar o produto ao carrinho")
//	public void adicionar_o_produto_ao_carrinho() {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
//		stepAct.addProdutoCarrinho();
//	}
//	    
//
//	@Entao("o produto deve ser inserido no carrinho {string}")
//	public void o_produto_deve_ser_inserido_no_carrinho(String retorno) {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
//		stepAct.validaRetornoParan(retorno);
//	}
//	
//	@Quando("voltar para a home do site")
//	public void voltar_para_a_home_do_site() {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
//		stepAct.clicaHome();
//	}
//
//	@Quando("clicar no icone do carrinho")
//	public void clicar_no_icone_do_carrinho() {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
//		stepAct.clicaIconCarrinho();
//	}
//
//	@Quando("clicar em remover o item")
//	public void clicar_em_remover_o_item() {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
//		stepAct.remItem();
//	}
//
//	@Entao("o produto deve ser removido do carrinho {string}")
//	public void o_produto_deve_ser_removido_do_carrinho(String string) {
//		DemoFeatureStepAct stepAct = new DemoFeatureStepAct(webDriver);
//		stepAct.validaTxtRemove(string);
//	}

}

package br.fonseca.ivan.pages;

import static br.fonseca.ivan.core.DriverManager.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import br.fonseca.ivan.core.BasePage;

public class CadastroPage extends BasePage {
	
	public void acessarTelaCadastro() {		
		abrirURL("http://automationpractice.com/index.php");
		clicarElementoByClassName("login");
	}
	
	public void setEmailcadastro(String email) {
		getDriver().findElement(By.id("email_create")).sendKeys(email);
	}
	
	public void iniciarCadastro() {
		clicarElementoById("SubmitCreate");
	}
	
	public void esperarPagina() {
		getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
	
	public void setGeneroMasculino() {
		clicarElementoById("uniform-id_gender1");
	}
	
	public void setPrimeiroNome(String primeiroNome) {
		preencherTextoById("customer_firstname", primeiroNome);
	}
	
	public void setUltimoNome(String ultimoNome) {
		preencherTextoById("customer_lastname", ultimoNome);
	}
	
	public void setEmail(String email) {
		preencherTextoById("email", email);
	}
	
	public void setSenha(String senha) {
		preencherTextoById("passwd", senha);
	}
	
	public void setDiaNascimento(String dia) {
		selecionarCombo("days", dia);
	}
	
	public void setMesNascimento(String mes) {
		selecionarCombo("months", mes);
	}
	
	public void setAnoNascimento(String ano) {
		selecionarCombo("years", ano);
	}
	
	public void setNewsletter() {
		clicarElementoById("newsletter");
	}
	
	public void setOptions() {
		clicarElementoById("optin");
	}
	
	public void setEmpresa(String empresa) {
		preencherTextoById("company", empresa);
	}
	
	public void setEndereco1(String endereco1) {
		preencherTextoById("address1", endereco1);
	}
	
	public void setEndereco2(String endereco2) {
		preencherTextoById("address2", endereco2);
	}
	
	public void setCidade(String cidade) {
		preencherTextoById("city", cidade);
	}
	
	public void setEstado(String value) {
		selecionarCombo("id_state", value);
	}
	
	public void setCep(String cep) {
		preencherTextoById("postcode", cep);
	}
	
	public void setPais(String value) {
		selecionarCombo("id_country", value);
	}
	
	public void setInfoAdicionais(String info) {
		preencherTextoById("other", info);
	}
	
	public void setTelefone(String telefone) {
		preencherTextoById("phone", telefone);
	}
	
	public void setCelular(String celular) {
		preencherTextoById("phone_mobile", celular);
	}
	
	public void setEnderecoReferencia(String enderecoReferencia) {
		preencherTextoById("alias", enderecoReferencia);
	}
	
	public void enviarCadastro() {
		clicarElementoById("submitAccount");
	}
	
	public void limparEnderecoReferencia() {
		limparCampoById("alias");
	}

}

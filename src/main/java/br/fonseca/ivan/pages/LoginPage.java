package br.fonseca.ivan.pages;

import br.fonseca.ivan.core.BasePage;

public class LoginPage extends BasePage {
	
	public void acessarTelaLogin() {		
		abrirURL("http://automationpractice.com/index.php");
		clicarElementoByClassName("login");
	}
	
	public void setEmail(String email) {
		preencherTextoById("email",email);
	}
	
	public void setSenha(String senha) {
		preencherTextoById("passwd",senha);
	}
	
	public void logar() {
		clicarElementoById("SubmitLogin");
	}

}

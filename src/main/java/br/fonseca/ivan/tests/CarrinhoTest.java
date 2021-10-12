package br.fonseca.ivan.tests;

import org.junit.Assert;
import org.junit.Test;

import br.fonseca.ivan.pages.LoginPage;
import br.fonseca.ivan.pages.ProdutosPage;

public class CarrinhoTest {
		
	private LoginPage loginPage = new LoginPage();
	private ProdutosPage produtosPage = new ProdutosPage();
	
	@Test
	public void adicionarProdutoCarrinho() {		
		
		//Fazer login na loja
		loginPage.acessarTelaLogin();
		loginPage.setEmail("ivanfonseca.web@gmail.com");
		loginPage.setSenha("123456");
		loginPage.logar();
		
		//Acessar página de produtos
		produtosPage.abrirURL("http://automationpractice.com/index.php");
		
		//Selecionar produto e adicionar ao carrinho
		produtosPage.adicionarProdutoCarrinho();
		
		//Faltou pegar o texto pra fazer o assert
		Assert.assertEquals("Product successfully added to your shopping cart", " ");
	}
}

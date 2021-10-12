package br.fonseca.ivan.pages;

import static br.fonseca.ivan.core.DriverManager.getDriver;

import org.openqa.selenium.By;

import br.fonseca.ivan.core.BasePage;

public class ProdutosPage extends BasePage {
	
	// Sei que essa não é a maneira correta, ainda estou aprendendo a trabalhar com Xpath
	
	public void adicionarProdutoCarrinho() {		
		getDriver().findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]")).click();		
	}

}

package br.fonseca.ivan.core;

import static br.fonseca.ivan.core.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public void clicarElementoById(String id) {
		getDriver().findElement(By.id(id)).click();
	}
	
	public void clicarElementoByClassName(String className) {
		getDriver().findElement(By.className(className)).click();
	}
	
	public void abrirURL(String url) {
		getDriver().get(url);
	}
	
	public void preencherTextoById(String id, String valor) {
		getDriver().findElement(By.id(id)).sendKeys(valor);
	}
	
	public void selecionarCombo(String id, String value) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByValue(value);		
	}
	
	public void limparCampoById(String id) {
		getDriver().findElement(By.id(id)).clear();
	}
}

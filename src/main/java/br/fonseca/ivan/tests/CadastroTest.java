package br.fonseca.ivan.tests;

import org.junit.Test;

import br.fonseca.ivan.pages.CadastroPage;

public class CadastroTest {
	
	CadastroPage cadastroPage = new CadastroPage();
	
	@Test
	public void criarConta() {
		
		//Acessando a tela de cadastro
		cadastroPage.acessarTelaCadastro();
		cadastroPage.setEmailcadastro("ivanteste@gmail.com");
		cadastroPage.iniciarCadastro();
		
		//Aguardando a página carregar
		cadastroPage.esperarPagina();
				
		//Preenchendo os dados de cadastro
		cadastroPage.setGeneroMasculino();
		cadastroPage.setPrimeiroNome("Ivan");
		cadastroPage.setUltimoNome("Fonseca");
		cadastroPage.setSenha("123456");	
		cadastroPage.setDiaNascimento("8");
		cadastroPage.setMesNascimento("5");
		cadastroPage.setAnoNascimento("1989");
		cadastroPage.setNewsletter();
		cadastroPage.setOptions();
		cadastroPage.setEmpresa("Celcoin Teste");
		cadastroPage.setEndereco1("Avenida Brasil, 123");
		cadastroPage.setEndereco2("Sala 3");
		cadastroPage.setCidade("São Paulo");
		cadastroPage.setEstado("3");
		cadastroPage.setCep("12345");
		cadastroPage.setPais("21");
		cadastroPage.setInfoAdicionais("Teste Celcoin");
		cadastroPage.setTelefone("11 1234-5678");
		cadastroPage.setCelular("11 99876-5432");
		//Limpando campo que já vem preenchido para preencher com o novo valor
		cadastroPage.limparEnderecoReferencia();
		cadastroPage.setEnderecoReferencia("Endereço de Teste");
		
		//Enviando formulário
		//cadastroPage.enviarCadastro();
		
	}
}

package br.fonseca.ivan.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.fonseca.ivan.core.DriverManager;
import br.fonseca.ivan.tests.CadastroTest;
import br.fonseca.ivan.tests.CarrinhoTest;

@RunWith(Suite.class)
@SuiteClasses({
	CadastroTest.class,
	CarrinhoTest.class	
})
public class SuiteTests {
		
	@AfterClass
	public static void finaliza() {
		DriverManager.killDriver();
	}

}

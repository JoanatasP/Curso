package br.com.projetobasico.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.projetobasico.core.DriverFactory;
import br.com.projetobasico.pages.LoginPage;
import br.com.projetobasico.tests.ContaTest;
import br.com.projetobasico.tests.MovimentacaoTest;
import br.com.projetobasico.tests.RemoverMovimentacaoContaTest;
import br.com.projetobasico.tests.ResumoTest;
import br.com.projetobasico.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
	private LoginPage page = new LoginPage();
	
	public void reset(){
		
		page.acessarTelaInicial();
		page.setEmail("jpassos@svlabs.com.br");
		page.setSenha("teste2020");
		page.entrar();
		
		page.resetar();
		
		DriverFactory.killDriver();
	}
}

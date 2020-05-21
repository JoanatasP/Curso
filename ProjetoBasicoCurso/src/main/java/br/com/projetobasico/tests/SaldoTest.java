package br.com.projetobasico.tests;

import org.junit.Test;

import br.com.projetobasico.core.BaseTest;
import br.com.projetobasico.pages.HomePage;
import br.com.projetobasico.pages.MenuPage;
import junit.framework.Assert;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();

	@Test
	public void testSaldoConta(){
		menu.acessarTelaPrincipal();
		Assert.assertEquals("534.00", page.obterSaldoConta("Conta para saldo"));
	}
}

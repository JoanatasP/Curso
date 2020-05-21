package br.com.projetobasico.tests;

import org.junit.Test;

import br.com.projetobasico.core.BaseTest;
import br.com.projetobasico.pages.ContasPage;
import br.com.projetobasico.pages.MenuPage;
import junit.framework.Assert;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testExcluirContaComMovimentacao(){
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta("Conta para movimentacoes");
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}
}

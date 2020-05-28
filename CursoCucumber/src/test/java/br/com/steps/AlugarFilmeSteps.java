package br.com.steps;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.com.entidades.Filme;
import br.com.entidades.NotaAluguel;
import br.com.servicos.AluguelService;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AlugarFilmeSteps {
	
	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	
	@Dado("um filme com estoque de {int} unidades")
	public void umFilmeComEstoqueDeUnidades(int int1) throws Throwable{
		filme = new Filme();
		filme.setEstoque(int1);
	}

	@Dado("que o preço de aluguel seja R$ {int}")
	public void queOPreçoDeAluguelSejaR$(int int1) throws Throwable{
	    filme.setAluguel(int1);
	}

	@Quando("alugar")
	public void alugar() throws Throwable{
	    nota = aluguel.alugar(filme);
	}

	@Então("o preço do aluguel será R$ {int}")
	public void oPreçoDoAluguelSeráR$(int int1) throws Throwable{
	   Assert.assertEquals(int1, nota.getPreco());
	}

	@Então("a data de entrega será no dia seguinte")
	public void aDataDeEntregaSeráNoDiaSeguinte() throws Throwable{
	    Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DAY_OF_MONTH, 1);
	    
	    Date dataRetorno = nota.getDataEntrega();
	    Calendar calRetorno = Calendar.getInstance();
	    calRetorno.setTime(dataRetorno);
	    
	    Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
	    Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
	    Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
	}

	@Então("o estoque do filme será {int} unidade")
	public void oEstoqueDoFilmeSeráUnidade(int int1) throws Throwable{
	    
		Assert.assertEquals(int1, filme.getEstoque());
	}
}

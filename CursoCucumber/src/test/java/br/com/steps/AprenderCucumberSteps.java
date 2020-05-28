package br.com.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumberSteps {
	
	//@Dado("^que criei o arquivo corretamente$")
	//public void que_criei_o_arquivo_corretamente()throws Throwable{
		
	//}
	//private int contador = 0;
			
	@Dado("que valor do contador é {int}")
	public void que_valor_do_contador_é(Integer int1) {
		//contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(Integer int1) {
		//contador = contador + int1;
	}

	@Então("o valor do contador será {int}")
	public void o_valor_do_contador_será(Integer int1) {
		//Assert.assertTrue(int1, contador);
		//Assert.assertEquals(int1, contador);
	}

}

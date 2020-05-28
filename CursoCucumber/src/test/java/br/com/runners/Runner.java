package br.com.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		//ensinar para cucumber onde deve encontrar os cenários
		features = "src/test/resources/features/inserir_conta.feature",
		//ensinar para cucumber onde deve encontrar os passos
		glue = "br.com.steps",
		//exibe no console da mesma forma como se estivesse executando no comando cucumber.
		plugin = "pretty",
		//facilita a visualização no console formatando o resultado
		monochrome = true,
		//define o nome dos metodos conforme a linguagem utilizada no caso JAVA
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false,
		tags ={"~@ignore"}
		)
public class Runner {

}

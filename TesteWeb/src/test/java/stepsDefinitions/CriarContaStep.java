package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.CriarContaPage;
import pageobjects.InfPessoaisPage;
import pageobjects.MenuPage;

public class CriarContaStep {

	@Quando("eu clicar em SignIn")
	public void euClicarEmSignIn() {
		Na(MenuPage.class).clicarBotaoSignin();

	}

	@E("digitar o email {string}")
	public void digitarOEmail(String email) {
		Na(CriarContaPage.class).digitarEmail(email);

	}

	@E("clicar o botao create account")
	public void clicarOBotaoCreateAccount() {
		Na(CriarContaPage.class).acionarBotaoCreateAccount();
	}

	@E("digitar as informacoes pessoais")
	public void digitarAsInformacoesPessoais() {
		Na(InfPessoaisPage.class).adicionarInformacoesPessoais();
		Na(InfPessoaisPage.class).selecionarState();
		Na(InfPessoaisPage.class).selecionarCountry();
		Na(InfPessoaisPage.class).acionarBotaoRegister();

	}

	@Entao("tenho o resgistro da conta")
	public void tenhoOResgistroDaConta() {
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",
				driver.findElement(By.cssSelector("p[class='info-account']")).getText());
	}

}

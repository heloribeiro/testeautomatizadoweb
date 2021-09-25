package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CriarContaPage {

	@FindBy(id = "email_create")
	public WebElement digitarEmail;

	@FindBy(id = "SubmitCreate")
	public WebElement btnCreateAccount;

	public void digitarEmail(String email) {

		digitarEmail.sendKeys(email);

	}

	public void acionarBotaoCreateAccount() {
		btnCreateAccount.click();
	}

}

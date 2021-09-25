package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InfPessoaisPage {

	@FindBy(id = "customer_firstname")
	public WebElement firstName;

	@FindBy(id = "customer_lastname")
	public WebElement lastName;

	@FindBy(name = "passwd")
	public WebElement password;

	@FindBy(name = "address1")
	public WebElement address;

	@FindBy(id = "city")
	public WebElement city;

	@FindBy(id = "id_state")
	public WebElement state;

	@FindBy(id = "postcode")
	public WebElement postalCode;

	@FindBy(id = "id_country")
	public WebElement country;

	@FindBy(name = "phone_mobile")
	public WebElement phone;

	@FindBy(id = "submitAccount")
	public WebElement btnRegister;

	public void adicionarInformacoesPessoais() {

		firstName.sendKeys("Clarice");
		lastName.sendKeys("Ribeiro");
		password.sendKeys("Compras1234");
		address.sendKeys("Rua C, 24/405");
		city.sendKeys("Rio de Janeiro");
		postalCode.sendKeys("60000");
		phone.sendKeys("90435421");

	}

	public void selecionarState() {
		Select estado = new Select(state);
		estado.selectByVisibleText("Louisiana");

	}

	public void selecionarCountry() {
		Select pais = new Select(country);
		pais.selectByVisibleText("United States");

	}

	public void acionarBotaoRegister() {
		btnRegister.click();
	}

}

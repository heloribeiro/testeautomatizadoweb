package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class MenuPage {

	@FindBy(xpath = "//div/a[@class='login']")
	public WebElement signin;
	
	public void clicarBotaoSignin() {
		
		signin.click();
	}

}

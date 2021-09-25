package stepsDefinitions;

import static utils.Utils.*;
import static utils.Utils.capturarTela;
import static utils.Utils.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		acessarPagina();

	}

	@After
	public void tearDown(Scenario scenario) {

		capturarTela(scenario);
		driver.quit();

	}

}

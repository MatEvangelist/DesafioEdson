package core.configWeb;

import core.utils.report.screenshot.ScenarioRepository;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;

public class HooksWeb {

    @Before
    public void inicializarTest(Scenario scenario) {
        ScenarioRepository.add(scenario);
    }

    @After
    public void apenasFechar() {
        DriverFactory.killDriver();
        ScenarioRepository.remove();
    }

    @AfterClass
    public static void matarTarefa() {
        DriverFactory.killDriver();
    }

}

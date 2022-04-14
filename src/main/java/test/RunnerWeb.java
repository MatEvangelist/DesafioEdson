package test;

import core.utils.report.Report;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        features = {"src/main/resources/features"},
        glue = {"test/stepsWeb", "core"},
        tags = ""
)

public class RunnerWeb {

    @AfterClass
    public static void gerarRelatorio() {
        Report.gerarRelatorioReportBuilder();
    }

}
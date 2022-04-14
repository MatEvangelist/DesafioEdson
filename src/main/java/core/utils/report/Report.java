package core.utils.report;


import com.rajatthareja.reportbuilder.ReportBuilder;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Gerar report em HTML
 */
public class Report {

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateFormat dateFormatFile = new SimpleDateFormat("ddMMyyyy");
    private static final Date date = new Date();

    /**
     * Gerar o report com o ReportBuilder
     */
    public static void gerarRelatorioReportBuilder() {
        ReportBuilder reportBuilder = new ReportBuilder();

        reportBuilder.setReportDirectory("target/");
        reportBuilder.setReportFileName(dateFormatFile.format(date));
        reportBuilder.setReportTitle("Frame Web Selenium Bdd por Mathews Evangelista");
        reportBuilder.setReportColor("red");
        reportBuilder.enableVoiceControl();
        reportBuilder.setAdditionalInfo("Date", dateFormat.format(date));

        List<Object> cucumberJsonReports = new ArrayList<>();
        cucumberJsonReports.add(new File("target/cucumber-report/cucumber.json"));
        cucumberJsonReports.add(new File("target/"));

        reportBuilder.build(cucumberJsonReports);
    }
}

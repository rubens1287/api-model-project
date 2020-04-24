package hooks;

import core.Spec;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Hook extends Spec {

    @Before
    public void init(Scenario scenario) {
        log.info("TESTE INICIADO: " + scenario.getName());
        log.info(String.format("Construindo objeto SPEC com as definições globais de requisição"));
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(System.getProperty("endpoint"))
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
    }

    @After
    public void end(Scenario scenario){
        log.info("TESTE FINALIZADO: " + scenario.getName());
        log.info("TESTE STATUS: " + scenario.getStatus());
    }
}










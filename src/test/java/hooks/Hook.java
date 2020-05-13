package hooks;

import core.Spec;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import localization.MessageParser;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Hook extends Spec {

    private static MessageParser parser = new MessageParser();

    @Before
    public void init(Scenario scenario) {
        log.info(parser.parse("hook.test.started", new Object[]{scenario.getName()}));
        log.info(parser.parse("hook.test.build"));
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(System.getProperty("endpoint"))
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
    }

    @After
    public void end(Scenario scenario){
        log.info(parser.parse("hook.test.ended", new Object[]{scenario.getName()}));
        log.info(parser.parse("hook.test.status", new Object[]{scenario.getStatus()}));
    }
}










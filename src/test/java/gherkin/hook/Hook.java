package gherkin.hook;

import br.com.bancodigital.commons.Commons;
import br.com.core.setup.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;


public class Hook extends Commons {

    @Before
    public void init(Scenario scenario) {
        DriverManager.testScenario.set(scenario);
        //System.getProperty("endpoint");

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://api-des.bancovotorantim.com.br")
                .addFilter(new ResponseLoggingFilter())//log request and response for better debugging. You can also only log if a requests fails.
                .addFilter(new RequestLoggingFilter())
                .build();
    }

    @After
    public void cleanUp() {

    }
}










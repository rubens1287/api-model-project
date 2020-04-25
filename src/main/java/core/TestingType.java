package core;

import io.restassured.response.Response;

public interface TestingType {

    boolean healthCheck(Response response);

    boolean verifyBody(Response response);

    boolean verifySchema(Response response);
}

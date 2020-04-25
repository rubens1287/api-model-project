package core;

import io.restassured.response.Response;

public interface TestingType {

    boolean healthCheck(Response response, int statuCode);

    boolean verifyBody(Response response);

    boolean verifySchema(Response response);
}

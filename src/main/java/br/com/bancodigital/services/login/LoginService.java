package br.com.bancodigital.services.login;

import br.com.bancodigital.commons.Commons;
import br.com.bancodigital.model.login.LoginModel;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class LoginService extends Commons {

    Response response;


    public String getToken(LoginModel loginModel){

        RequestSpecification httpRequest = given().spec(spec);
        httpRequest.header("content-type","application/x-www-form-urlencoded");

        httpRequest.queryParam("client_id",loginModel.getClientId());
        httpRequest.queryParam("client_secret",loginModel.getClientSecret());
        httpRequest.queryParam("grant_type","client_credentials");

        response = httpRequest.post("auth/oauth/v2/token");

        Assert.assertEquals(response.getStatusCode(),404);
        return response.getBody().jsonPath().get("access_token");
    }
}

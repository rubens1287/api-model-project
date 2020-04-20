package br.com.services;

import br.com.core.AllureTypeFile;
import br.com.core.Spec;
import br.com.response.pojo.users.Users;
import com.google.gson.Gson;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;

public class UsersService {

    /**
     * Retorna lista de usuários
     *
     * @param data
     * @return
     */
    public Response getUsers(Map data){
        String URI = "/users/";
        RequestSpecification httpRequest = given().spec(Spec.spec);
        Response response = httpRequest.get(URI+data.get("usuario_id"));
        Allure.addAttachment(AllureTypeFile.REQUEST,URI);
        return response;
    }

    public void healthCheck(Response response){
        Allure.addAttachment(AllureTypeFile.RESPONSE_HEADERS,response.getHeaders().toString());
        Allure.addAttachment(AllureTypeFile.RESPONSE_BODY,response.getBody().prettyPrint());
        Assert.assertEquals(200,response.getStatusCode());
    }

    public void checkBody(Response response){
        Gson gson = new Gson();
        Users users = gson.fromJson(response.jsonPath().prettyPrint(), Users.class);
        assertThat(users.getEmail()).isNotNull().isNotEmpty();
        assertThat(users.getName()).isEqualTo("Leanne Graham");
        assertThat(users.getId()).isGreaterThanOrEqualTo(1);

    }

    public void verifySchema(Response response){
        assertThat(response.getBody().prettyPrint(),matchesJsonSchemaInClasspath("schemas/users/users-schema.json"));
    }
}

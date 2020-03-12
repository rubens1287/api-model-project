package br.com.bancodigital.services.cartao;

import br.com.bancodigital.commons.Commons;
import br.com.bancodigital.model.login.LoginModel;
import br.com.bancodigital.model.cartao.ListaCartoes;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class CartaoServices extends Commons{

    Response response;

    public ListaCartoes consultarListaCartoes(String numeroCpfCnpj ){

        RequestSpecification httpRequest = given().spec(spec);
        httpRequest.header("Authorization","Bearer "+ LoginModel.token);
        httpRequest.header("numeroCpfCnpj",numeroCpfCnpj);
        response = httpRequest.get("/v1/banco-digital/cartoes");
        Assert.assertEquals(response.getStatusCode(),200,"Erro ao consumir a api: /v1/banco-digital/cartoes");
        return response.then().extract().as(ListaCartoes.class);
    }
}

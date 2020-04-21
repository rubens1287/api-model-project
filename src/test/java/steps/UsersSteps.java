package steps;

import core.DataYaml;
import services.UsersService;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;

public class UsersSteps {

    Response response;
    UsersService usersService;


    @Quando("^eu consultar um usuario$")
    public void euConsultarUmUsuario() throws Throwable {
        usersService = new UsersService();
        response = usersService.getUsers(DataYaml.getMapYamlValues("Usuarios","usuarios"));
    }

    @Entao("^sera apresentado todos os dados deste usuario$")
    public void seraApresentadoTodosOsDadosDesteUsuario() throws Throwable {
        usersService.healthCheck(response);
        usersService.checkBody(response);
        usersService.verifySchema(response);
    }
}

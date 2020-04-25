package steps;

import core.DataYaml;
import org.junit.Assert;
import services.UsersService;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;

public class UsersSteps {

    private Response response;
    private UsersService usersService;

    @Quando("^eu consultar um usuario$")
    public void euConsultarUmUsuario()  {
        usersService = new UsersService();
        response = usersService.getUsers(DataYaml.getMapYamlValues("Usuarios","usuarios"));
    }

    @Entao("^sera apresentado todos os dados deste usuario$")
    public void seraApresentadoTodosOsDadosDesteUsuario()  {
        Assert.assertTrue(usersService.healthCheck(response,200));
        usersService.verifyBody(response);
        usersService.verifySchema(response);
    }
}

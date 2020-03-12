package gherkin.stepdefinition;

import br.com.bancodigital.model.login.LoginModel;
import br.com.bancodigital.services.login.LoginService;
import cucumber.api.java.pt.Dado;

public class LoginSteps {


    @Dado("eu estou logado")
    public void euEstouLogado() {

       LoginModel.token = new LoginService().getToken(new LoginModel("DES"));
    }


}

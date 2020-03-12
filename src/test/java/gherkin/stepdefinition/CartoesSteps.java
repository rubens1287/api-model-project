package gherkin.stepdefinition;

import br.com.bancodigital.model.cartao.ListaCartoes;
import br.com.bancodigital.services.cartao.CartaoServices;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import static org.assertj.core.api.Assertions.assertThat;

public class CartoesSteps {

    private ListaCartoes listaCartoes;

    @Quando("eu consultar os cartoes do cliente")
    public void euConsultarOsCartoesDoCliente() {
        listaCartoes = new CartaoServices().consultarListaCartoes("60671327020");
    }

    @Entao("sera apresentado a lista de cartoes do cliente")
    public void seraApresentadoAListaDeCartoesDoCliente() {

        assertThat(listaCartoes.getListaTransacoesDebito().size()).isGreaterThan(1);

        for (int i = 0; i < listaCartoes.getListaTransacoesDebito().size(); i++) {
            assertThat(listaCartoes.getListaTransacoesDebito().get(i).getCodigoContaCartao()).isNotNull().isNotNegative();
            assertThat(listaCartoes.getListaTransacoesDebito().get(i).getStatusCredito().getCodigo()).isNotNull();
        }
    }
}

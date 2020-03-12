package br.com.bancodigital.model.cartao;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ListaCartoes {

    @SerializedName("listaTransacoesDebito")
    @Expose
    private List<ListaTransacoesDebito> listaTransacoesDebito = null;

    public List<ListaTransacoesDebito> getListaTransacoesDebito() {
        return listaTransacoesDebito;
    }

    public void setListaTransacoesDebito(List<ListaTransacoesDebito> listaTransacoesDebito) {
        this.listaTransacoesDebito = listaTransacoesDebito;
    }


}

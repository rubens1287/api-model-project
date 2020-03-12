package br.com.bancodigital.model.cartao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaTransacoesDebito {

    @SerializedName("codigoEmissor")
    @Expose
    private Integer codigoEmissor;
    @SerializedName("codigoFilial")
    @Expose
    private Integer codigoFilial;
    @SerializedName("codigoProduto")
    @Expose
    private Integer codigoProduto;
    @SerializedName("codigoContaCartao")
    @Expose
    private Integer codigoContaCartao;
    @SerializedName("correlativo")
    @Expose
    private Integer correlativo;
    @SerializedName("codigoModalidadeCartao")
    @Expose
    private Object codigoModalidadeCartao;
    @SerializedName("descricaoModalidadeCartao")
    @Expose
    private Object descricaoModalidadeCartao;
    @SerializedName("codigoBandeiraCartao")
    @Expose
    private Object codigoBandeiraCartao;
    @SerializedName("descricaoBandeiraCartao")
    @Expose
    private Object descricaoBandeiraCartao;
    @SerializedName("codigoCategoriaCartao")
    @Expose
    private Object codigoCategoriaCartao;
    @SerializedName("descricaoCategoriaCartao")
    @Expose
    private Object descricaoCategoriaCartao;
    @SerializedName("codigoTipoCartao")
    @Expose
    private Integer codigoTipoCartao;
    @SerializedName("descricaoTipoCartao")
    @Expose
    private String descricaoTipoCartao;
    @SerializedName("codigoVarianteCartao")
    @Expose
    private Object codigoVarianteCartao;
    @SerializedName("descricaoVarianteCartao")
    @Expose
    private Object descricaoVarianteCartao;
    @SerializedName("codigoTipoProdutoCartao")
    @Expose
    private Integer codigoTipoProdutoCartao;
    @SerializedName("descricaoTipoProdutoCartao")
    @Expose
    private String descricaoTipoProdutoCartao;
    @SerializedName("ultimosQuatroDigitosCartao")
    @Expose
    private String ultimosQuatroDigitosCartao;
    @SerializedName("nomePessoaEmbossing")
    @Expose
    private Object nomePessoaEmbossing;
    @SerializedName("dataMelhorDiaCompra")
    @Expose
    private Object dataMelhorDiaCompra;
    @SerializedName("statusCredito")
    @Expose
    private StatusCredito statusCredito;
    @SerializedName("statusDebito")
    @Expose
    private StatusDebito statusDebito;
    @SerializedName("statusContaCartao")
    @Expose
    private Object statusContaCartao;

    public Integer getCodigoEmissor() {
        return codigoEmissor;
    }

    public void setCodigoEmissor(Integer codigoEmissor) {
        this.codigoEmissor = codigoEmissor;
    }

    public Integer getCodigoFilial() {
        return codigoFilial;
    }

    public void setCodigoFilial(Integer codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Integer getCodigoContaCartao() {
        return codigoContaCartao;
    }

    public void setCodigoContaCartao(Integer codigoContaCartao) {
        this.codigoContaCartao = codigoContaCartao;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public Object getCodigoModalidadeCartao() {
        return codigoModalidadeCartao;
    }

    public void setCodigoModalidadeCartao(Object codigoModalidadeCartao) {
        this.codigoModalidadeCartao = codigoModalidadeCartao;
    }

    public Object getDescricaoModalidadeCartao() {
        return descricaoModalidadeCartao;
    }

    public void setDescricaoModalidadeCartao(Object descricaoModalidadeCartao) {
        this.descricaoModalidadeCartao = descricaoModalidadeCartao;
    }

    public Object getCodigoBandeiraCartao() {
        return codigoBandeiraCartao;
    }

    public void setCodigoBandeiraCartao(Object codigoBandeiraCartao) {
        this.codigoBandeiraCartao = codigoBandeiraCartao;
    }

    public Object getDescricaoBandeiraCartao() {
        return descricaoBandeiraCartao;
    }

    public void setDescricaoBandeiraCartao(Object descricaoBandeiraCartao) {
        this.descricaoBandeiraCartao = descricaoBandeiraCartao;
    }

    public Object getCodigoCategoriaCartao() {
        return codigoCategoriaCartao;
    }

    public void setCodigoCategoriaCartao(Object codigoCategoriaCartao) {
        this.codigoCategoriaCartao = codigoCategoriaCartao;
    }

    public Object getDescricaoCategoriaCartao() {
        return descricaoCategoriaCartao;
    }

    public void setDescricaoCategoriaCartao(Object descricaoCategoriaCartao) {
        this.descricaoCategoriaCartao = descricaoCategoriaCartao;
    }

    public Integer getCodigoTipoCartao() {
        return codigoTipoCartao;
    }

    public void setCodigoTipoCartao(Integer codigoTipoCartao) {
        this.codigoTipoCartao = codigoTipoCartao;
    }

    public String getDescricaoTipoCartao() {
        return descricaoTipoCartao;
    }

    public void setDescricaoTipoCartao(String descricaoTipoCartao) {
        this.descricaoTipoCartao = descricaoTipoCartao;
    }

    public Object getCodigoVarianteCartao() {
        return codigoVarianteCartao;
    }

    public void setCodigoVarianteCartao(Object codigoVarianteCartao) {
        this.codigoVarianteCartao = codigoVarianteCartao;
    }

    public Object getDescricaoVarianteCartao() {
        return descricaoVarianteCartao;
    }

    public void setDescricaoVarianteCartao(Object descricaoVarianteCartao) {
        this.descricaoVarianteCartao = descricaoVarianteCartao;
    }

    public Integer getCodigoTipoProdutoCartao() {
        return codigoTipoProdutoCartao;
    }

    public void setCodigoTipoProdutoCartao(Integer codigoTipoProdutoCartao) {
        this.codigoTipoProdutoCartao = codigoTipoProdutoCartao;
    }

    public String getDescricaoTipoProdutoCartao() {
        return descricaoTipoProdutoCartao;
    }

    public void setDescricaoTipoProdutoCartao(String descricaoTipoProdutoCartao) {
        this.descricaoTipoProdutoCartao = descricaoTipoProdutoCartao;
    }

    public String getUltimosQuatroDigitosCartao() {
        return ultimosQuatroDigitosCartao;
    }

    public void setUltimosQuatroDigitosCartao(String ultimosQuatroDigitosCartao) {
        this.ultimosQuatroDigitosCartao = ultimosQuatroDigitosCartao;
    }

    public Object getNomePessoaEmbossing() {
        return nomePessoaEmbossing;
    }

    public void setNomePessoaEmbossing(Object nomePessoaEmbossing) {
        this.nomePessoaEmbossing = nomePessoaEmbossing;
    }

    public Object getDataMelhorDiaCompra() {
        return dataMelhorDiaCompra;
    }

    public void setDataMelhorDiaCompra(Object dataMelhorDiaCompra) {
        this.dataMelhorDiaCompra = dataMelhorDiaCompra;
    }

    public StatusCredito getStatusCredito() {
        return statusCredito;
    }

    public void setStatusCredito(StatusCredito statusCredito) {
        this.statusCredito = statusCredito;
    }

    public StatusDebito getStatusDebito() {
        return statusDebito;
    }

    public void setStatusDebito(StatusDebito statusDebito) {
        this.statusDebito = statusDebito;
    }

    public Object getStatusContaCartao() {
        return statusContaCartao;
    }

    public void setStatusContaCartao(Object statusContaCartao) {
        this.statusContaCartao = statusContaCartao;
    }

}



package br.com.bancodigital.model.login;

import br.com.core.properties.PropertiesManager;

public class LoginModel {

    private String clientId;
    private String clientSecret;
    public static String token;


    public LoginModel(String clientId, String clientSecret, String grantType) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     *
     * Construtor retorna os valores de credenciais para o objeto
     *
     * @param env - sigla do ambiente - DES ou UAT
     */
    public LoginModel(String env) {
        PropertiesManager propertiesManager = new PropertiesManager("./src/test/resources/bdbv.properties");
        setClientId(propertiesManager.getProps().getProperty(env.toUpperCase() + "_CLIENT_ID"));
        setClientSecret(propertiesManager.getProps().getProperty(env.toUpperCase() + "_CLIENT_SECRET"));
    }

    /**
     *
     * Construtor retorna os valores de credenciais para o objeto
     *
     */
    public LoginModel() {
        PropertiesManager propertiesManager = new PropertiesManager("./src/test/resources/bdbv.properties");
        setClientId(propertiesManager.getProps().getProperty(System.getProperty("env").toUpperCase() + "_CLIENT_ID"));
        setClientSecret(propertiesManager.getProps().getProperty(System.getProperty("env").toUpperCase() + "_CLIENT_SECRET"));

    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}

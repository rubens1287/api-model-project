# SISTEMA - BACK-END

Projeto desenvolvido com proposito de uma avaliação.

## TESTE

*   Trello
    * [CT001 - BVBD - Consultar todos os cartoes do cliente](feature/Cartao Debito.feature)

## PRÉ-REQUISITOS

Requisitos de software e hardware necessários para executar este projeto de automação

*   Java 1.8 SDK
*   Maven 3.5.*

## CLONE O PROJETO PARA SUA MÁQUINA LOCAL

Abra o git bash, entre no diretório escolhido na sua máquina e faça o download do projeto com o comando abaixo.

```
git clone *
```

## PROPRIEDADES

Acesse o arquivo no diretório "e2e-api-banco-digital\src\test\resources\bdbv.properties" e preencha as informações conforme abaixo;
    
```
DES_ENV=<url-environment-dev>
UAT_ENV=<url-environment-uat>

DES_CLIENT_ID=<your-client>
DES_CLIENT_SECRET=<your-client-secret>

UAT_CLIENT_ID=<your-client>
UAT_CLIENT_SECRET=<your-client-secret>
``` 


## COMANDO PARA EXECUTAR OS TESTES

Com o git bash acesse a pasta do projeto, onde esta localizado o arquivo pom.xml, execute o comando abaixo para rodar os testes automatizados.

```
mvn verify
```

## EVIDÊNCIAS

Os arquivos com as evidências ficam localizados na pasta target do projeto, esta pasta só é criada depois da primeira execução.

```
 Report HTML: [caminho da sua maquina]e2e-api-banco-digital\target\generated-report/index.html
 Json Cucumber: [caminho da sua maquina]e2e-api-banco-digitald\target\json-cucumber-reports\cukejson.json
 Xml TestNG: [caminho da sua maquina]e2e-api-banco-digital\target\testng-cucumber-reports\cuketestng.xml
```
## AUTOR

* **Bruno Campitelli**
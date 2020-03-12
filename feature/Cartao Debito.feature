# language: pt
# charset: UTF-8

Funcionalidade: Cartao Debito
   Eu como usuário gostaria de receber informacoes sobre transacoes de debito


  @dev
   Cenario: CT001 - BVBD - Consultar todos os cartoes do cliente
    Dado eu estou logado
    Quando eu consultar os cartoes do cliente
    Entao sera apresentado a lista de cartoes do cliente

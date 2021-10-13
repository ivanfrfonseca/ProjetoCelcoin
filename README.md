# ProjetoCelcoin

**Tecnologias utlizadas:**
- Eclipse
- Java 8 / JRE 1.8
- Selenium
- JUnit
- Maven

**Notas**
- Colocar a pasta "drivers" no disco C.
- O driver utilizado é o chomedriver versão 94.
- Na classe "CadastroTest" na primeira execução é feito o cadastro de um usuário, na segunda dá erro pois não encontrei uma forma de deletar a conta após o teste. Uma forma de rodar outras vezes é comentar a linha 47 (vai preencher todos os campos, mas não vai submeter) ou a cada execução trocar o e-mail na linha 16.
- A outra classe de teste é "CarrinhoTest".
- Criei também uma suíte para rodar os 2 testes em sequência.


# ap1-poo-java

## Como executar

1. Certifique-se de ter o Java instalado em seu computador.
2. Compile o arquivo fonte localizado em [src/NomeDaTarefa.java];

   ```
   javac -d bin src/NomeDaTarefa.java
   ```

3. Execute

   ```
   java -cp src NomeDaTarefa
   ```

## Calculadora de desconto:

Calcula o valor do desconto e o preço final de um produto a partir do valor informado e da porcentagem de desconto desejada.

### Funcionalidades

- Solicita ao usuário o valor do produto.
- Solicita a porcentagem de desconto.
- Calcula o valor do desconto.
- Calcula o preço final do produto.
- Exibe o valor do desconto e o preço final.

## Calculadora de ITBI

Calcula o valor do imposto ITBI de um imóvel, considerando o maior valor entre o valor de transação e o valor venal, além da porcentagem do imposto informada pelo usuário.

### Funcionalidades

- Solicita ao usuário o valor de transação do imóvel.
- Solicita o valor venal do imóvel.
- Solicita a porcentagem do imposto ITBI.
- Calcula a base de cálculo (maior valor entre transação e venal).
- Calcula o valor do ITBI.
- Exibe a base de cálculo e o valor do ITBI em uma janela.

## Sistema de Avaliação

Recebe as notas de duas provas e de um trabalho, calcula a média e indica se o aluno está aprovado (média >= 6) ou reprovado.

### Funcionalidades

- Solicita ao usuário as notas das provas e do trabalho.
- Calcula a média das notas.
- Indica se o aluno está aprovado ou reprovado.
- Exibe a média e a situação em uma janela.

## Calculadora de Aposentadoria

Calcula se uma pessoa já pode se aposentar ou quantos anos faltam para isso, com base na idade, sexo e anos de contribuição informados pelo usuário. As regras utilizadas são:

- Para mulheres: mínimo de 62 anos de idade ou 15 anos de contribuição.
- Para homens: mínimo de 65 anos de idade ou 20 anos de contribuição.

### Funcionalidades

- Solicita ao usuário a idade.
- Solicita o sexo (M/F).
- Solicita os anos de contribuição.
- Verifica se já pode se aposentar por idade ou por tempo de contribuição.
- Informa se já pode se aposentar ou quantos anos faltam para atingir os requisitos.
- Exibe o resultado em uma janela.

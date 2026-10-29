# Padrão Comportamental: Strategy (Gestão Financeira / Conta Corrente)

## Descrição do Projeto
Este projeto demonstra a aplicação do padrão de projeto comportamental **Strategy** num contexto de **operações de saldo em conta corrente**.

O objetivo do padrão Strategy é definir uma família de algoritmos, encapsular cada um deles numa classe isolada e torná-los permutáveis entre si sem modificar os clientes que os utilizam.

## Estrutura do Padrão
* **Estratégia (`OperacaoFinanceira`)**: Interface comum que padroniza a execução do cálculo financeiro.
* **Estratégias Concretas**:
  * `OperacaoCredito`: Adição de saldo / depósito de fundos.
  * `OperacaoDebito`: Subtração de saldo / pagamento.
  * `OperacaoRendimento`: Aplicação de fator multiplicador ou taxa de correção.
  * `OperacaoRateio`: Divisão do montante em partes iguais (com validação para evitar divisão por zero).
  * `OperacaoSaldoMedio`: Apuração do saldo médio com base em dois montantes.
* **Contexto de Operação (`ProcessadorTransacao`)**: Recebe os parâmetros numéricos e executa a estratégia financeira informada.
* **Cliente (`ContaCorrente`)**: Mantém o estado do saldo atualizado através das operações delegadas.

## Execução dos Testes
Para executar a suite de testes unitários com JUnit 5:

```bash
mvn test

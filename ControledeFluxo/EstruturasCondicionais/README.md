## Resumo: Estruturas Condicionais em Java

Os seguintes pontos consolidam as principais formas de controlar o fluxo de execução de um programa com base em condições, utilizando `if`, o operador ternário e `switch-case`.

---

### 1. Condicionais Simples, Compostas e Encadeadas (if/else)

A estrutura `if` é a base para a tomada de decisão.

| Tipo | Palavra-Chave | Uso e Característica |
| :--- | :--- | :--- |
| **Simples** | `if` | Executa um bloco de código **somente** se a condição for verdadeira. No exemplo, o saldo é atualizado **somente** se o `valorSolicitado < saldo`. |
| **Composta** | `if`, `else` | Define dois caminhos de execução: um para quando a condição é verdadeira (`if`) e outro para quando é falsa (`else`). No exemplo, se `nota >= 7` é "Aprovado", caso contrário (`else`) é "Reprovado". |
| **Encadeada (Aninhada)** | `if`, `else { if ... }` | Utiliza estruturas `if/else` dentro de outras, permitindo uma lógica mais complexa. O código verifica primeiro a `idade >= 18` e, no `else`, verifica uma condição secundária (`acompanhado == true`) para liberar ou negar a entrada. |

### 2. Condicional Ternária

O operador ternário é uma forma concisa de escrever uma condicional composta ou aninhada que retorna um valor.

| Estrutura | Símbolos | Uso e Característica |
| :--- | :--- | :--- |
| **Aninhada** | `? (if)`, `: (else)` | É um atalho para o `if-else`. No exemplo, é usado um operador ternário aninhado para definir o resultado em três níveis de notas: `resultado = nota >= 7 ? 100 : (nota <= 21 ? 50 : -1);`. |

### 3. Estrutura de Múltipla Escolha (Switch-Case)

A estrutura `switch-case` é ideal para quando há muitas opções a serem verificadas contra um único valor.

| Palavra-Chave | Propósito | Característica |
| :--- | :---
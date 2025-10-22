# Conceitos de Programação Aplicados (Código ProcessoSeletivo)

O código que você desenvolveu demonstra o uso de conceitos fundamentais da linguagem Java, com forte foco em **Controle de Fluxo** e **Lógica de Simulação**.

---

## 1. Estruturas de Controle de Fluxo

Essas estruturas determinam a ordem de execução do código e a repetição de blocos:

| Conceito | Palavra-Chave | Uso no Código |
| :--- | :--- | :--- |
| **Condicionais** | `if`, `else if`, `else` | Utilizadas para tomar decisões baseadas na comparação de salários (em `analisarCandidato`). |
| **Laço 'para'** | `for` | Usado para percorrer todos os elementos de um array (ex: para iterar sobre a lista de `candidatos`). |
| **Laço 'para cada'** | `for-each` | Usado para simplificar a leitura de todos os elementos de um array ou coleção (em `imprimirSelecionados`). |
| **Laço Condicional** | `while` | Usado em `selecaoCandidatos` para selecionar exatamente 5 candidatos, repetindo a lógica enquanto as condições de limite forem atendidas. |
| **Laço com Execução Mínima** | `do-while` | Usado em `entrandoEmContato` para garantir que a tentativa de contato seja realizada **pelo menos uma vez**, antes de verificar se o ciclo de tentativas deve continuar. |

---

## 2. Estrutura e Métodos

| Conceito | Palavra-Chave | Descrição |
| :--- | :--- | :--- |
| **Método de Classe** | `static` | Indica que um método (ou variável) pertence à classe e pode ser chamado sem a criação de um objeto (ex: `analisarCandidato` e `entrandoEmContato`). |
| **Método Principal** | `main` | O ponto de partida obrigatório para a execução de qualquer aplicação Java. |
| **Retorno de Valor** | `double`, `boolean`, `void` | Define o tipo de dado que um método deve retornar. `void` significa que o método não retorna nada. |
| **Propagação de Exceção** | `throws Exception`| Uma declaração que avisa que o método pode lançar exceções para quem o chama. |
| **Arrays** | `String[]` | Estrutura de dados que armazena uma coleção de elementos do mesmo tipo (a lista de candidatos). |
| **Tipos Lógicos** | `boolean` | Tipo de dado que representa um valor de verdade (`true` ou `false`), essencial para controle de *loops* (ex: `continuarTentando`). |

---

## 3. Simulação e Aleatoriedade (APIs)

| Conceito | Palavra-Chave/Classe | Propósito no Código |
| :--- | :--- | :--- |
| **Aleatoriedade** | `Random` | Utilizado em `atender()` para simular, de forma aleatória, se o candidato atendeu a chamada. |
| **Aleatoriedade (Avançada)**| `ThreadLocalRandom`| Utilizado em `valorPretendido()` para gerar valores duplos aleatórios para o salário pretendido. |
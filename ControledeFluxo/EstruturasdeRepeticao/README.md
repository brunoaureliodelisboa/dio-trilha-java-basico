## Estruturas de Repetição (Loops) em Java

Este resumo consolida as quatro principais estruturas de repetição em Java (`for`, `for-each`, `while` e `do-while`) e suas aplicações em diferentes contextos.

---

### 1. Laço `for` (Repetição Determinada)

O `for` é ideal para repetições onde se conhece o número exato de iterações, usando uma variável de controle.

| Tipo | Estrutura | Uso no Código |
| :--- | :--- | :--- |
| **Clássico** | `for (inicialização; condição; incremento)` | Usado para contar "carneirinhos" de 1 até 20. Também usado para iterar sobre um array (`String[] carros`) com um índice (`i`). |
| **For-Each (Enhanced)** | `for (Tipo variavel : colecao)` | Simplifica a iteração sobre arrays ou collections. Usado para percorrer uma `ArrayList` de objetos `Produto` e imprimir seus atributos, como nome e preço. |

### 2. Laços `while` e `do-while` (Repetição Condicional)

Esses laços são usados quando o número de repetições é incerto e depende de uma condição booleana.

| Tipo | Característica Principal | Uso no Código |
| :--- | :--- | :--- |
| **`while`** | A condição é verificada **antes** de cada execução do bloco. Se a condição for falsa desde o início, o bloco nunca executa. | Usado para contar de 1 até 20. Também usado em `ExemploWhile` para simular o gasto da mesada, continuando a repetição **enquanto** a `mesada > 0`. |
| **`do-while`** | O bloco de código executa **pelo menos uma vez** antes de a condição ser verificada. | Usado para contar de 1 até 20. |

### 3. Aplicação Avançada (`for-each` e Lógica)

O arquivo `EstruturasdeRepeticaoForEach.java` demonstra a aplicação do `for-each` em um contexto de Orientação a Objetos (OO).

| Conceito | Aplicação | Detalhe |
| :--- | :--- | :--- |
| **Orientação a Objetos** | Criação de Molde | Define uma classe `Produto` (o molde) com atributos (`nome`, `preco`, `tipo`) e um construtor. |
| **Coleções** | `ArrayList<Produto>` | Cria uma lista (`listaDeProdutos`) para armazenar múltiplos objetos `Produto`. |
| **Iteração OO** | `for (Produto prod : ...)` | A cada ciclo do `for-each`, a variável `prod` se torna um objeto completo da lista, permitindo o acesso direto aos seus atributos (ex: `prod.nome` e `prod.preco`). |

O arquivo `ExemploWhile.java` ilustra uma lógica interessante de controle de fluxo dentro do loop:

> O código garante que o `valorDoce` não ultrapasse o valor da `mesada` disponível usando um `if`, o que é crucial para que o `while` finalize corretamente quando a mesada zerar.
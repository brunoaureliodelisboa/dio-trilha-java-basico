## Tratamento de Exceções em Java: Resumo Consolidado

O conteúdo a seguir demonstra os pilares do tratamento de exceções: a criação de erros de negócio, a declaração de que um método pode falhar e a captura desses erros para uma recuperação controlada.

---

### 1. Criação e Propagação de Exceções Customizadas (Checked)

Este conceito é usado para definir e sinalizar erros específicos da regra de negócio.

| Conceito | Palavras-Chave/Classes | Aplicação no Código |
| :--- | :--- | :--- |
| **Criação Customizada** | `public class ... extends Exception {}` | O arquivo `CepInvalidoException.java` define uma exceção de negócio, herdando de `Exception`, tornando-a uma **Checked Exception**. |
| **Lançamento do Erro** | `throw new ...` | Usado em `formatarCep` para interromper o método imediatamente ao detectar que o CEP não tem 8 dígitos. |
| **Declaração de Falha** | `throws CepInvalidoException` | A assinatura de `formatarCep` avisa que o método pode lançar a exceção customizada, transferindo a responsabilidade do tratamento para quem o chama. |

### 2. Captura e Tratamento de Exceções (`try-catch`)

Este bloco é o mecanismo de recuperação, garantindo que o programa lide com a falha de forma controlada.

| Conceito | Palavras-Chave/Classes | Aplicação no Código |
| :--- | :--- | :--- |
| **Tratamento de Exceção Customizada** | `catch (CepInvalidoException e)` | Usado para capturar o erro de CEP no `main` de `FormatadordeCepExemplo` e imprimir uma mensagem amigável: "O Cep não corresponde com as regras de negocio". |
| **Tratamento de Erro de Entrada (Runtime)** | `catch (InputMismatchException e)` | Usado em `EstruturasExepcionais` para tratar erros quando o usuário digita texto onde um número era esperado, imprimindo a mensagem "O campo idade e altura precisam ser numéricos". |
| **Tratamento de Exceção de API** | `catch (ParseException e)` | Usado em `ExemplodeExcessao` para lidar com a falha ao tentar converter uma string com formato inválido (`"a1.75"`) em número. |
| **Código Protegido** | `try { ... }` | O código sensível (leitura do Scanner, chamadas a APIs ou a métodos com `throws`) é colocado dentro do `try` para que o erro seja direcionado ao `catch`. |

### 3. Técnicas de Saída e Debug

| Conceito | Palavras-Chave/Classes | Propósito no Código |
| :--- | :--- | :--- |
| **Rastreamento de Pilha** | `e.printStackTrace()` | Usado em `ExemplodeExcessao` para imprimir o caminho completo da exceção, fundamental para entender onde o erro ocorreu. |
| **Saída de Erro** | `System.err.println` | Usado nos blocos `catch` para imprimir a mensagem de erro no *stream* de erro padrão, o que é uma boa prática para separá-lo da saída normal do programa. |
public class Operadores {
    public static void main(String[] args) {
        // Operadores de Atribuição e Aritméticos em Java //
        
        int exemplo = 10; // Atribui o valor 10 à variável exemplo

        double soma = 10.5 + 15.7; // operador de soma, adiciona dois valores (adição) 
        String concatenacao = "Valor de soma: " + soma; // operador de soma, mas aqui concatena texto com valor numérico (concatenação de strings)
        int subtracao = 113 - 25; // operador de subtração, subtrai o segundo valor do primeiro (subtração)
        int multiplicacao = 20 * 7; // operador de multiplicação, multiplica dois valores (multiplicação)
        int divisao = 15 / 3; // operador de divisão, divide o primeiro valor pelo segundo (divisão inteira)
        int modulo = 18 % 3; // operador de módulo, retorna o resto da divisão (resto da divisão inteira)
        double negativo = -soma; // operador unário de negação, inverte o sinal do valor (negação)
        double resultado = (10 * 7) + (20 / 4); // operadores de multiplicação, soma e divisão, calcula a expressão combinando as operações

        System.out.println("Valor final de exemplo: " + exemplo); // Exibe o valor final
        System.out.println(concatenacao); // Exibe o resultado da concatenação

        // ================================================== //

        // Operadores de Atribuição Composta em Java //
        exemplo += 5; // equivalente a exemplo = exemplo + 5; (exemplo agora é 15)
        System.out.println("Após += 5, exemplo: " + exemplo);
        exemplo -= 3; // equivalente a exemplo = exemplo - 3; (exemplo agora é 12)
        System.out.println("Após -= 3, exemplo: " + exemplo);
        exemplo *= 2; // equivalente a exemplo = exemplo * 2; (exemplo agora é 24)
        System.out.println("Após *= 2, exemplo: " + exemplo);
        exemplo /= 4; // equivalente a exemplo = exemplo / 4; (exemplo agora é 6)
        System.out.println("Após /= 4, exemplo: " + exemplo);
        exemplo %= 3; // equivalente a exemplo = exemplo % 3; (exemplo agora é 0, pois 6 % 3 = 0)
        System.out.println("Após %= 3, exemplo: " + exemplo);
        exemplo = exemplo % 2; // exemplo agora é 0 (0 % 2 = 0)
        System.out.println("Após exemplo = exemplo % 2, exemplo: " + exemplo);
        // ================================================== //

        // exemplos de concatenação //
        String nome = "João";
        int idade = 30;
        String apresentacao = "Nome: " + nome + ", Idade: " + idade;
        System.out.println(apresentacao);
        // exemplos de concatenação com numeros //
        double salario = 2500.75;
        String apresentacaoSalario = "Nome: " + nome + ", Salário: " + salario;
        System.out.println(apresentacaoSalario);
        // exemplos de concatenação com números e strings //
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+4+2);
        System.out.println(concatenacao);
    }   
}
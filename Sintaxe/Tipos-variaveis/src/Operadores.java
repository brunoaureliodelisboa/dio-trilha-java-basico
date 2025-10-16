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

        // Operadores Unários //
        // Esses operadores são aplicados juntamente com um outro operador //
        // aritmético. Eles realizam alguns trabalhos básicos como incrementar, // 
        // decrementar, inverter valores numéricos e booleanos. //
        int numero = 5;
        System.out.println("Número original: " + numero);  // Exibe o valor original de numero //
        System.out.println("Número Positivo: " + + numero);  // Operador unário de positivo que o resultado é 5 // 
        System.out.println("Número Negativo: " + - numero);  // Operador unário de negação que o resultado é -5 //
        System.out.println("Número Negativo + ou multiplicado por número -1 negativo: " + - numero * -1);  // Operador unário de decremento que o resultado é 4 //
        System.out.println("Número Incrementado: " + ++numero);  // Operador unário de incremento que o resultado é 6 //
        System.out.println("Número Decrementado: " + --numero);  // Operador unário de decremento que o resultado é 5 //
        boolean verdadeiro = true;
        System.out.println("Valor original de verdadeiro: " + verdadeiro); // Exibe o valor original de verdadeiro //
        System.out.println("Valor de verdadeiro invertido: " + !verdadeiro); // Operador unário de negação que inverte o valor booleano //
        System.out.println("Valor de bitwise: " + ~5); // Operador unário bitwise que inverte os bits do número que seria (∼5=−(5+1)=−6) //
        // ================================================== //

        // Operadores Ternário //
        // O Operador de Condição Ternária é uma forma resumida para definir uma //  
        // condição e escolher por um dentre dois valores. Você deve pensar numa // 
        // condição ternária como se fosse uma condição IF normal, porém, de // 
        // uma forma em que toda a sua estrutura estará escrita numa única linha. //
        int a, b, maior;
        a = 5;
        b = 10;
        // é lido como: "Se a é maior que b, então use o valor de a, senão use o valor de b." //
        maior = (a > b) ? a : b;
        System.out.println("O maior valor é: " + maior);
        // ================================================== //
        // Relacionais //
        // Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. //
        // Neste caso, mais precisamente, definem se o operando à esquerda é igual, // 
        // diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, //
        // retornando um valor booleano como resultado. //

        // == Quando desejamos verificar se uma variável é IGUAL A outra. //
        // != Quando desejamos verificar se uma variável é DIFERENTE da outra. //
        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra. //
        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra. //
        // < Quando desejamos verificar se uma variável é MENOR QUE outra. //
        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra. //
        // ComparacaoAvancada.java
        String nome1 = "JAVA";
        String nome2 = "JAVA";        
        System.out.println(nome1 == nome2); //true
        String nome3 = new String("JAVA");
        System.out.println(nome1 == nome3); //false
        String nome4 = nome3;
        System.out.println(nome3 == nome4); //true
        // equals na parada //
        System.out.println(nome1.equals(nome2)); // .equals serve pra nao dar esse tipo de erro serve para comparar 
                                                 //  variavel literal com obj porem seus conteudos caracteres no 
                                                 //  caso "bruno", se nao tiver o equals o resultado sera false
        System.out.println(nome2.equals(nome3)); //
        System.out.println(nome3.equals(nome4)); //
        // ================================================== //
    }
}
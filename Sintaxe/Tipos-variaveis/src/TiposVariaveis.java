public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // int, byte, short, long, float, double, boolean e char – esses tipos //
        // não são considerados objetos, e portanto representam valores brutos. // 
        // Eles são armazenados diretamente na pilha de memória. (Memory stack) //
        // ====================================================================================== //
        // Integer, Byte, Short, Long, Float, Double, Boolean e Character
        byte variavelByte = 123; //memoria: 1 byte valor minimo -128  valor máximo 127
        short variavelShort = 2021; //memoria: 2 bytes valor minimo -32.768 valor máximo 32.767
        int variavelInt = 21070333; //memoria: 4 bytes valor minimo -2.147.483.648 valor máximo 2.147.483.647
        long variavelLong = 9223372036854775807L; //memoria: 8 bytes valor minimo -9.223.372.036.854.775.808 valor máximo 9.223.372.036.854.775.807 e tem que terminar com L OU l para a sintaxe nao entender que é outro tipo de variavel 
        float variavelFloat = 3.14f; //memoria: 4 bytes valor minimo 1.4E-45 valor máximo 3.4028235E38 e tem que terminar com f OU F para a sintaxe nao entender que é outro tipo de variavel
        double variavelDouble = 2.718281828459045; //memoria: 8 bytes valor minimo 4.9E-324 valor máximo 1.7976931348623157E308 lembrando que o ponto representa a separação da casa decimal exemplo correto de representar um salario em double 2500.50
        char variavelChar = 'A'; //memoria: 2 bytes valor minimo EM UNICODE: '\u0000' valor máximo '\uffff' e tem que ser representado por aspas simples
        boolean variavelBoolean = true; //memoria: 1 bit valor minimo false valor máximo true    
        // ====================================================================================== //
        //Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. 
        //Observe no exemplo abaixo:
        byte idade = 123;   // se colocar 128, dará erro de compilação     
		short ano = 2021;   // se colocar 40000, dará erro de compilação                       
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F; // se não colocar o F ou f no final, dará erro de compilação   
		double salario = 1275.33; // se não colocar o ponto, dará erro de compilação
        char sexo = 'M'; // se colocar aspas duplas, dará erro de compilação
        boolean doadorOrgao = false; // se colocar 0 ou 1, dará erro de compilação
        // ====================================================================================== //    
        // adaptação //
        double salarioMinimo = 2500.33;
        
        short numeroCurto = (short) salarioMinimo; //casting (forçar a conversão)
        int numeroNormal = (int) salarioMinimo; //casting (forçar a conversão)
        // se não fizer o casting, dará erro de compilação porque 
        // o java não faz conversão automática de tipos maiores para tipos menores
        // ====================================================================================== //    

        // fixar um valor final //
        final double VALOR_DE_PI = 3.14; // convenção de nome para variáveis finais é usar //
        // todas as letras maiúsculas
        // VALOR_DE_PI = 3.15; // dá erro de compilação se tentar alterar o valor
        // isso se torna uma constante, ou seja, um valor fixo que não pode ser alterado
        //====================================================================================== //
    }
}

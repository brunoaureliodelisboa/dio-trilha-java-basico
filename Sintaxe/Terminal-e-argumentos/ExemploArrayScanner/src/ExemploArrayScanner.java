import java.util.Locale;
import java.util.Scanner;

public class ExemploArrayScanner {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu genero de filme favorito: ");
        String generoFilme = scanner.next();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        System.out.println("Gosto de " + generoFilme);
    }
}
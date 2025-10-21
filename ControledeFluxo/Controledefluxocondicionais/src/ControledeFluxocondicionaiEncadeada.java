
// Condicional encadeada - if //
public class ControledeFluxocondicionaiEncadeada {
    public static void main(String[] args) {

       int idade = 17;
       boolean acompanhado = true;

       if(idade >= 18){
        System.out.println("Entrada liberada");
       } else {
        if(acompanhado == true){
            System.out.println("Entrada liberada");
        } else {
            System.out.println("Entrada negada");
        }
       }
    }
}
// ============================= //
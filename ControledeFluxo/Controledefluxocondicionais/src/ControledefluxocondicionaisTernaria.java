public class ControledefluxocondicionaisTernaria {
    public static void main(String[] args) {
        int nota = 21;
        // Se a nota for >= 7, 100.
        // Se a nota for <= 21 (mas menor que 7), 50.
        // Se a nota for > 21 (e menor que 7), -1.
        int resultado = nota >= 7 ? 100 : (nota <= 21 ? 50 : -1); 
        
        System.out.println(resultado);
    }
}
public class ControledefluxocondicionaisSwitchCase {
    public static void main(String[] args) {
        String nota = "8";
        String resultado;

        switch (nota) {
            case "7":
            case "8":
            case "9":
            case "10":
                resultado = "100";
                break;
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "21":
                resultado = "50";
                break;
            default:
                resultado = "-1";
                break;
        }

        System.out.println(resultado);
    }
}

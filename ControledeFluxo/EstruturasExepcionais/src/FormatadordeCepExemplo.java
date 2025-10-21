public class FormatadordeCepExemplo {
    public static void main(String[] args){
        try {
            String cepFormatado = formatarCep("123456781");
            System.err.println();            
            System.err.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("O Cep não corresponde com as regras de negocio");;
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
                    
            //simulando um cep formatado
            return "12.345-6781";
        

    }
}
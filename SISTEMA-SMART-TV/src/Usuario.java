public class Usuario {
        public static void main(String[] args) throws Exception {
        int testeVolumeRetorno;
        SmartTv smartTv = new SmartTv(); // aqui é criado um objeto do tipo SmartTv com o novo operador new e o construtor da classe SmartTv é chamado e o objeto é instanciado //

        testeVolumeRetorno = smartTv.volumeComRetorno(51); // aqui o objeto instanciado smartTv mais volumeComRetorno = smartTv.volumeComRetorno(51) é chamado //
                                                                      // e o valor 51 é passado como argumento //
        System.out.println("Volume com Retorno ? : " + testeVolumeRetorno); // aqui é  exibido na tela o valor retornado pelo método volumeComRetorno //

        smartTv.diminuirVolume(); // aqui o objeto instanciado smartTv mais diminuirVolume = smartTv.diminuirVolume() é chamado //
        smartTv.diminuirVolume(); // aqui o objeto instanciado smartTv mais diminuirVolume = smartTv.diminuirVolume() é chamado //
        smartTv.diminuirVolume(); // aqui o objeto instanciado smartTv mais diminuirVolume = smartTv.diminuirVolume() é chamado //
        smartTv.aumentarVolume(); // aqui o objeto instanciado smartTv mais aumentarVolume = smartTv.aumentarVolume() é chamado //
        System.out.println("Volume Atual ? : " + smartTv.volume); // aqui é  exibido na tela o valor da variavel de instancia volume //

        System.out.println("Canal Atual ? : " + smartTv.canal); // aqui é  exibido na tela o valor da variavel de instancia canal //
        smartTv.mudarCanal(3);
        System.out.println("Canal Atual ? : " + smartTv.canal); // aqui é  exibido na tela o valor da variavel de instancia canal //

        System.out.println("TV Ligada ? : " + smartTv.ligada); // aqui é  exibido na tela o valor da variavel de instancia ligada //
        System.out.println("Canal Atual ? : " + smartTv.canal); // aqui é  exibido na tela o valor da variavel de instancia canal //
        System.out.println("Volume Atual ? : " + smartTv.volume); // aqui é  exibido na tela o valor da variavel de instancia volume //

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ?: " + smartTv.ligada); // aqui é  exibido na tela o valor da variavel de instancia ligada //
        
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ?: " + smartTv.ligada); // aqui é  exibido na tela o valor da variavel de instancia ligada //
    }
}

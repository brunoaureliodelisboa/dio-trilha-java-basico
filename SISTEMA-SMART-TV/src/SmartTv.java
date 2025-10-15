// Metodo de exemplo //
public class SmartTv { // aqui é o inicio da classe onde se define o objeto SmartTv //
    // variaveis de instancia //
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    // variaveis de instancia //
    
    // metodo com retorno //
    public int volumeComRetorno(int novoVolume) { // public é Modificador de Acesso. Indica que este método pode ser // 
        volume = novoVolume;                      // chamado ou acessado por qualquer parte do seu programa, mesmo // 
                                                  // fora da classe SmartTv, int é o tipo de retorno do método, // 
                                                  // os outros tipos de retorno sao void, String, etc. //
        return volume;                            // volumeComRetorno é o nome do método, (int novoVolume) é o parâmetro do método. //
                                                  // caso nao tenha parametro deve ser colocado () vazio que indica que o método //
                                                  // nao recebe nenhum valor. quando isso acontece  o metodo pode dar um return //
                                                  // em uma das variaveis de instancia que são //
        }                                         // ligada, canal e volume. observação se atentar ao tipo de variavel de instancia que é int. //
        
    // fim do metodo com retorno //
    
    // ========================= //

    // metodo sem retorno e sem atribuição de valores //
    public void ligar() { // faça um resumo como eu fiz ali em cima // 
        ligada = true; // void é o tipo de retorno do método que indica que o método não retorna nenhum valor //
        // aqui o método apenas altera o estado da variável ligada para true //
    }
        
    public void desligar() {
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        }
    }
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        }
    }

    // metodo sem retorno e sem atribuição de valores //

    // ========================= //

    // metodo sem retorno e com atribuição de valores //
    public void mudarCanal(int novocanal){ // (int novocanal) é o parâmetro do método. //
        canal = novocanal; // aqui o método altera o estado da variável canal para o valor recebido no parâmetro //
    }
    // metodo sem retorno e com atribuição de valores //
    
    // ========================= //
    
}

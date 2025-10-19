
// Repetição - For // Estrutura de repetição com variável de controle
// for (inicialização; condição; incremento) {
// for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
//{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
//}

public class ControldefluxoEstruturasdeRepeticao {
	public static void main(String[] args) throws Exception {

	// Exemplo For //
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
	// ============================================= //

	// Exemplo for em array //
	String[] carros = {"Gol", "Palio", "Celta", "Uno", "Sandero"};
	for(int i = 0; i <= carros.length; i++) {
		System.out.println(carros[i]);
		}
	// ============================================= //	

	// Exemplo While //
		int count = 1;
		while(count <= 20) //diferente do for, o while não tem inicialização e incremento //{
			System.out.println(count + " - Contagem");
			count++;
		}
		// ============================================= //

		// Exemplo Do While //
		// diferente do while, o do while executa o bloco de código pelo menos uma vez antes de verificar a condição //,
		int numero = 1;
		do {
			System.out.println(numero + " - Número");
			numero++;
		} while(numero <= 20);
		// ============================================= //
	}
}
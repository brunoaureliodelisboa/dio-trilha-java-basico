import java.util.ArrayList; // Precisamos importar a classe ArrayList
public class ControldefluxoEstruturasdeRepeticaoForEach {
// 1. O MOLDE (A CLASSE)
    // Colocamos 'static' aqui para que ela possa ser usada dentro do 'main'
    static class Produto {
        String nome;
        double preco;
        String tipo;

        // Construtor para criar o objeto
        Produto(String nome, double preco, String tipo) {
            this.nome = nome;
            this.preco = preco;
            this.tipo = tipo;
        }
    }

    public static void main(String[] args) {

        // 2. A COLEÇÃO (ArrayList) DE OBJETOS
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        // Criamos os objetos usando o molde e guardamos na lista
        listaDeProdutos.add( new Produto("Leite", 1.99, "Desnatado") );
        listaDeProdutos.add( new Produto("Pão", 5.00, "Forma") );
        listaDeProdutos.add( new Produto("Ovo", 15.00, "Caixa com 12") );


        // 3. O FOR-EACH (Enhanced)
        System.out.println("--- Lista de Produtos ---");
        for (Produto prod : listaDeProdutos) {
            // 'prod' é o objeto completo (Leite, Pão, Ovo...)
            System.out.println("Nome: " + prod.nome + " | Preço: " + prod.preco);
        }
    }
}
package exercícios.exercíciosdelista;

public class Loja {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Shampoo", 19.90, 3);
		carrinho.adicionarItem("Sabonete", 5.30, 1);
		carrinho.adicionarItem("Escova Dental", 7.50, 2);
		
		System.out.printf("O valor total da compra é: R$%.2f", carrinho.calcularValorTotal());
		System.out.println(" ");
		carrinho.exibirItens();
		System.out.println("Volume do Carrinho: " + carrinho.volumeDeItens());
		
		carrinho.removerItem("Sabonete");
		
		System.out.printf("O valor total da compra é: R$%.2f", carrinho.calcularValorTotal());
		System.out.println(" ");
		carrinho.exibirItens();
		System.out.println("Volume do Carrinho: " + carrinho.volumeDeItens());
	}

}

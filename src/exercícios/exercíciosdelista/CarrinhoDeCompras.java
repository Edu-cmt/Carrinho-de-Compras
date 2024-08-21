package exercícios.exercíciosdelista;

import java.util.List;
import java.util.ArrayList;


public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }
    
    public void removerItem(String nome){
    	List<Item> itensParaRemover = new ArrayList<>();
    	for(Item i : itemList) {
    		if (i.getNome().equalsIgnoreCase(nome)) {
    			itensParaRemover.add(i);
    		}
    	}
    	itemList.removeAll(itensParaRemover);
    }
    
    public double calcularValorTotal() {
    	double totalDeVenda = 0;
    	
    	for (Item i : itemList) {
    		double preco = i.getPreco();
    		int quantidade = i.getQuantidade();
    		
    		double valorProduto = preco * quantidade;
    		totalDeVenda += valorProduto;	
    	}
    	return totalDeVenda;
    }
    
    public int volumeDeItens() {
    	return itemList.size();
    }
    
    public void exibirItens() {
    	System.out.println(itemList);
    }
}


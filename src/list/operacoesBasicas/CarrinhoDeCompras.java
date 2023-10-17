package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> removeItens = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    removeItens.add(i);
                }
            }
            itemList.removeAll(removeItens);
        } else
            System.out.println("A Lista está vazia!");
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreço() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else
            throw new RuntimeException("A lista está vazia");
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }


    public static void main(String[] args) {

        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras cart = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        cart.adicionarItem("Lápis", 2d, 3);
        cart.adicionarItem("Lápis", 2d, 3);
        cart.adicionarItem("Caderno", 35d, 1);
        cart.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        cart.exibirItens();

        // Removendo um item do carrinho
        cart.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        cart.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é: $" + cart.calcularValorTotal());
    }
}

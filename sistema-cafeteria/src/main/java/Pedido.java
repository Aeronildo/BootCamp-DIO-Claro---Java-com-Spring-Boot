import java.util.*;

class Pedido {
    private List<Produto> itens = new ArrayList<>();

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto item : itens) {
            total += item.preco();
        }
        return total;
    }

    public void mostrarPedido() {
        for (Produto item : itens) {
            System.out.println(item.getDescricao() + " - " + item.preco());
        }
        System.out.println("Total: " + calcularTotal());
    }
}
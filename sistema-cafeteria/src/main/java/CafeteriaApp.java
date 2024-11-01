public class CafeteriaApp {
    public static void main(String[] args) {
        // Criando uma bebida
        Produto bebida = new Cafe();

        // Criando um pedido
        Pedido pedido = new Pedido();
        pedido.adicionarItem(bebida);
        pedido.mostrarPedido();

        // Notificar a cozinha
        SistemaNotificacao sistemaNotificacao = new SistemaNotificacao();
        sistemaNotificacao.adicionarObservador(new Cozinha());
        sistemaNotificacao.notificar(pedido);

        // Pagamento
        MetodoPagamento pagamento = PagamentoFactory.criarPagamento("cartao");
        pagamento.pagar(pedido.calcularTotal());
    }
}

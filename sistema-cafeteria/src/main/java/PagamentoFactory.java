public class PagamentoFactory {
    public static MetodoPagamento criarPagamento(String tipo) {
        if (tipo.equalsIgnoreCase("cartao")) {
            return new PagamentoCartao();
        } else if (tipo.equalsIgnoreCase("dinheiro")) {
            return new PagamentoDinheiro();
        } else {
            throw new IllegalArgumentException("Tipo de pagamento desconhecido");
        }
    }
}

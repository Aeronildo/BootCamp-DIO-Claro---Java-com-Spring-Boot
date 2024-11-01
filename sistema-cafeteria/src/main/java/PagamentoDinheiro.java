public class PagamentoDinheiro implements MetodoPagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " realizado com dinheiro.");
    }
}

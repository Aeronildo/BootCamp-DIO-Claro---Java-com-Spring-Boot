public class Cozinha implements Observador{
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("Cozinha notificada do pedido.");
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testAdicionarItem() {
        Pedido pedido = new Pedido();
        Produto leite = new Leite();
        pedido.adicionarItem(leite);

        assertEquals(4.00, pedido.calcularTotal());
    }

    @Test
    public void testCalcularTotal() {
        Pedido pedido = new Pedido();
        Produto leite = new Leite();
        Produto outroLeite = new Leite(); // Dois itens do mesmo tipo

        pedido.adicionarItem(leite);
        pedido.adicionarItem(outroLeite);

        assertEquals(8.00, pedido.calcularTotal()); // 4.00 + 4.00
    }

    @Test
    public void testMostrarPedido() {
        Pedido pedido = new Pedido();
        Produto leite = new Leite();

        pedido.adicionarItem(leite);
        pedido.mostrarPedido(); // Testa se imprime corretamente (manual)

        assertEquals(4.00, pedido.calcularTotal());
    }
}

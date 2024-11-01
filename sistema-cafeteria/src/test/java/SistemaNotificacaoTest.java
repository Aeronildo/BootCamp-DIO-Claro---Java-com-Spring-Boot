import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaNotificacaoTest {

    @Test
    public void testAdicionarObservador() {
        SistemaNotificacao sistema = new SistemaNotificacao();
        Observador cozinha = new Cozinha();

        sistema.adicionarObservador(cozinha);
        assertTrue(sistema.getObservadores().contains(cozinha));
    }

    @Test
    public void testNotificarObservadores() {
        SistemaNotificacao sistema = new SistemaNotificacao();
        Cozinha cozinha = new Cozinha();
        Pedido pedido = new Pedido();

        sistema.adicionarObservador(cozinha);
        sistema.notificar(pedido);
    }
}

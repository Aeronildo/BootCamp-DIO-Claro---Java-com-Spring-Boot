import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CozinhaTest {

    @Test
    public void testAtualizar() {
        Cozinha cozinha = new Cozinha();
        Pedido pedido = new Pedido();
        cozinha.atualizar(pedido);
    }
}

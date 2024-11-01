import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagamentoFactoryTest {

    @Test
    public void testCriarPagamentoCartao() {
        MetodoPagamento pagamento = PagamentoFactory.criarPagamento("cartao");
        assertTrue(pagamento instanceof PagamentoCartao);
    }

    @Test
    public void testCriarPagamentoDinheiro() {
        MetodoPagamento pagamento = PagamentoFactory.criarPagamento("dinheiro");
        assertTrue(pagamento instanceof PagamentoDinheiro);
    }

    @Test
    public void testCriarPagamentoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            PagamentoFactory.criarPagamento("bitcoin");
        });

        String expectedMessage = "Tipo de pagamento desconhecido";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}

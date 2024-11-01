import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    public void testPagamentoCartao() {
        MetodoPagamento pagamento = new PagamentoCartao();
        pagamento.pagar(100.00); // Teste manual para verificar a saída
    }

    @Test
    public void testPagamentoDinheiro() {
        MetodoPagamento pagamento = new PagamentoDinheiro();
        pagamento.pagar(50.00); // Teste manual para verificar a saída
    }
}

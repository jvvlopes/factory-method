import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoPagamentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServicoPagamento servico = ServicoPagamentoFactory.obterServico("Pix");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Forma de pagamento inexistente.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServicoPagamento servico = ServicoPagamentoFactory.obterServico("Dinheiro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Forma de pagamento inválida.", e.getMessage());
        }
    }
}

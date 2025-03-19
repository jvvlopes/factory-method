import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoPagamentoCreditoTest {

    @Test
    void deveReceberPagamentoCredito() {
        IServicoPagamento servico = ServicoPagamentoFactory.obterServico("Credito");
        assertEquals("Pagamento de R$100.0 efetuado no crédito.", servico.receber(100.0));
    }

    @Test
    void deveRetornarMensagemSemTrocoParaCredito() {
        IServicoPagamento servico = ServicoPagamentoFactory.obterServico("Credito");
        assertEquals("Pagamento no crédito não necessita troco.", servico.calcularTroco(200.0, 150.0));
    }
}
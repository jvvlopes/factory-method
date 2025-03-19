import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoPagamentoDebitoTest {

    @Test
    void deveReceberPagamentoDebito() {
        IServicoPagamento servico = ServicoPagamentoFactory.obterServico("Debito");
        assertEquals("Pagamento de R$50.0 efetuado no débito.", servico.receber(50.0));
    }

    @Test
    void deveRetornarMensagemSemTrocoParaDebito() {
        IServicoPagamento servico = ServicoPagamentoFactory.obterServico("Debito");
        assertEquals("Pagamento no débito não necessita troco.", servico.calcularTroco(100.0, 80.0));
    }
}
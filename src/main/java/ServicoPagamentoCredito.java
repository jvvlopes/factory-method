public class ServicoPagamentoCredito implements IServicoPagamento {
    public String receber(double valor) {
        return "Pagamento de R$" + valor + " efetuado no crédito.";
    }

    public String calcularTroco(double valorPago, double valorCompra) {
        return "Pagamento no crédito não necessita troco.";
    }
}
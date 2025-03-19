public class ServicoPagamentoDebito implements IServicoPagamento {
    public String receber(double valor) {
        return "Pagamento de R$" + valor + " efetuado no débito.";
    }

    public String calcularTroco(double valorPago, double valorCompra) {
        return "Pagamento no débito não necessita troco.";
    }
}
public interface IServicoPagamento {
    String receber(double valor);
    String calcularTroco(double valorPago, double valorCompra);
}
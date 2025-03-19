public class ServicoPagamentoDinheiro {
    public String receber(double valor) {
        return "Pagamento de R$" + valor + " efetuado em dinheiro.";
    }

    public String calcularTroco(double valorPago, double valorCompra) {
        if (valorPago < valorCompra) {
            return "Valor insuficiente para a compra.";
        }
        double troco = valorPago - valorCompra;
        return "Troco: R$" + troco;
    }
}
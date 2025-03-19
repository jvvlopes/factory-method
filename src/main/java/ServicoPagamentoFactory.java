public class ServicoPagamentoFactory {

    public static IServicoPagamento obterServico(String tipoPagamento) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("ServicoPagamento" + tipoPagamento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Forma de pagamento inexistente.");
        }
        if (!(objeto instanceof IServicoPagamento)) {
            throw new IllegalArgumentException("Forma de pagamento inválida.");
        }
        return (IServicoPagamento) objeto;
    }
}

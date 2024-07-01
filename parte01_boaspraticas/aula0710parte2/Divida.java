package parte01_boaspraticas.aula0710parte2;

public class Divida {

    private String credor;
    private CNPJ cnpjCredor;
    private double total;

    private HistoricoPagamentos pagamentos = new HistoricoPagamentos();

    public HistoricoPagamentos getPagamentos() {
        return pagamentos;
    }

    public void registra(Pagamento pagamento) {
        this.pagamentos.registra(pagamento );
    }


    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public CNPJ getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(CNPJ cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + cnpjCredor + '\'' +
                ", total=" + total +
                ", valorPago=" + pagamentos.getValorPago() +
                '}';
    }

    public double valorAPagar() {
        return this.total - pagamentos.getValorPago();
    }
}

package parte01_boaspraticas.aula0710;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class HistoricoPagamentos {

    private double valorPago;

    private List<Pagamento> pagamentos = new ArrayList<>();

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public double getValorPago() {
        return valorPago;
    }

    private void paga(double valor ) {
        if (valor <= 0 ) {
            throw new IllegalArgumentException("O valor deve ser maior do que Zero!!" );
        }

        if (valor > 1000 )
            valor = valor - 1;

        this.valorPago = this.valorPago + valor;
    }

    public void registra(Pagamento pagamento ) {
        this.paga(pagamento.getValor() );
        pagamentos.add(pagamento );
    }

    public ArrayList<Pagamento> pagamentosAntesDe(LocalDate data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento: pagamentos ) {
            if (pagamento.getData().isBefore(data) )
                pagamentosFiltrados.add(pagamento );
        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

}

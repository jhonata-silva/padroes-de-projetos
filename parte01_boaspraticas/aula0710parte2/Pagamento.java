package parte01_boaspraticas.aula0710parte2;

import java.time.LocalDate;

public class Pagamento {
    private String pagador;
    private String cnpjPagador;
    private LocalDate data = LocalDate.now();

    public Pagamento() {
    }

    public Pagamento(String pagador, String cnpjPagador, double valor) {
        this.pagador = pagador;
        this.cnpjPagador = cnpjPagador;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    private double valor;

    public String getPagador() {
        return this.pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getCnpjPagador() {
        return this.cnpjPagador;
    }

    public void setCnpjPagador(String cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

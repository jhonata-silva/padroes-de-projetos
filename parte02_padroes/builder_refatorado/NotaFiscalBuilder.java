package parte02_padroes.builder_refatorado;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscalBuilder {
    private String razaoSocial;
    private String cnpj;
    private LocalDate dataDeEmissao;
    private double valorBruto;
    private double impostos;
    public List<Item> itens;
    public String observacoes;


    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCNPJ(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.dataDeEmissao = LocalDate.now();
        return this;
    }

    public NotaFiscalBuilder adiciona(List<Item> itens) {
        this.itens = itens;

        return this;
    }

    private double calculaValorBruto() {
        double total = 0;
        for (Item item : itens) {
            total = total + item.getSubTotal();
        }
        return total;
    }

    private double calculaImposto() {
        return this.valorBruto * 0.05;
    }

    public NotaFiscalBuilder comObservacao(String observacoes ) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscal controi() {

        this.valorBruto = calculaValorBruto();
        this.impostos = calculaImposto();

        return new NotaFiscal(razaoSocial, cnpj, dataDeEmissao,
                              valorBruto, impostos, itens, observacoes);
    }
}

package parte02_padroes.builder;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    public static final int EM_APROVACAO = 1;
    public static final int APROVADO = 2;
    public static final int REPROVADO = 3;
    public static final int FINALIZADO = 4;

    private int estadoAtual = EM_APROVACAO;

    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    private List<Item> itens = new ArrayList<>();

    public void aplicaDescontoExtra() {
        if (estadoAtual == EM_APROVACAO)
            valor = valor - (valor * 0.05);

        else if (estadoAtual == APROVADO)
            valor = valor - (valor * 0.02);

        else
            throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
    }


    public void aprova() {
        switch (estadoAtual) {
            case EM_APROVACAO -> this.estadoAtual = APROVADO;
            case APROVADO -> throw new IllegalStateException("Orçamento já foi Aprovado anteriormente");
            case REPROVADO -> throw new IllegalStateException("Orçamento já foi Reprovado anteriormente");
            case FINALIZADO -> throw new IllegalStateException("Orçamento EM APROVAÇÃO não pode ser finalizado");

        }
    }

    public void reprova() {
        switch (estadoAtual) {
            case EM_APROVACAO -> this.estadoAtual = REPROVADO;
            case APROVADO -> throw new IllegalStateException("Orçamento já foi Reprovado anteriormente");
            case REPROVADO -> throw new IllegalStateException("Orçamento já foi Reprovado anteriormente");
            case FINALIZADO -> throw new IllegalStateException("Orçamento REPROVADO não pode ser finalizado");

        }
    }

    public void finaliza() {
        switch (estadoAtual) {
            case EM_APROVACAO -> throw new IllegalStateException("Orçamento EM APROVAÇÃO não pode ser finalizado");
            case APROVADO -> this.estadoAtual = FINALIZADO;
            case REPROVADO -> this.estadoAtual = FINALIZADO;
            case FINALIZADO -> throw new IllegalStateException("Orçamento já foi finalizado anteriormente");

        }
    }

    public void adiciona(Item item) {
        this.itens.add(item);
    }

    public double getValor() {
        return valor;
      /*  double total = 0;
        for (Item item : this.itens) {
            total = total + item.getValor();
        }
        return total;*/
    }


    public List<Item> getItens() {
        return itens;
    }

    public int getTotalDeItens() {
        return itens.size();
    }
}

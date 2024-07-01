package parte02_padroes.state_refatorado;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

   private double valor;

   EstadoDeUmOrcamento estadoAtual = new EmAprovacao();

    public void setValor(double valor) {
        this.valor = valor;
    }

    private List<Item> itens = new ArrayList<>();

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this );
    }

    public void aprova() {
       estadoAtual.aprova(this );
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);

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

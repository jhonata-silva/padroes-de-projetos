package parte02_padroes.chainofresponsability_refatorado;

public class DescontoPorCincoItens implements Desconto {

    private Desconto proximo;

    public double desconta(Orcamento orcamento ) {

        if (orcamento.getTotalDeItens() > 5 ) {
            return orcamento.valorTotal() * 0.10;
        } else {
            return proximo.desconta(orcamento );
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;

    }

}

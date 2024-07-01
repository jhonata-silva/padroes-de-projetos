package parte02_padroes.chainofresponsability_refatorado;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximo;

    public double desconta(Orcamento orcamento ) {
        if (orcamento.valorTotal() > 5000 ) {
            return orcamento.valorTotal() * 0.07;

        } else {
            return proximo.desconta(orcamento );
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

}

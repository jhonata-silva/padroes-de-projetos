package parte02_padroes.chainofresponsability_refatorado;

public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        throw new RuntimeException("Não é possível aplicar uma nova regra de desconto");
    }
}

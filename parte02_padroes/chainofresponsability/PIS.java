package parte02_padroes.chainofresponsability;

public class PIS implements Imposto {
    private static final double TAXA = 0.02;

    @Override
    public double calcula(Orcamento orcamento ) {
        // mais complexo no mundo real
        return orcamento.getValor() * TAXA;
    }
}

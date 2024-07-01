package parte02_padroes.strategy;

public class ISS {
    private static final double TAXA = 0.06;

    public double calcula(Orcamento orcamento ) {
        // mais complexo no mundo real
        return orcamento.getValor() * TAXA;
    }
}

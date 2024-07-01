package parte02_padroes.strategy;

public class ICMS {
    private static final double TAXA = 0.10;

    public double calcula(Orcamento orcamento ) {
        // mais complexo no mundo real
        return orcamento.getValor() * TAXA;
    }
}

package parte02_padroes.state;

public class ICMS implements Imposto {
    private static final double TAXA = 0.10;

    @Override
    public double calcula(Orcamento orcamento ) {
        // mais complexo no mundo real
        return orcamento.getValor() * TAXA;
    }
}

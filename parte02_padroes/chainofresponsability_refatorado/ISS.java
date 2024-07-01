package parte02_padroes.chainofresponsability_refatorado;

public class ISS implements Imposto {
    private static final double TAXA = 0.06;

    @Override
    public double calcula(Orcamento orcamento ) {
        // mais complexo no mundo real
        return orcamento.valorTotal() * TAXA;
    }
}

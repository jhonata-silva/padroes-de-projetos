package parte02_padroes.strategy;

public class CalculadorDeImpostos {

    private static final double TAXA_ICMS = 0.10;
    private static final double TAXA_ISS  = 0.06;

    public void calcula(Orcamento orcamento, String imposto ) {

        if (imposto.equalsIgnoreCase("ICMS")) {
            double icms = orcamento.getValor() * TAXA_ICMS;
            System.out.println(icms);
            // outras tarefas para executar

        } else if (imposto.equalsIgnoreCase("ISS")) {
            double iss = orcamento.getValor() * TAXA_ISS;
            System.out.println(iss);
            // ...
        // else if ...
        }else {
            System.out.println("O imposto " + imposto + " não foi definido");
        }
    }
}

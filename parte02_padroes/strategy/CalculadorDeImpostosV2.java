package parte02_padroes.strategy;

public class CalculadorDeImpostosV2 {

    public void calcula(Orcamento orcamento, String imposto ) {

        if (imposto.equalsIgnoreCase("ICMS")) {
            double icms = new ICMS().calcula(orcamento );
            System.out.println(icms);

        } else if (imposto.equalsIgnoreCase("ISS")) {
            double iss = new ISS().calcula(orcamento);
            System.out.println(iss);
            // ...
        // else if ...
        }else {
            System.out.println("O imposto " + imposto + " não foi definido");
        }
    }

    public void calculaICMS(Orcamento orcamento ) {
        double icms = new ICMS().calcula(orcamento);
        System.out.println(icms);
    }

    public void calculaISS(Orcamento orcamento ) {
        double iss = new ISS().calcula(orcamento);
        System.out.println(iss);
    }

}

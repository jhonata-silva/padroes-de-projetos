package parte02_padroes.chainofresponsability_refatorado;

public class TesteDeImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto pis = new PIS();

        calculadora.calcula(orcamento, icms );
        calculadora.calcula(orcamento, iss );
        calculadora.calcula(orcamento, pis );
    }
}

package parte02_padroes.strategy;

public class TesteDeImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(500);
        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

        calculadora.calcula(orcamento, "ICMS" );
        calculadora.calcula(orcamento, "ISS" );
    }
}

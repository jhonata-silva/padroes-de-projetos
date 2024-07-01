package parte02_padroes.chainofresponsability_refatorado;

public class TesteDeDesconto {

    public static void main(String[] args) {

        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new SemDesconto();

        // configurar a cadeia de desconto
        d1.setProximo(d2);
        d2.setProximo(d3);

        Orcamento orcamento = new Orcamento();

        orcamento.adiciona(new Item("Tablet 10pol", 800));
        orcamento.adiciona(new Item("Tablet 7pol", 600));
        orcamento.adiciona(new Item("SmartPhone s20", 1500));
        orcamento.adiciona(new Item("Notebook Atom", 500));
        orcamento.adiciona(new Item("Notebook Atom", 400));
        orcamento.adiciona(new Item("Notebook Atom", 200));

        double desconto = new CalculadorDeDescontos().calcula(orcamento, d1);

        System.out.println("Desconto Aplicado : " + desconto );

    }
}

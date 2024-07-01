package parte02_padroes.state;

public class TesteEstadoOrcamento {


    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();

        orcamento.setValor(1000);
        orcamento.aplicaDescontoExtra();
        System.out.println(orcamento.getValor() );

        //orcamento.finaliza();
        orcamento.aprova();
        orcamento.aplicaDescontoExtra();
        System.out.println(orcamento.getValor() );



    }
}

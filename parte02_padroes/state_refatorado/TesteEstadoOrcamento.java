package parte02_padroes.state_refatorado;

public class TesteEstadoOrcamento {


    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();

        orcamento.setValor(1000);
        System.out.println(orcamento.getValor() );
         orcamento.aplicaDescontoExtra();

        orcamento.aprova();
        orcamento.aplicaDescontoExtra();

        orcamento.finaliza();
        System.out.println(orcamento.getValor() );



    }
}

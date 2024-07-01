package parte02_padroes.state_refatorado;

class Finalizado implements  EstadoDeUmOrcamento {


    @Override
    public void aprova(Orcamento orcamento) {

    }

    @Override
    public void reprova(Orcamento orcamento) {

    }

    @Override
    public void finaliza(Orcamento orcamento) {

    }

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        //orcamento.aplicaDesconto(0.05);
    }
}

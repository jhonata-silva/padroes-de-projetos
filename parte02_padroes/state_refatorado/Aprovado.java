package parte02_padroes.state_refatorado;

class Aprovado implements  EstadoDeUmOrcamento {

    @Override
    public void aprova(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento já foi aprovado anteriormente");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento reprovado não pode ser mais aprovado");

    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() * 0.98 );
    }
}

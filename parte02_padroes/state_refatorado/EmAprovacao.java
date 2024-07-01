package parte02_padroes.state_refatorado;

class EmAprovacao implements  EstadoDeUmOrcamento {

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento EM_APROVAÇÃO não pode ser finalizado");
    }

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() * 0.95 );
    }
}

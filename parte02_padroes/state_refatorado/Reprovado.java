package parte02_padroes.state_refatorado;

class Reprovado implements EstadoDeUmOrcamento {


    @Override
    public void aprova(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento Reprovado não pode ser mais aprovado");

    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento já estar Reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new IllegalStateException("Não se aplica desconto em orçamento reprovado");
    }
}

package parte02_padroes.state_refatorado;


public interface EstadoDeUmOrcamento {

    public void aprova(Orcamento orcamento);
    public void reprova(Orcamento orcamento);
    public void finaliza(Orcamento orcamento);

    public void aplicaDescontoExtra(Orcamento orcamento);

}

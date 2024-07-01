package parte02_padroes.chainofresponsability_refatorado;

public class CalculadorDeDescontosAntiga {

  public double calcula(Orcamento orcamento) {
    // verifica primeira regra de possível desconto
    if(orcamento.getItens().size() > 5) {
      return orcamento.valorTotal() * 0.10;
    }
     
    // verifica segunda regra de possível desconto
    else if(orcamento.valorTotal() > 500.0) {
      return orcamento.valorTotal() * 0.07;
    }
    // verifica terceira, quarta, quinta regra de
    // possível desconto  ...
    // um monte de ifs daqui pra baixo

    else {
      return 0;
    }
     

  }
}

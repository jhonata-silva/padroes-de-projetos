package parte02_padroes.chainofresponsability_refatorado;

public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento, Desconto primeiraRegra) {

    double desconto = primeiraRegra.desconta(orcamento);
    return desconto;

  }
}

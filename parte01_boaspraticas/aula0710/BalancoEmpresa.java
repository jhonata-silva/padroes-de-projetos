package parte01_boaspraticas.aula0710;

import java.util.HashMap;
import java.util.Objects;

public class BalancoEmpresa {
  private HashMap<String, Divida> dividas = new HashMap<String,
          Divida>();
 
  public void registraDivida(String credor, String cnpjCredor, double valor) {

    Divida divida = new Divida();

    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjCredor(new CNPJ(cnpjCredor) );

    dividas.put(cnpjCredor, divida );
  }

  public void pagaDivida(String cnpjCredor, Pagamento pagamento ) {
    Divida divida = dividas.get(cnpjCredor );

    if (Objects.nonNull(divida)) {
        divida.registra(pagamento );

    } else {
      throw new IllegalArgumentException("Não existe divida associada ao cnpj " + cnpjCredor );
    }
  }

  public Divida buscaDividaDo(String cnpj ) {
    Divida divida = dividas.get(cnpj );
    return divida;
  }

}

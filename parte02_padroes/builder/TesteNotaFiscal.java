package parte02_padroes.builder;

import java.time.LocalDate;
import java.util.List;

public class TesteNotaFiscal {

    public static void main(String[] args) {

        List<Item> itens = List.of(
                new Item("Caneta", 5, 2),
                new Item("Lápis", 4, 3),
                new Item("Borracha", 6, 1)
        );


        NotaFiscal notaFiscal = new NotaFiscal("Empresa XYZ",  "54.710.666/0001-62",
                LocalDate.now(), 28.0, 2.8, itens,
                "Material escolar");

        System.out.println(notaFiscal);


        /*new NotaFiscalBuilder()
                .paraEmpresa("Empresa XYZ")
                .comCNPJ("54.710.666/0001-62")
                .naDataAtual()
                .adiciona(itens )
                .comObservacao("Material escolar")
                .controi();*/

    }
}

package parte01_boaspraticas.aula0710;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {

        BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        balancoEmpresa.registraDivida("PicPay",
                                   "23.842.459/0001-38",
                                        1000);
        balancoEmpresa.pagaDivida("23.842.459/0001-38",
                                   new Pagamento("99pay", "234324324", 150 ) );
        balancoEmpresa.pagaDivida("23.842.459/0001-38",
                                   new Pagamento("99pay", "234324324", 200 ) );

        Divida divida = balancoEmpresa.buscaDividaDo("23.842.459/0001-38");

        System.out.println(divida );

        System.out.println("Saldo Devedor: " + divida.valorAPagar() );



    }
}

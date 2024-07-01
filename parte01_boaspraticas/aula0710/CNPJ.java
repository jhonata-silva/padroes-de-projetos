package parte01_boaspraticas.aula0710;

public class CNPJ {

    private final String  valor;

    public CNPJ(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public boolean cnpjValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();

    }
    private boolean segundoDigitoCorreto() {
        return true;
    }

    private boolean segundoDigitoVerificador() {
        return true;
    }

    private boolean primeiroDigitoCorreto() {
        return true;
    }

    private boolean primeiroDigitoVerificador() {
        return true;
    }


    @Override
    public String toString() {
        return "CNPJ{" +
                "valor='" + valor + '\'' +
                '}';
    }
}

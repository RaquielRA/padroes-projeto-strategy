package padroescomportamentais.strategy;

public class OperacaoRateio implements OperacaoFinanceira {

    public float calcular(float valor1, float valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        else {
            return valor1 / valor2;
        }
    }
}
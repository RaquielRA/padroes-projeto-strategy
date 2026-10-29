package padroescomportamentais.strategy;

public class OperacaoCredito implements OperacaoFinanceira {

    public float calcular(float valor1, float valor2) {
        return valor1 + valor2;
    }
}
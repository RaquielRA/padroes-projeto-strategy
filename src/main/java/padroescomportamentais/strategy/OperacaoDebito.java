package padroescomportamentais.strategy;

public class OperacaoDebito implements OperacaoFinanceira {

    public float calcular(float valor1, float valor2) {
        return valor1 - valor2;
    }
}
package padroescomportamentais.strategy;

public class ContaCorrente {

    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void creditarSaldo(float valor1, float valor2) {
        ProcessadorTransacao processador = new ProcessadorTransacao(valor1, valor2);
        this.saldo = processador.calcular(new OperacaoCredito());
    }

    public void debitarSaldo(float valor1, float valor2) {
        ProcessadorTransacao processador = new ProcessadorTransacao(valor1, valor2);
        this.saldo = processador.calcular(new OperacaoDebito());
    }

    public void ratearSaldo(float valor1, float valor2) {
        ProcessadorTransacao processador = new ProcessadorTransacao(valor1, valor2);
        this.saldo = processador.calcular(new OperacaoRateio());
    }

    public void aplicarRendimentoSaldo(float valor1, float valor2) {
        ProcessadorTransacao processador = new ProcessadorTransacao(valor1, valor2);
        this.saldo = processador.calcular(new OperacaoRendimento());
    }

    public void calcularSaldoMedio(float valor1, float valor2) {
        ProcessadorTransacao processador = new ProcessadorTransacao(valor1, valor2);
        this.saldo = processador.calcular(new OperacaoSaldoMedio());
    }

}
package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveCreditarSaldoContaCorrente() {
        ContaCorrente conta = new ContaCorrente();
        conta.creditarSaldo(80.0f, 20.0f);
        assertEquals(100.0f, conta.getSaldo());
    }

    @Test
    void deveDebitarSaldoContaCorrente() {
        ContaCorrente conta = new ContaCorrente();
        conta.debitarSaldo(80.0f, 10.0f);
        assertEquals(70.0f, conta.getSaldo());
    }

    @Test
    void deveAplicarRendimentoSaldoContaCorrente() {
        ContaCorrente conta = new ContaCorrente();
        conta.aplicarRendimentoSaldo(80.0f, 1.1f);
        assertEquals(88.0f, conta.getSaldo());
    }

    @Test
    void deveRatearSaldoContaCorrente() {
        ContaCorrente conta = new ContaCorrente();
        conta.ratearSaldo(100.0f, 2.0f);
        assertEquals(50.0f, conta.getSaldo());
    }

    @Test
    void naoDeveRatearSaldoContaCorrentePorZero() {
        try {
            ContaCorrente conta = new ContaCorrente();
            conta.ratearSaldo(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularSaldoMedioContaCorrente() {
        ContaCorrente conta = new ContaCorrente();
        conta.calcularSaldoMedio(70.0f, 80.0f);
        assertEquals(75.0f, conta.getSaldo());
    }

}
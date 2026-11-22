package br.edu.exemplo;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valorValido(valor)) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valorValido(valor) && valor <= saldo) {
            saldo -= valor;
        }
    }

    private boolean valorValido(double valor) {
        return Double.isFinite(valor) && valor > 0;
    }
}

package listas.banco;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    
    public ContaBancaria(String numeroConta) {
        if (numeroConta != null && numeroConta.length() > 0)
            this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) saldo += valorDeposito;
    }

    public double sacar(double valorSaque) {
        if (valorSaque <= 0) return -1;

        if (valorSaque > saldo) return -1;
        
        saldo -= valorSaque;
        return valorSaque;
    }

    @Override
    public String toString() {
        return "ContaBancaria [numeroDaConta=" + numeroConta + ", saldo=" + saldo + "]";
    }

    
}

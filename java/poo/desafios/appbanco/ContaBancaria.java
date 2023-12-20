package poo.desafios.appbanco;

public class ContaBancaria {
    private String numeroDaConta;
    private double saldo;
    
    public ContaBancaria(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) saldo+=valorDeposito;
    }

    public double sacar(double valorSaque) {
        if (valorSaque <= 0) return -1;

        if (valorSaque > saldo) return -1;
        
        saldo -= valorSaque;
        return valorSaque;
    }

    @Override
    public String toString() {
        return "[numeroDaConta=" + numeroDaConta + ", saldo=" + saldo;
    }
}

package poo.appbanco;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 19.8;

    public ContaCorrente(String numeroDaConta) {
        super(numeroDaConta);
    }

    public void cobrarTarifaMensal() {
        sacar(tarifaMensal);
    }

    @Override
    public String toString() {
        return "ContaCorrente [numeroDaConta=" + getNumeroConta() + ", saldo=" + getSaldo() + ", tarifaMensal=" + tarifaMensal + "]";
    }
}

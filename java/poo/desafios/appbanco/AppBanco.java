package poo.desafios.appbanco;

public class AppBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("001");
        
        System.out.println(cc);
        
        cc.depositar(1000);
        cc.sacar(500);
        cc.cobrarTarifaMensal();

        System.out.println(cc);
    }
}

package listas.banco;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();
    
        ContaBancaria contaBancaria1 = new ContaBancaria("001");
        ContaBancaria contaBancaria2 = new ContaBancaria("001");
        ContaBancaria contaBancaria3 = new ContaBancaria("001");
        ContaBancaria contaBancaria4 = new ContaBancaria("001");
        ContaBancaria contaBancaria5 = new ContaBancaria("001");
        
        contasBancarias.add(contaBancaria1);
        contasBancarias.add(contaBancaria2);
        contasBancarias.add(contaBancaria3);
        contasBancarias.add(contaBancaria4);
        contasBancarias.add(contaBancaria5);

        contaBancaria1.depositar(11000);
        contaBancaria2.depositar(58000);
        contaBancaria3.depositar(63000);
        contaBancaria4.depositar(22000);
        contaBancaria5.depositar(25000);

        ContaBancaria contaMaiorSaldo = null;
        double maiorSaldo = 0;
        for (ContaBancaria contaBancaria : contasBancarias) {
            if (contaBancaria.getSaldo() > maiorSaldo) contaMaiorSaldo = contaBancaria;
        }

        System.out.println(contaMaiorSaldo);
    }
}

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoConta = 2500;

        int op;
        do {
            System.out.print(
                """
                \n\n--- OPERAÇÕES ---
                1 - Saldos
                2 - Saque
                3 - Depósito
                4 - Sair
                """);

            System.out.print("\nInforme a operação que deseja realizar: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.print("\nSaldo em conta: " + saldoConta);
                    break;
                    
                case 2:
                    System.out.print("\nInforme o valor do saque: ");
                    double valor = scanner.nextDouble();

                    if (valor <= 0) {
                        System.out.println("\nValor inválido");
                        break;
                    }
                        
                    if (valor <= saldoConta) {
                        System.out.println("\nSaque efetuado com êxito");
                        saldoConta -= valor;
                    } else {
                        System.out.println("\nSaldo indisponível");
                    }

                    break;
                    
                    case 3:
                    System.out.print("\nInforme o valor do depósito: ");
                    valor = scanner.nextDouble();
                    
                    if (valor > 0) {
                        System.out.println("\nDepósito efetuado com êxito");
                        saldoConta += valor;
                    } else {
                        System.out.println("\nValor inválido");
                    }

                    break;

                case 4:
                    System.out.println("\nFim");
                    break;
            
                default:
                    System.err.println("\nOperação inválida");
                    break;
            }
        } while (op != 4);

        scanner.close();
    }
}
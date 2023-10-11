
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 2500.00;
        int operador = 0;


        System.out.println("***********************************************");
        System.out.println("Dados inicias do cliente: \n");

        System.out.println("Nome:             Lucas Henrique");
        System.out.println("Tipo conta:       Corrente");
        System.out.println("Saldo Inicial:    R$ 2500,00");
        System.out.println("*********************************************** \n\n");

        while (operador != 4) {

            System.out.println("\n Operaçôes \n");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair \n");

            System.out.println("Digite a opção desejada: ");
            operador = scanner.nextInt();

            if (operador == 1) {
                System.out.println("Saldo Inicial:    R$ 2500,00 ");
            } else if (operador == 2) {
                System.out.println("Informe o valor a receber: ");
                double receber = scanner.nextDouble();
                System.out.println("Saldo atualizado: " + (saldo = saldo + receber));
            } else if (operador == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double transferir = scanner.nextDouble();
                System.out.println("Saldo atualizado: " + (saldo= saldo - transferir));
            } else {
                break;
            }
        }
    }
}

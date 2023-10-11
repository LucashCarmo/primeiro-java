
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Lucas henrique";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int operador = 0;


        System.out.println("***********************************************");
        System.out.println("Dados inicias do cliente: \n");

        System.out.println("Nome:            " + nome);
        System.out.println("Tipo conta:      " + tipoConta);
        System.out.println("Saldo Inicial:    R$ " + saldo);
        System.out.println("*********************************************** \n\n");

        String menu = """
                    Operaçôes
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                """;

        while (operador != 4) {

            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            operador = scanner.nextInt();

            if (operador == 1) {
                System.out.println("Saldo Inicial:    R$ 2500,00 ");
            } else if (operador == 2) {
                System.out.println("Informe o valor a receber: ");
                double receber = scanner.nextDouble();
                saldo += receber;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (operador == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double transferir = scanner.nextDouble();
                if (transferir > saldo){
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldo -= transferir;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (operador != 4) {
                System.out.println("Opção invalida");
            }
        }
    }
}

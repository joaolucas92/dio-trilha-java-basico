import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Obter pela Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); //consumir quebra de linha pendente

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo +" já está disponível para saque!");
    }
}

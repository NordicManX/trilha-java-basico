import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        System.out.println(" Bem vindo ao banco Nordic! Digite nordic para continuar! ");
        String nordic = scanner.next();

        System.out.println(" Por favor, primeiro digite apenas o seu primeiro NOME: ");
        String nome = scanner.next();

        System.out.println("Agora, digite seu SOBRENOME:");
        String sobrenome = scanner.next();

        System.out.println(" Agora preciso que digite o número de sua AGÊNCIA: ");
        String agencia = scanner.next();

        System.out.println(" Por favor, agora digite o número da sua CONTA: ");
        String numeroConta = scanner.next();

        String saldo = "1.000.000,00" ;
        System.out.println(" O seu SALDO atual é: R$ " + saldo);

        System.out.println("Olá "+ nome + " " + sobrenome +", obrigado por criar uma conta conosco, sua agência é AG: " + agencia +", conta C/C:" + numeroConta +" e seu saldo de R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
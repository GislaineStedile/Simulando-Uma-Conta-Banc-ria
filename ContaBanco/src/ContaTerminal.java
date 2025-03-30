import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Olá vamos começa.....[S/N]: ");
    String comeca = scanner.nextLine();
    
    if (comeca.equals("S") || comeca.equals("s"))
    {
      System.out.println("Qual o seu nome: ");
      String nome = scanner.nextLine();
      System.out.println("Por favor, digite o número da Agência: ");
      String numeroAgencia = scanner.nextLine();
      System.out.println("Agora digite o número da sua conta: ");
      int numeroConta = scanner.nextInt();
      System.out.println("Por ultimo seu saldo: ");
      double saldo = scanner.nextDouble();
      System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque.");

    }
    System.out.println("Finalizado....");

  }
}

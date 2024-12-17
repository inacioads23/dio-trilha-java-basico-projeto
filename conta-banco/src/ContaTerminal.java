import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.print("Digite o número da sua conta: ");
		numeroConta = ler.nextInt();
		ler.nextLine(); // Consumir a nova linha após nextInt()
		System.out.print("Digite o número da agencia com dígito: ");
		agencia = ler.nextLine();		
		System.out.print("Digite o nome do Cliente: ");
		nomeCliente = ler.nextLine();		
		System.out.print("Digite o Saldo inicial: ");
		saldo = ler.nextDouble();
		
		System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque",
				nomeCliente, agencia, numeroConta, saldo);
		
	}
}

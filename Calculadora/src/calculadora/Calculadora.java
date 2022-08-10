package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		double total = 0;
		int opcao;

		do {

			System.out.println("Digite a opcao desejada: ");
			System.out.println("[1]- Somar " + "[2]- Subtrair " + "[3]- Multiplicar " + "[4]- Dividir "
					+ "[5]- Exponenciar" + "[0]- Sair");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				soma(total);
				break;
			case 2:
				subtrai(total);
				break;
			case 3:
				multiplica(total);
				break;
			case 4:
				divide(total);
				break;
			case 5:
				exponencia(total);
				break;
			case 0:
				System.out.println("Saindo da aplicacao...");
				break;
			default:
				System.out.println("Esta opcao nao existe!");
			}
		} while (opcao != 0);
	}

	private static double pegaValor() {
		Numero numero = new Numero();
		System.out.println("Digite um numero");
		numero.setValor(scanner.nextDouble());
		return (numero.getValor());
	}

	private static void soma(double total) {

		double n1 = pegaValor();
		double n2 = pegaValor();

		total = (n1 + n2);
		System.out.println("O resultado da operacao e: " + total);
	}

	private static void subtrai(double total) {
		double n1 = pegaValor();
		double n2 = pegaValor();
		total = (n1 - n2);
		System.out.println("O resultado da operacao e: " + total);
	}

	private static void multiplica(double total) {
		double n1 = pegaValor();
		double n2 = pegaValor();
		total = (n1 * n2);
		System.out.println("O resultado da operacao e: " + total);
	}

	private static void divide(double total) {
		double n1 = pegaValor();
		double n2 = pegaValor();
		total = (n1 / n2);
		System.out.println("O resultado da operacao e: " + total);
	}

	private static void exponencia(double total) {
		double n1 = pegaValor();
		total = (n1 * n1);
		System.out.println("O resultado da operacao e: " + total);
	}
}

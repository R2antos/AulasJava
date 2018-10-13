package aulaNumero12;

import java.util.Scanner;

public class LeituradeDados {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		//imprime o nome completo na tela
		System.out.println("Digite seu nome completo:");

		//imprime o nome completo na tela
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);

		// imprime apenas o primeiro nome na tela
		System.out.println("Digite seu nome completo:");

		//imprime apenas o primeiro nome na tela
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é:" + primeiroNome);

		//imprime a altura na tela
		System.out.println("Digite sua altura:");

		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura );


	}

}

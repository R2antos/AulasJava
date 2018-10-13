package aulaNumero12;

//import da API Scanner
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {

		//Sistema para calculo de IMC

		//variavel para printar os dados digitados no teclado
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = scan.next();
		
		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		
		System.out.println("Digite seu peso:");
		double peso = scan.nextDouble();
		
		double imc = peso /(altura*altura);
		if(imc > 25 ) {
			System.out.println(nome +" Você esta acima do peso.");
		}else {
			System.out.println("Seu peso esta normal.");
		}

	}

}

package defaut;
import java.util.Scanner;

public class ExercicioVariaveis {

	public static void main(String[] args) {
	try (// Crie um programa que solicite ao usuário que insira dois números, some esses números e imprima o resultado.
		Scanner myInput = new Scanner(System.in)) {
			System.out.println("Entre o primeiro numero");
			
			int num1 = myInput.nextInt();
			
			System.out.println("Entre o segundo numero");
			int num2 = myInput.nextInt();
			
			int soma = num1 + num2;
			
			//saida
			System.out.println(soma);
		}
		
	}

}

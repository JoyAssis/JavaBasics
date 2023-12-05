package defaut;
import java.util.Scanner;

public class exercicioOperadores {

	public static void main(String[] args) {
		try (//Crie um programa que peça ao usuário para inserir sua idade e verifique se ele é elegível para votar.
		Scanner input = new Scanner(System.in)) {
			System.out.println("Digite sua idade");
			int idade = input.nextInt();
			System.out.println("Você tem " + idade + " anos");
			
			if (idade >= 16) {
				System.out.println("Você tem idade suficiente para votar!");
			}else {
				System.out.println("Você ainda não tem idade suficiente para votar.");
			}
		}

	}

}

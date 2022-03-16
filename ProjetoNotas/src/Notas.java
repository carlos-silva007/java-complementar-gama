import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informa a Primeira Nota: ");
		Double nota1 = entrada.nextDouble();

		System.out.print("Informe a Segunda Nota: ");
		Double nota2 = entrada.nextDouble();

		Double media = (nota1 + nota2) / 2;

		System.out.print("A Media do Aluno é: " + media);

		if (media < 5) {
			System.out.println(" Aluno Reprovado ");
		} else if (media == 5) {
			System.out.println(" Aluno de Recuperação ");
		} else {
			System.out.println(" Aluno Aprovado!!! ");
		}

		entrada.close();

	}

}

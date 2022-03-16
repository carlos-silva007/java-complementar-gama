import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class FormataValor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com Valor Desejado: ");
		Double dval = entrada.nextDouble();
		
		System.out.printf("Valor da Variavel: %.2f%n ", dval);
		
		String format = "0.00";
		NumberFormat formater = new DecimalFormat(format);
		String newDval = formater.format(dval);
		System.out.println("Novo Valor formatado: "+ newDval);
		
		entrada.close();
	}

}

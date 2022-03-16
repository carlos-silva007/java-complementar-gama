
public class LacosRepeticao {

	public static void main(String[] args) {

		System.out.println("Laços repetição com WHILE");

		int contador = 0;

		do {
			System.out.println(contador);
			contador++;
		} while (contador < 5);
		
		
		System.out.println("Laço Repetição com for");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Contador ==>" + i);
		}
	}

}

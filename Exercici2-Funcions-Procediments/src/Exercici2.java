import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exercici2 {
	
	public static int ContarA(String cadena) {
		int cont=0;
		cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			if ((""+cadena.charAt(i)).equals("a")) {
				cont++;
			}
		}
		return cont;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Pon una cadena de texto para contar las 'a': ");
		String texto=reader.readLine();
		System.out.println(ContarA(texto));
		
	}
} 
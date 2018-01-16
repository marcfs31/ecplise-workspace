import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exercici3 {
	
	public static void triangulo(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = i+1; j > 0; j--) {
				System.out.print(j+", ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pon un numero: ");
		String num_str = reader.readLine();
		int num = Integer.parseInt(num_str);
		triangulo(num);
	}
}

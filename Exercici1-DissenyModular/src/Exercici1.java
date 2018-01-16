import java.io.*;
public class Exercici1 {
	
	public static void arbol() {
		int x = 9;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(".");
			}
			
			for (int j = x; j < 9; j++) {
				System.out.print(j);
			}
			
			System.out.print(9);
			
			for (int j = 8; j > x-1; j--) {
				System.out.print(j);
			}
			
			for (int j = 0; j < x; j++) {
				System.out.print(".");
			}
			
			x--;
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pon un numero: ");
		String num_str = reader.readLine();
		int num = Integer.parseInt(num_str);
		
		for (int i = 0; i < num; i++) {
			arbol();
		}
	}
}

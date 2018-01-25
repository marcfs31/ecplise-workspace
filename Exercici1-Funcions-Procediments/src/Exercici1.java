import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exercici1 {
	
	public static int sumar(int num1,int num2) {
		return num1+num2;
	}
	
	public static int restar(int num1,int num2) {
		return num1-num2;
	}
	
	public static int div(int num1,int num2) {
		return num1/num2;
	}
	
	public static int mult(int num1,int num2) {
		return num1*num2;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String continuar ="s";
		do {
			System.out.print("Pon un número");
			int num1 = Integer.parseInt(reader.readLine());
			System.out.print("Pon un operador (+ - * /)");
			String op = reader.readLine();
			System.out.print("Pon un número");
			int num2 = Integer.parseInt(reader.readLine());
			
			switch (op) {
			case "x":
				System.out.println(mult(num1, num2));
				break;
			case "*":
				System.out.println(mult(num1, num2));
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("Error división entre zero");
				}else {
					System.out.println(div(num1, num2));
				}
				break;
			case "+":
				System.out.println(sumar(num1, num2));
				break;
			case "-":
				System.out.println(restar(num1, num2));
				break;

			default:
				System.out.println("Error al introducir los datos");
				break;
			}
			System.out.println("Quieres continuar s/n ? ");
			continuar = reader.readLine();
			if (continuar.equals("n")) {
				break;
			}
		} while (continuar.equals("s"));
	}
} 
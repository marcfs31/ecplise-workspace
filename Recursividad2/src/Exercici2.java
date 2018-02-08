import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exercici2{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Primer número: ");
		int num1=Integer.parseInt(reader.readLine());
		System.out.print("Segundo número: ");
		int num2=Integer.parseInt(reader.readLine());
		
		int result = sumarCuentaRegresiva(num1, num2);
		System.out.println(result);
	}
	
	//No va bien
	public static int sumarCuentaRegresiva(int num1,int num2){
		if(num1 > num2) {
			return num1 + sumarCuentaRegresiva(num1-1, num2);
		}else if(num1 < num2) {
			return num2 + sumarCuentaRegresiva(num1, num2-1);
		}else if(num1 == num2){
			return num1 + num2;
		}else {
			return 0;
		}
	}
}

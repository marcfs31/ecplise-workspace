import java.io.*;
public class Exercici1{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Primer número: ");
		int num=Integer.parseInt(reader.readLine());
		int result = sumarCuentaRegresiva(num);
		System.out.println(result);
	}
	
	public static int sumarCuentaRegresiva(int n){
        if(n == 0) {
           return 0;
        }else {
        	return n + sumarCuentaRegresiva(n-1);
        }
 }
}

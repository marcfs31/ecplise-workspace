import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exercici3{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Primer número: ");
		int num=Integer.parseInt(reader.readLine());
		int result = factorial(num);
		System.out.println(result);
	}
	
	public static int factorial(int n){
		if (n==0)
	        return 1;
	    else
	        return n*(factorial(n-1));
	}
}

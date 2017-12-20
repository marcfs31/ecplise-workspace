import java.io.*;
public class Exercici3 {
	public static void main (String args[]) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String frase;
		int espacios=0;
		
		System.out.print("Introdueix una frase: ");
		frase= reader.readLine();
		
		String frase2 = frase.replaceAll(" ", "");
		System.out.println(frase2);
		
		for(int i=0;i<frase.length();i++){
			if((""+frase.charAt(i)).equals(" ")){
				espacios++;
			}
		}
		System.out.print(espacios);
	}
}


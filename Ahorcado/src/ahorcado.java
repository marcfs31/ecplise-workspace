import java.util.Random;
import java.io.*;

public class ahorcado {
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();
		String letra, entrar="s";
		char letra_char = 0,vacio='_';
		int aciertos=0,intentos=6,tmp=0,errores=0;
		
		String palabras[] = {"coche","casa","arbol","planta","ordenador","cucaracha","isla"};
		int i_palabras = rand.nextInt(palabras.length) + 1; i_palabras--;
		char [] palabra;
		palabra = new char [palabras[i_palabras].length()];
		char [] resuelta;
		resuelta = new char [palabras[i_palabras].length()];
		
		//Guarda en el array palabra los caracteres de la palabra del array palabras.
		palabras[i_palabras].getChars(0, palabras[i_palabras].length(), palabra, 0);
		
		//Imprimir la cantidad de caracteres de la palabra con guiones
		for (int i = 0; i < resuelta.length; i++) {
			resuelta[i] = vacio;
			System.out.print(resuelta[i]+" ");
		}
		
		//Bucle Ahorcado
		while (entrar == "s") {
			//Pedir la letra o palabra
			System.out.println();
			
			System.out.print("Pon una letra: ");
			letra = reader.readLine();
			letra = letra.toLowerCase();
			
			if (letra.length() > 1) {
				if (letra.equals(palabras[i_palabras])) {
					System.out.println("Has ganado");
					break;
				}else {
					System.out.println("Palabra incorrecta");
				}
			}else {
				letra_char = letra.charAt(0);
			}
			
			tmp = aciertos;
			
			//Evaluar si la letra esta en la palabra
			for (int i = 0; i < palabra.length; i++) {
				if (palabra[i] == letra_char) {
					resuelta[i] = letra_char;
					aciertos++;
				}
			}
			
			//Comprobar si ha acertado algun caracter
			if (tmp == aciertos) {
				intentos--;
				errores++;
				System.out.println("Te quedan "+intentos+" intentos");
			}
			
			//Dibujar el ahorcado
			switch (errores) {
			case 1:
				System.out.println();
				System.out.println(" ____");
				System.out.println("|    |");
				System.out.println("|    |");
				System.out.println("|   ***");
				System.out.println("|  *   *");
				System.out.println("|   *** ");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|________");
				break;
			case 2:
				System.out.println();
				System.out.println(" ____");
				System.out.println("|    |");
				System.out.println("|    |");
				System.out.println("|   ***");
				System.out.println("|  *   *");
				System.out.println("|   *** ");
				System.out.println("|    |");
				System.out.println("|    |");
				System.out.println("|    |");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|________");
				break;
			case 3:
				System.out.println();
				System.out.println(" ____");
				System.out.println("|    |");
				System.out.println("|    |");
				System.out.println("|   ***");
				System.out.println("|  *   *");
				System.out.println("|   *** ");
				System.out.println("|   /|");
				System.out.println("|  / |");
				System.out.println("|    |");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|________");
				break;
			case 4:
				System.out.println();
				System.out.println(" ____");
				System.out.println("|    |");
				System.out.println("|    |");
				System.out.println("|   ***");
				System.out.println("|  *   *");
				System.out.println("|   *** ");
				System.out.println("|   /|\\");
				System.out.println("|  / | \\");
				System.out.println("|    |");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|________");
				break;
			case 5:
				System.out.println();
				System.out.println(" ____");
				System.out.println("|    |");
				System.out.println("|    |");
				System.out.println("|   ***");
				System.out.println("|  *   *");
				System.out.println("|   *** ");
				System.out.println("|   /|\\");
				System.out.println("|  / | \\");
				System.out.println("|    |");
				System.out.println("|   /");
				System.out.println("|  /");
				System.out.println("|________");
				break;
			case 6:
				System.out.println();
				System.out.println(" ____");
				System.out.println("|    |");
				System.out.println("|    |");
				System.out.println("|   ***");
				System.out.println("|  *   *");
				System.out.println("|   *** ");
				System.out.println("|   /|\\");
				System.out.println("|  / | \\");
				System.out.println("|    |");
				System.out.println("|   / \\");
				System.out.println("|  /   \\");
				System.out.println("|________");
				break;
			default:
				break;
			}
			
			//Imprimir array despues de añadir las letras o guiones
			for (int i = 0; i < resuelta.length; i++) {
				System.out.print(resuelta[i]+" ");
			}
						
			//Comprobar que los intentos no sean 0
			if (intentos == 0) {
				System.out.println();
				System.out.println("Has perdido");
				break;
			}
			
			//Comprobar si ha ganado
			if (aciertos == palabra.length) {
				entrar = "n";
				System.out.println();
				System.out.println("Has ganado");
			}
		}
	}
}

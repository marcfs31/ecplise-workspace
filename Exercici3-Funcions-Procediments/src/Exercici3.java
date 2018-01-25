import java.io.*;
public class Exercici3 {
	public static String Capitalize (String nombre) {
		nombre = nombre.toLowerCase();
		int i=0;
		
		String nombre2=(""+nombre.charAt(i)).toUpperCase();
		
		for(i=1;i<nombre.length();i++){
			if((""+nombre.charAt(i-1)).equals(" ")){ //Si la letra anterior es un espacio
				nombre2=nombre2+(""+nombre.charAt(i)).toUpperCase(); //La letra de ahora se pasa a mayusculas
			}else{
				nombre2=nombre2+(""+nombre.charAt(i));
			}
		}
		return nombre2;
	}
 	
	public static void main (String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Como te llamas? ");
		String nombre= reader.readLine();
		nombre=Capitalize(nombre);
		System.out.println(nombre);
	}
}
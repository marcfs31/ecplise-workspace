import java.io.*;
public class Notas {
	private static final int minValorNota = 0;
	private static final int maxValorNota = 10;
	private static final int minNotas = 1;
	private static final int maxNotas = 50;

	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//Variables
		float media = 0,mejorNota,peorNota;

		int cantidad_notas = cojerCantidad(reader);
		
		//Crear array
		float notas[];
		notas = new float[cantidad_notas];

		cojerNotasValidar(reader, notas);

		media = mediaNotas(media, notas);
		
		mejorNota = mejorNota(notas);
		
		peorNota = peorNota(notas);
		
		//Imprimir calculos y notas
		imprimirNotas(notas);
		System.out.println();
		System.out.println("Mitja: "+media);
		System.out.println("Pitjor: "+peorNota);
		System.out.println("Millor: "+mejorNota);
	}

	private static void imprimirNotas(float[] notas) {
		for(int i=0;i<notas.length;i++){
			System.out.print(notas[i]+", ");
		}
	}

	private static float peorNota(float[] notas) {
		float peorNota;
		peorNota = notas[0];
		for(int i=0;i<notas.length;i++){
			if(notas[i] < peorNota){
				peorNota = notas[i];
			}
		}
		return peorNota;
	}

	private static float mejorNota(float[] notas) {
		float mejorNota;
		mejorNota = notas[0];
		for(int i=0;i<notas.length;i++){
			if(notas[i] > mejorNota){
				mejorNota = notas[i];
			}
		}
		return mejorNota;
	}

	private static void cojerNotasValidar(BufferedReader reader, float[] notas) throws IOException {
		float nota;
		for(int i=0;i<notas.length;i++){
			System.out.print("Introdueix "+(i+1)+": ");
			nota = Float.parseFloat(reader.readLine());

			while(nota > maxValorNota || nota < minValorNota){
				System.out.println("ERROR");
				System.out.print("Introdueix "+(i+1)+": ");
				nota = Float.parseFloat(reader.readLine());
			}
			notas[i] = nota;
			System.out.println(notas[i]);
		}
	}

	private static int cojerCantidad(BufferedReader reader) throws IOException {
		System.out.print("Quanta gent: ");
		int cantidadNotas = Integer.parseInt(reader.readLine());

		while(cantidadNotas > maxNotas || cantidadNotas < minNotas){
			System.out.println("ERROR");
			cantidadNotas = Integer.parseInt(reader.readLine());
		}
		return cantidadNotas;
	}

	private static float mediaNotas(float media, float[] notas) {
		for(int i=0;i <= notas.length-1;i++){
			media = media + notas[i];
		}
		media = media / notas.length;
		return media;
	}
}

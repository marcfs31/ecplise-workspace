import java.io.*;
public class Exercici4{
	public static void main(String[] args) throws IOException {
		int dinero;
		
		int[] Billetes;
        Billetes = new int[9];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Cuanto dinero tienes? ");
		dinero=Integer.parseInt(reader.readLine());
		
		Billetes=contarDinero(dinero);
		
		System.out.println(Billetes[0]+" Billetes de 500 €");
		System.out.println(Billetes[1]+" Billetes de 200 €");
		System.out.println(Billetes[2]+" Billetes de 100 €");
		System.out.println(Billetes[3]+" Billetes de 50 €");
		System.out.println(Billetes[4]+" Billetes de 20 €");
		System.out.println(Billetes[5]+" Billetes de 10 €");
		System.out.println(Billetes[6]+" Billetes de 5 €");
		System.out.println(Billetes[7]+" Monedas de 2 €");
		System.out.println(Billetes[8]+" Monedas de 1 €");
	}

	private static int[] contarDinero(int dinero) {
		int[] Billetes;
        Billetes = new int[9];
        
		int i=0;
		while (dinero >= 500){
			dinero= dinero - 500;
			i++;
			Billetes[0]=i;
		}
		int x=0;
		while (dinero >= 200){
			dinero= dinero - 200;
			x++;
			Billetes[1]=x;
		}
		int z=0;
		while (dinero >= 100){
			dinero= dinero - 100;
			z++;
			Billetes[2]=z;
		}
		int v=0;
		while (dinero >= 50){
			dinero= dinero - 50;
			v++;
			Billetes[3]=v;
		}
		int a=0;
		while (dinero >= 20){
			dinero= dinero - 20;
			a++;
			Billetes[4]=a;
		}
		int b=0;
		while (dinero >= 10){
			dinero= dinero - 10;
			b++;
			Billetes[5]=b;
		}
		int c=0;
		while (dinero >= 5){
			dinero= dinero - 5;
			c++;
			Billetes[6]=c;
		}
		int d=0;
		while (dinero >= 2){
			dinero= dinero - 2;
			d++;
			Billetes[7]=d;
		}
		int e=0;
		while (dinero >= 1){
			dinero= dinero - 1;
			e++;
			Billetes[8]=e;
		}
		
		return Billetes;
	}
}
import java.io.*;
public class refactoring {
	public static void main (String[] args) throws IOException  {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	//Variables
    	float nota,b,c,d;String str;
    	b=0;
    	
    	//Cojer notas
    	System.out.print("Quanta gent: ");
    	int cantidad_notas = Integer.parseInt(reader.readLine());
    	
    	while(cantidad_notas>50 || cantidad_notas<1){
        	System.out.println("ERROR");
        	cantidad_notas = Integer.parseInt(reader.readLine());
    	}

    	float v[];v = new float[cantidad_notas];
    	
    	for(int i=0;i<v.length;i++){
        	System.out.print("Introdueix "+(i+1)+": ");
        	str = reader.readLine();
        	nota = Float.parseFloat(str);
        	
        	while(nota>10 || nota<0){
        		System.out.println("ERROR");
        		System.out.print("Introdueix "+(i+1)+": ");
        		str = reader.readLine();
        		nota = Float.parseFloat(str);
        	}
        	v[i]=nota;
        	System.out.println(v[i]);
    	}
    	
    	for(int i=0;i<=v.length-1;i++){
        	float v1 = v[i];
        	b = b + v1;
    	}
    	
    	c=v[0];
    	d=v[0];
    	
    	for(int i=0;i<v.length;i++){
    		float v1 = v[i];
        	if(v1>c){
            	c=v[i];
        	}
        	if(v1<d){
            	d=v[i];
        	}
    	}
    	
    	System.out.println();
  	 
    	for(int i=0;i<v.length;i++){
        	System.out.print(v[i]+", ");
    	}
    	
    	System.out.println();
    	//Imprimir
    	
    	System.out.println("Mitja: "+b/v.length);
    	System.out.println("Pitjor: "+c);
    	System.out.println("Millor: "+d);
  	}
}

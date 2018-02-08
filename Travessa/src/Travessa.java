/**
 * Aquest codi genera partits els pinta per pantall i dui quantes victories visitants hi ha hagut
 * @author marc
 *
 */
public class Travessa {
	/**
	 * Constant que limita el número de partits a generar
	 */
	static final int maximPartits=15;
	
	public static void main(String[] args) {
		int[][] partits = new int[maximPartits][2];
    	partits=generarPartits();
		System.out.println("Els partits jugats són "+pintaJornada(partits));
		System.out.println("Ha hagut "+calcularVictoriesVisitants(partits)+" victòries visitants ");
	}
	
	/**
	 * Aquesta funció genera partits
	 * @return torna una matriu amb els resultats dels partits
	 */
	private static int[][] generarPartits(){
    int [][] matriu = new int[maximPartits][2];
    for(int p=0;p<maximPartits;p++){
			matriu[p][0]=(int) (Math.random()*4);
			matriu[p][1]=(int) (Math.random()*4);
		}
		return matriu;
	}	
	
	/**
	 * Formata la matriu i la torna com a cadena de text per ser impresa
	 * @param matriu se li pasa la matriu te partits generats abans
	 * @return torna una cadena formada per els resultats entre {} i separats per coma
	 */
	private static String pintaJornada(int[][] matriu){
		String cadena="{";
		for(int p=0;p<maximPartits-1;p++){
			cadena+="{"+matriu[p][0]+",";
			cadena+=matriu[p][1]+"},";
		}
		cadena+="{"+matriu[maximPartits-1][0]+",";
		cadena+=matriu[maximPartits-1][1]+"}}";
		return cadena;
	}
	
	/**
	 * Calcula les victories visitants
	 * @param matriu rep la matriu abans generada
	 * @return retorna el numero de victories
	 */
    private static int calcularVictoriesVisitants(int[][] matriu){
		int victories=0;
		for(int p=0;p<maximPartits-1;p++){
			if(matriu[p][0]<matriu[p][1]){
			    victories++;
			}
		}	
		return victories;
    }	
}
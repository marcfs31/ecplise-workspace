import java.io.*;
public class Juego {
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String x_str,o_str,ganador="";
		int x_col,x_fil,o_col,o_fil,fila=3,columna=3,empate=0;
		
		String matriz[][];
		matriz = new String[fila][columna];
		
		//Llenar matriz
		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				matriz[x][y] = "_";
			}
		}
		
		while (ganador=="") {
			empate++;
			//Comprobar que este vacio
			do {
				//Columna X
				do {
					System.out.println("Posición columna X");
					x_str = reader.readLine();
					x_col = Integer.parseInt(x_str);
					
					if (x_col > 2 || x_col < 0) {
						System.out.println("Posición no existente");
					}
					//Fila X
					do {
						System.out.println("Posición fila X");
						x_str = reader.readLine();
						x_fil = Integer.parseInt(x_str);
						
						if (x_fil > 2 || x_fil < 0) {
							System.out.println("Posición no existente");
						}
						
					} while (x_fil > 2 || x_fil < 0);
					
				} while (x_col > 2 || x_col < 0);
				
				if (matriz[x_fil][x_col]=="O" || matriz[x_fil][x_col]=="X") {
					System.out.println("Posición ocupada");
				}
				
			} while (matriz[x_fil][x_col]=="O" || matriz[x_fil][x_col]=="X");
			
			
			matriz[x_fil][x_col] = "X";
			
			System.out.println("0   1   2");
			//Imprimir la matriz
			for (int x=0; x < matriz.length; x++) {
				for (int y=0; y < matriz[x].length; y++) {
					if (y==2 && x==0) {
						System.out.print(matriz[x][y]+" | "+ 0);
					}else if(y==2 && x== 1){
						System.out.print(matriz[x][y]+" | "+ 1);
					}else if (y==2 && x==2) {
						System.out.print(matriz[x][y]+" | "+ 2);
					}else {
						System.out.print(matriz[x][y]+" | "); // \t tabulador
					}
				}
				System.out.println();
			}
			
			if (matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")) {
		        ganador="X";
		    }else if (matriz[0][0].equals("O") && matriz[0][1].equals("O") && matriz[0][2].equals("O")) {
		        ganador="O";
		    }
			
		    if (matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X")) {
		        ganador="X";
		    }else if (matriz[1][0].equals("O") && matriz[1][1].equals("O") && matriz[1][2].equals("O")) {
		        ganador="O";
		    }
		    
		    if (matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")) {
		        ganador="X";
		    }else if (matriz[2][0].equals("O") && matriz[2][1].equals("O") && matriz[2][2].equals("O")) {
		        ganador="O";
		    }
		    
		    if (matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X")) {
		        ganador="X";
		    }else if (matriz[0][0].equals("O") && matriz[1][0].equals("O") && matriz[2][0].equals("O")) {
		        ganador="O";
		    }
		    
		    if (matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X")) {
		        ganador="X";
		    }if (matriz[0][1].equals("O") && matriz[1][1].equals("O") && matriz[2][1].equals("O")) {
		        ganador="O";
		    }
		    
		    if (matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X")) {
		        ganador="X";
		    }if (matriz[0][2].equals("O") && matriz[1][2].equals("O") && matriz[2][2].equals("O")) {
		        ganador="O";
		    }
		    
		    if (matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")) {
		        ganador="X";
		    }if (matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O")) {
		        ganador="O";
		    }
		    
		    if (matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X")) {
		        ganador="X";
		    }else if (matriz[0][2].equals("O") && matriz[1][1].equals("O") && matriz[2][0].equals("O")) {
		        ganador="O";
		    }
			
		    //Comprobar si hay empate
		    if (empate == 9) {
				break;
			}
		    
		    empate++;
		    //Comprobar que este vacio
			do {
				//Columna O
				do {
					System.out.println("Posición columna O");
					o_str = reader.readLine();
					o_col = Integer.parseInt(o_str);
					
					if (o_col > 2 || o_col < 0) {
						System.out.println("Posición no existente");
					}
					//Fila O
					do {
						System.out.println("Posición fila O");
						o_str = reader.readLine();
						o_fil = Integer.parseInt(o_str);
						
						if (o_fil > 2 || o_fil < 0) {
							System.out.println("Posición no existente");
						}
						
					} while (o_fil > 2 || o_fil < 0);
					
				} while (o_col > 2 || o_col < 0);
				
				if (matriz[o_fil][o_col]=="O" || matriz[o_fil][o_col]=="X") {
					System.out.println("Posición ocupada");
				}
				
			} while (matriz[o_fil][o_col]=="O" || matriz[o_fil][o_col]=="X");
			
			matriz[o_fil][o_col] = "O";
			
			System.out.println("0   1   2");
			//Imprimir la matriz
			for (int x=0; x < matriz.length; x++) {
				for (int y=0; y < matriz[x].length; y++) {
					if (y==2 && x==0) {
						System.out.print(matriz[x][y]+" | "+ 0);
					}else if(y==2 && x== 1){
						System.out.print(matriz[x][y]+" | "+ 1);
					}else if (y==2 && x==2) {
						System.out.print(matriz[x][y]+" | "+ 2);
					}else {
						System.out.print(matriz[x][y]+" | "); // \t tabulador
					}
				}
				System.out.println();
			}
		}
		//Dar resultado
		if (empate == 9 && ganador =="") {
			System.out.println("Ha habido un emapte");
		}else {
			System.out.println("Ganador "+ganador);
		}
	}
}


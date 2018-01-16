import java.util.Random;
import java.io.*;
import org.apache.commons.lang3.StringUtils;
public class juego {
	public static void main (String[] args) throws IOException, InterruptedException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//Variables Genius mind
		Random rand = new Random();
		String idioma,game,game2="",lang,op,resp_str,dificultad="",difficulty,exit="n",salir="n",salir2="n",salir3="n",salir4="n";
		int num1,num2,num_op,resp=0,result,puntos=0,nivel=0,mult=1;
		long time_used=0;
		long time_left=0;
		long init_cont=0;
		long fin_cont=0;
		long lap_cont=0;
		
		//Arrays Genius mind
		String ops[] = {"+","-","x"};
		String ops_ex[] = {"+","-","x","%"};
		
		//Variables 3Raya
		String x_str,o_str,ganador="";
		int x_col,x_fil,o_col,o_fil,fila=3,columna=3,empate=0;
		
		//Matriz 3Raya
		String matriz[][];
		matriz = new String[fila][columna];
		
		do {
			//Menú principal
			System.out.println(" _____                           ");
			System.out.println("|  __ \\                          ");
			System.out.println("| |  \\/ __ _ _ __ ___   ___  ___ ");
			System.out.println("| | __ / _` | '_ ` _ \\ / _ \\/ __|");
			System.out.println("| |_\\ \\ (_| | | | | | |  __/\\__ \\");
			System.out.println(" \\____/\\__,_|_| |_| |_|\\___||___/");
			System.out.println("                                 ");
			System.out.println("         Choose the game: ");
			System.out.println("Tres en raya:1 || Genius mind:2 || Ahorcado:3 || Exit:4");
			game = reader.readLine();
			switch (game) {
			case "1": game2 ="3Raya";
				break;
			case "2": game2 ="Genius";
				break;
			case "3": game2 ="Ahorcado";
				break;
			case "4": salir3="s";
				break;
			default: game2 ="3Raya";
				break;
			}
		
			if(salir3.equals("s")){
				break;
			}
			
			if (game2.equals("Ahorcado")) {
				
				System.out.println("  ___  _                             _       ");
				System.out.println(" / _ \\| |                           | |      ");
				System.out.println("/ /_\\ \\ |__   ___  _ __ ___ __ _  __| | ___  ");
				System.out.println("|  _  | '_ \\ / _ \\| '__/ __/ _` |/ _` |/ _ \\ ");
				System.out.println("| | | | | | | (_) | | | (_| (_| | (_| | (_) |");
				System.out.println("\\_| |_/_| |_|\\___/|_|  \\___\\__,_|\\__,_|\\___/");
				System.out.println("               Elige que hacer: ");
				System.out.println("               Jugar:1 || Salir:2");
				game = reader.readLine();
				switch (game) {
				case "1": game2 ="Ahorcado";
					break;
				case "2": salir4="s";
					break;
				default: game2 ="Ahorcado";
					break;
				}
				
				if(salir4.equals("s")){
					break;
				}
				
				//Variables
				String letra, entrar="s";
				char letra_char = 0,vacio='_';
				int aciertos=0,intentos=6,tmp=0,errores=0;
				
				String palabras[] = {"coche","casa","arbol","planta","ordenador","cucaracha","isla","playa","campo","flor","cartera","autobus","raton",""};
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
				
				//Bucle del juego
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
			//3 en raya
			//Arreglar boton atrás
			if (game2.equals("3Raya")) {
				System.out.println(" _____                                                  ");
				System.out.println("|_   _|                                                 ");
				System.out.println("  | |_ __ ___  ___    ___ _ __    _ __ __ _ _   _  __ _ "); 
				System.out.println("  | | '__/ _ \\/ __|  / _ \\ '_ \\  | '__/ _` | | | |/ _` |");
				System.out.println("  | | | |  __/\\__ \\ |  __/ | | | | | | (_| | |_| | (_| |");
				System.out.println("  \\_/_|  \\___||___/  \\___|_| |_| |_|  \\__,_|\\__, |\\__,_|");
				System.out.println("                                             __/ |      ");
				System.out.println("                                            |___/       ");
				System.out.println("               Elige que hacer: ");
				System.out.println("               Jugar:1 || Salir:2");
				game = reader.readLine();
				switch (game) {
				case "1": game2 ="3Raya";
					break;
				case "2": salir4="s";
					break;
				default: game2 ="3Raya";
					break;
				}
				
				if(salir4.equals("s")){
					break;
				}
				
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
			
			//Genius mind
			if (game2.equals("Genius")) {
				do{
					idioma="";
					//Selección de idioma
					System.out.println("                  _                       _           _ ");
					System.out.println("                 (_)                     (_)         | |");
					System.out.println("  __ _  ___ _ __  _ _   _ ___   _ __ ___  _ _ __   __| |");
					System.out.println(" / _` |/ _ \\ '_ \\| | | | / __| | '_ ` _ \\| | '_ \\ / _` |");
					System.out.println("| (_| |  __/ | | | | |_| \\__ \\ | | | | | | | | | | (_| |");
					System.out.println(" \\__, |\\___|_| |_|_|\\__,_|___/ |_| |_| |_|_|_| |_|\\__,_|");
					System.out.println("  __/ |                                                 ");
					System.out.println(" |___/                                                  ");
					System.out.println("               Choose the game language: ");
					System.out.print("      English:1 || Spanish:2 || Catalan:3 || Exit:4");
					System.out.println();
					lang = reader.readLine();
					switch(lang){
						case "1": idioma="English";
							break;
						case "2": idioma="Spanish";
							break;
						case "3": idioma="Catalan";
							break;
						case "4": salir="s";
						default: idioma= "English";
					}
					
					Runtime.getRuntime().exec("clear");//Hacer un clear
					
					if(salir.equals("s")){
						break;
					}
					
					//Inglés
					if(idioma.equals("English")){
						do{
							//Niveles y multiplicador de puntos
							if (puntos>=25) {
								if(nivel != 1) {
									nivel = 1;
									System.out.println("Congratulations you passed to Level"+nivel);
								}else {
									System.out.println("You are at Level "+nivel);
								}
								mult = 2;
							}else if (puntos>=50) {
								if(nivel != 2) {
									nivel = 2;
									System.out.println("Congratulations you passed to Level"+nivel);
								}else {
									System.out.println("You are at Level "+nivel);
								}
								mult = 4;
							}else if (puntos>=75) {
								if(nivel != 3) {
									nivel = 3;
									System.out.println("Congratulations you passed to Level"+nivel);
								}else {
									System.out.println("You are at Level "+nivel);
								}
								mult = 6;
							}else if (puntos>=100) {
								if(nivel != 4) {
									nivel = 4;
									System.out.println("Congratulations you passed to Level"+nivel);
								}else {
									System.out.println("You are at Level "+nivel);
								}
								mult = 8;
							}else if (puntos>=200){
								if(nivel != 5) {
									nivel = 5;
									System.out.println("Congratulations you passed to Level"+nivel);
								}else {
									System.out.println("You are at Level "+nivel);
								}
								mult = 10;
							}else if (puntos>=1000) {
								System.out.println("Congratulations you won the game!!!!");
							}else {
								nivel = 0;
								System.out.println("You are at Level "+nivel);
								mult = 1;
							}
							
							Thread.sleep(500); //Duerme la ejecución 0,5 segundos
							
							Runtime.getRuntime().exec("clear"); //Ejecuta un clear
							
							//Dificultad
							System.out.println("     Choose the difficulty of the game: ");
							System.out.print("Easy:1 || Normal:2 || Hard:3 || Extreme:4 || Go back:5 || Language:6");
							System.out.println();
							difficulty = reader.readLine();
							switch(difficulty){
								case "1": dificultad ="Easy";
									break;
								case "2": dificultad ="Normal";
									break;
								case "3": dificultad ="Hard";
									break;
								case "4": dificultad = "Extreme";
									break;
								case "5": exit= "s";
									break;
								case "6": salir2 = "s";
									break;
								default: dificultad = "Easy";
							}
							
							if(exit.equals("s")){
								exit="n";
								break;
							}
							
							if (salir2.equals("s")) {
								salir="n";
								break;
							}
							
							Runtime.getRuntime().exec("clear");
							
							//Fácil
							if(dificultad.equals("Easy")){
								init_cont = System.currentTimeMillis();
								
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Time left: "+time_left+" of 60 seconds");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(10) + 1;
									num2 = rand.nextInt(10) + 1;
									num_op = rand.nextInt(3) + 1;
									num_op--;
									op=ops[num_op];
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else{
										result = num1*num2;
									}
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									
									System.out.print("Answer: ");
									resp_str = reader.readLine();
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (1*mult);
									}else{
										puntos -= 1;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("No time left");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Time used "+time_used+" of 60 seconds");
								}
								
								//Puntos
								System.out.println("You have "+puntos+" points");
							
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
								
							}
							
							//Normal
							if(dificultad.equals("Normal")){
								init_cont = System.currentTimeMillis();
								
								//Calcular operadores y operando
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Time left: "+time_left+" of 60 seconds");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(100) + 1;
									num2 = rand.nextInt(100) + 1;
									num_op = rand.nextInt(4) + 1;
									num_op--;
									op=ops_ex[num_op];
									
									if(op.equals("%")){
										num1 = rand.nextInt(10) + 1;
										num2 = rand.nextInt(10) + 1;
									}
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else if(op.equals("*")){
										result = num1*num2;
									}else{
										result = num1%num2;
									}
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Answer: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (5*mult);
									}else{
										puntos -= 5;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("No time left");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Time used "+time_used+" of 60 seconds");
								}
								
								//Puntos
								System.out.println("You have "+puntos+" points");
								
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
							
							//Dificil
							if(dificultad.equals("Hard")){
								init_cont = System.currentTimeMillis();
								
								//Calcular operadores y operando
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Time left: "+time_left+" of 60 seconds");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(100) + 1;
									num2 = rand.nextInt(100) + 1;
									num_op = rand.nextInt(4) + 1;
									num_op--;
									op=ops_ex[num_op];
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else if(op.equals("*")){
										result = num1*num2;
									}else{
										result = num1%num2;
									}
									
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Answer: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (10*mult);
									}else{
										puntos -= 10;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("No time left");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Time used "+time_used+" of 60 seconds");
								}
								
								//Puntos
								System.out.println("You have "+puntos+" points");
								
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
							
							//Extremo
							if(dificultad.equals("Extreme")){
								init_cont = System.currentTimeMillis();
								
								//Calcular operadores y operando
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Time left: "+time_left+" of 60 seconds");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(100) + 1;
									num2 = rand.nextInt(100) + 1;
									num_op = rand.nextInt(4) + 1;
									num_op--;
									op=ops_ex[num_op];
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else if(op.equals("*")){
										result = num1*num2;
									}else{
										result = num1%num2;
									}
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Answer: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (25*mult);
									}else{
										puntos -= 25;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("No time left");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Time used "+time_used+" of 60 seconds");
								}
								
								//Puntos
								System.out.println("You have "+puntos+" points");
								
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
						}while(exit != "s");
						
					//Catalán
					}else if(idioma.equals("Catalan")){
						do{
							if (salir2.equals("yes")) {
								salir2="no";
								break;
							}
							
							//Niveles
							if (puntos>=25) {
								if(nivel != 1) {
									nivel = 1;
									System.out.println("Felicitats has passat de nivell "+nivel);
								}else {
									System.out.println("Ets al nivell "+nivel);
								}
								mult = 2;
							}else if (puntos>=50) {
								if(nivel != 2) {
									nivel = 2;
									System.out.println("Felicitats has passat de nivell "+nivel);
								}else {
									System.out.println("Ets al nivell "+nivel);
								}
								mult = 4;
							}else if (puntos>=75) {
								if(nivel != 3) {
									nivel = 3;
									System.out.println("Felicitats has passat de nivell "+nivel);
								}else {
									System.out.println("Ets al nivell "+nivel);
								}
								mult = 6;
							}else if (puntos>=100) {
								if(nivel != 4) {
									nivel = 4;
									System.out.println("Felicitats has passat de nivell "+nivel);
								}else {
									System.out.println("Ets al nivell "+nivel);
								}
								mult = 8;
							}else if (puntos>=200){
								if(nivel != 5) {
									nivel = 5;
									System.out.println("Felicitats has passat de nivell "+nivel);
								}else {
									System.out.println("Ets al nivell "+nivel);
								}
								mult = 10;
							}else if (puntos>=1000) {
								System.out.println("Felicitats has guanyat el joc!!!!");
							}else {
								nivel = 0;
								System.out.println("Ets al nivell "+nivel);
								mult = 1;
							}
							
							Thread.sleep(500);
							
							Runtime.getRuntime().exec("clear");
							
							//Dificultad
							System.out.println("     Escull la dificultat del joc: ");
							System.out.print("Fàcil:1 || Normal:2 || Difil:3 || Extrema:4 || Enrrere:5 || Llenguatge");
							System.out.println();
							difficulty = reader.readLine();
							switch(difficulty){
								case "1": dificultad ="Easy";
									break;
								case "2": dificultad ="Normal";
									break;
								case "3": dificultad ="Hard";
									break;
								case "4": dificultad = "Extreme";
									break;
								case "5": exit= "s";
									break;
								case "6": salir2 = "s";
									break;
								default: dificultad = "Easy";
							}
							
							if(exit.equals("s")){
								exit="n";
								break;
							}
							
							if (salir2.equals("s")) {
								salir="n";
								break;
							}
							Runtime.getRuntime().exec("clear");
							
							//Fácil
							if(dificultad.equals("Easy")){
								init_cont = System.currentTimeMillis();
								
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Temps restant: "+time_left+" de 60 segons");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(10) + 1;
									num2 = rand.nextInt(10) + 1;
									num_op = rand.nextInt(3) + 1;
									num_op--;
									op=ops[num_op];
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else{
										result = num1*num2;
									}
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Resposta: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (1*mult);
									}else{
										puntos -= 1;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("Temps acabat");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Temps utilitzat: "+time_used+" de 60 segons");
								}
								
								//Puntos
								System.out.println("Tens "+puntos+" punts");
							
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
							
							//Normal
							if(dificultad.equals("Normal")){
								init_cont = System.currentTimeMillis();
								
								//Calcular operadores y operando
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Temps restant: "+time_left+" de 60 segons");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(100) + 1;
									num2 = rand.nextInt(100) + 1;
									num_op = rand.nextInt(4) + 1;
									num_op--;
									op=ops_ex[num_op];
									
									if(op.equals("%")){
										num1 = rand.nextInt(10) + 1;
										num2 = rand.nextInt(10) + 1;
									}
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else if(op.equals("*")){
										result = num1*num2;
									}else{
										result = num1%num2;
									}
									
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Resposta: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (5*mult);
									}else{
										puntos -= 5;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("Temps acabat");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Temps utilitzat: "+time_used+" de 60 segons");
								}
								
								//Puntos
								System.out.println("Tens "+puntos+" punts");
								
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
							
							//Dificil
							if(dificultad.equals("Hard")){
								init_cont = System.currentTimeMillis();
								
								//Calcular operadores y operando
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Temps restant: "+time_left+" de 60 segons");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(100) + 1;
									num2 = rand.nextInt(100) + 1;
									num_op = rand.nextInt(4) + 1;
									num_op--;
									op=ops_ex[num_op];
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else if(op.equals("*")){
										result = num1*num2;
									}else{
										result = num1%num2;
									}
									
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Resposta: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (10*mult);
									}else{
										puntos -= 10;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("Temps acabat");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Temps utilitzat: "+time_used+" de 60 segons");
								}
								
								//Puntos
								System.out.println("Tens "+puntos+" punts");
								
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
							
							//Extremo
							if(dificultad.equals("Extreme")){
								init_cont = System.currentTimeMillis();
								
								//Calcular operadores y operando
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Temps restant: "+time_left+" de 60 segons");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(100) + 1;
									num2 = rand.nextInt(100) + 1;
									num_op = rand.nextInt(4) + 1;
									num_op--;
									op=ops_ex[num_op];
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else if(op.equals("*")){
										result = num1*num2;
									}else{
										result = num1%num2;
									}
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Resposta: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (25*mult);
									}else{
										puntos -= 25;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("Temps acabat");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Temps utilitzat: "+time_used+" de 60 segons");
								}
								
								//Puntos
								System.out.println("Tens "+puntos+" punts");
								
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
						}while(exit != "s");
					//Español
					}else if(idioma.equals("Spanish")){
						do{
							if (salir2.equals("yes")) {
								salir2="no";
								break;
							}
							//Niveles
							if (puntos>=25) {
								if(nivel != 1) {
									nivel = 1;
									System.out.println("Felicidades has subido al nivel "+nivel);
								}else {
									System.out.println("Estás en el nivel "+nivel);
								}
								mult = 2;
							}else if (puntos>=50) {
								if(nivel != 2) {
									nivel = 2;
									System.out.println("Felicidades has subido al nivel "+nivel);
								}else {
									System.out.println("Estás en el nivel "+nivel);
								}
								mult = 4;
							}else if (puntos>=75) {
								if(nivel != 3) {
									nivel = 3;
									System.out.println("Felicidades has subido al nivel "+nivel);
								}else {
									System.out.println("Estás en el nivel "+nivel);
								}
								mult = 6;
							}else if (puntos>=100) {
								if(nivel != 4) {
									nivel = 4;
									System.out.println("Felicidades has subido al nivel "+nivel);
								}else {
									System.out.println("Estás en el nivel "+nivel);
								}
								mult = 8;
							}else if (puntos>=200){
								if(nivel != 5) {
									nivel = 5;
									System.out.println("Felicidades has subido al nivel "+nivel);
								}else {
									System.out.println("Estás en el nivel "+nivel);
								}
								mult = 10;
							}else if (puntos>=1000) {
								System.out.println("Felicidades has ganado el juego!!!!");
							}else {
								nivel = 0;
								System.out.println("Estás en el nivel "+nivel);
								mult = 1;
							}
							
							Thread.sleep(500);
								
							Runtime.getRuntime().exec("clear");
						
						//Dificultad
						System.out.println("     Escoje la dificultad del juego: ");
						System.out.print("Fácil:1 || Normal:2 || Difil:3 || Extrema:4 || Atrás:5 || Lenguaje");
						System.out.println();
						difficulty = reader.readLine();
						switch(difficulty){
							case "1": dificultad ="Easy";
								break;
							case "2": dificultad ="Normal";
								break;
							case "3": dificultad ="Hard";
								break;
							case "4": dificultad = "Extreme";
								break;
							case "5": exit= "s";
								break;
							case "6": salir2 = "s";
								break;
							default: dificultad = "Easy";
						}
						
						if(exit.equals("s")){
							exit="n";
							break;
						}
						
						if (salir2.equals("s")) {
							salir="n";
							break;
						}
						
						Runtime.getRuntime().exec("clear");
						
						//Fácil
							if(dificultad.equals("Easy")){
								init_cont = System.currentTimeMillis();
								
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Tiempo restante: "+time_left+" de 60 segundos");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(10) + 1;
									num2 = rand.nextInt(10) + 1;
									num_op = rand.nextInt(3) + 1;
									num_op--;
									op=ops[num_op];
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else{
										result = num1*num2;
									}
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Respuesta: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (1*mult);
									}else{
										puntos -= 1;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("Tiempo acabado");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Tiempo usado: "+time_used+" de 60 segundos");
								}
								
								//Puntos
								System.out.println("Tienes "+puntos+" puntos");
							
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
							
							//Normal
							if(dificultad.equals("Normal")){
								init_cont = System.currentTimeMillis();
								
								//Calcular operadores y operando
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Tiempo restante: "+time_left+" de 60 segundos");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(100) + 1;
									num2 = rand.nextInt(100) + 1;
									num_op = rand.nextInt(4) + 1;
									num_op--;
									op=ops_ex[num_op];
									
									if(op.equals("%")){
										num1 = rand.nextInt(10) + 1;
										num2 = rand.nextInt(10) + 1;
									}
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else if(op.equals("*")){
										result = num1*num2;
									}else{
										result = num1%num2;
									}
									
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Respuesta: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (5*mult);
									}else{
										puntos -= 5;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("Tiempo acabado");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Tiempo usado: "+time_used+" de 60 segundos");
								}
								
								//Puntos
								System.out.println("Tienes "+puntos+" puntos");
								
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
							
							//Dificil
							if(dificultad.equals("Hard")){
								init_cont = System.currentTimeMillis();
								
								//Calcular operadores y operando
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Tiempo restante: "+time_left+" de 60 segundos");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(100) + 1;
									num2 = rand.nextInt(100) + 1;
									num_op = rand.nextInt(4) + 1;
									num_op--;
									op=ops_ex[num_op];
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else if(op.equals("*")){
										result = num1*num2;
									}else{
										result = num1%num2;
									}
									
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Respuesta: ");
									resp_str = reader.readLine(); 
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (10*mult);
									}else{
										puntos -= 10;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("Tiempo acabado");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Tiempo usado: "+time_used+" de 60 segundos");
								}
								
								//Puntos
								System.out.println("Tienes "+puntos+" puntos");
								
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
							
							//Extremo
							if(dificultad.equals("Extreme")){
								init_cont = System.currentTimeMillis();
								
								//Calcular operadores y operando
								for(int i=0;i<4;i++){
									//Tiempo por vuelta
									lap_cont = System.currentTimeMillis();
									if((init_cont+60000) < lap_cont){
										break;
									}else{
										time_left = 60-((lap_cont-init_cont)/1000);
										System.out.println("Tiempo restante: "+time_left+" de 60 segundos");
									}
									
									//Generar los numeros y el operador
									num1 = rand.nextInt(100) + 1;
									num2 = rand.nextInt(100) + 1;
									num_op = rand.nextInt(4) + 1;
									num_op--;
									op=ops_ex[num_op];
									
									//Calcular el resultado de las operaciones
									if(op.equals("+")){
										result = num1+num2;
									}else if(op.equals("-")){
										if (num1<num2) {
											result = num2-num1; 
										}else {
											result = num1-num2;
										}
									}else if(op.equals("*")){
										result = num1*num2;
									}else{
										result = num1%num2;
									}
									
									//Cojer respuestas
									if (num1<num2) {
										System.out.println(num2+op+num1);
									}else {
										System.out.println(num1+op+num2);
									}
									System.out.print("Respuesta: ");
									resp_str = reader.readLine();
									if(StringUtils.isNumeric(resp_str)){
										resp = Integer.parseInt(resp_str);
									}else{
										System.out.print("Answer: ");
										resp_str = reader.readLine();
									}
									
									Runtime.getRuntime().exec("clear");
									
									//Sistema de puntos
									if(resp == result){
										puntos += (25*mult);
									}else{
										puntos -= 25;
									}
								}
								
								fin_cont = System.currentTimeMillis();
								if((init_cont+60000) < fin_cont){
									System.out.println("Tiempo acabado");
								}else{
									//Calcular tiempo usado
									time_used = (fin_cont-init_cont)/1000;
									System.out.println("Tiempo usado: "+time_used+" de 60 segundos");
								}
								
								//Puntos
								System.out.println("Tienes "+puntos+" puntos");
								
								reader.readLine();
								dificultad = ""; 
								Runtime.getRuntime().exec("clear");
							}
						}while(exit != "s");
					}
				}while(salir != "s");
			}
		} while (salir3 != "s");
	}
}

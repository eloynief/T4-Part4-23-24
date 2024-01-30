package ej2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// creacion del scanner
		Scanner sc = new Scanner(System.in);

		// vector de n casillas
		int[] vector;

		//
		int n = 0;
		
		//numero que se genera para introducirlo en las cartas
		int random;
		
		//dos posiciones randmom para las dos cartas
		int posRandomA, posRandomB;
		
		// haz esto mientras que el numero sea impar
		do {

			// Pide por pantalla que introduzcamos un numero
			System.out.println("Introduce el numero del tamaño del array: ");

			// introducimos el numero
			n = sc.nextInt();

		} while (n % 2 != 0);

//		// si el numero es par
//		if (n % 2 == 0) {
//
//			// ponermos el tamaño del array
//			vector = new int[n];
//
//		}

		// ponermos el tamaño del array
		vector = new int[n];
		
		//
		for(int i=0;i<vector.length;i++) {
			
			//genera num  random
			random=(int)(Math.random()*10);
			
			//genera la posicion A
			posRandomA=(int)(Math.random()*vector.length);
			
			
			//genera la posicion B
			posRandomB=(int)(Math.random()*vector.length);
			
			//
			if(posRandomA==posRandomB) {
				
				//va generando numeros aleatorios hasta que el numero no sea igual
				do {

					//generar numero otra vez
					posRandomB=(int)(Math.random()*10);
					
				}while(posRandomA==posRandomB);//fin do while posRandomA==posRandomB
			
			}//fin if posRandomA==posRandomB
			
			
			//for para comprobar si el numero esta dentro de una posicion
			for(int j=0;j<vector.length;j++) {
				
				//si el numero esta dentro del array
				if(vector[j]==random){
					//va generando numeros aleatorios hasta que el numero no sea igual
					do {

						//generar numero otra vez
						random=(int)(Math.random()*10);
					}while(vector[j]==random);//fin do while vector j
				
				}//fin if
				
			}//fin for j
			
			//
			vector[posRandomA]=random;
			
			//
			vector[posRandomB]=random;
			
			
		}//fin for i
		
		
		
		System.out.println(Arrays.toString(vector));
		
		
		
		// cierre del scanner
		sc.close();

	}

}

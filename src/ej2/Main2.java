package ej2;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		// creacion del scanner
		Scanner sc = new Scanner(System.in);

		// vector de n casillas
		int[] vector=null;

		//
		int n = 0;
		
		//va incrementando en el for que añade los valores al array
		int veces=0;
		
		//
		int contador=0;
		
		//numero que se genera para introducirlo en las cartas
		int random=0;
		
		
		
		// haz esto mientras que el numero sea impar
		do {

			// Pide por pantalla que introduzcamos un numero
			System.out.println("Introduce el numero del tamaño del array: ");

			// introducimos el numero
			n = sc.nextInt();

		} while (n % 2 != 0);

		// si el numero es par
		if (n % 2 == 0) {

			// ponermos el tamaño del array
			vector = new int[n];

		}
		
		for(int i=0;i<vector.length/2;i++) {
			random=(int)(Math.random()*6);
			
			while(veces<2){
				//
				vector[contador+veces]=random;
				veces++;
			}
			
			veces=0;
			contador+=2;
		}
		
		//desordena los valores
//		Arrays.sort(vector);
		
		System.out.println(Arrays.toString(vector));
		
		
		// cierre del scanner
		sc.close();

	}

}

package ej1;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int TAMANO_RED=6;
		
		int[] red=new int[TAMANO_RED];
		
		//posicion de la mosca
		int posicionMosca;
		
		//ejercicio para ver si hay casilla adyacente
		int casillaAdyacente;
		
		//numero random para ver si esta dentro o no
		int estaDentro;
		
		for (int i=0;i<red.length;i++) {
			//genero el numero aleatorio de la posicion de la mosca
			posicionMosca=(int)(Math.random()*TAMANO_RED-1);
			
			//
			estaDentro=(int)(Math.random()*2);
			
			//
			casillaAdyacente=(int)(Math.random()*2);
			
			//si el numero esta dentro 
			if(estaDentro==2) {
				//ponemos el numero mosca dentro
				red[posicionMosca]=estaDentro;
				
			}
			
			//si la mosca esta en una posicion adyacente
			if (casillaAdyacente==1) {
				red[posicionMosca+casillaAdyacente]=estaDentro;
			}
			

			
			System.out.println(Arrays.toString(red));
			
			
		}
		
		
		
		
		
	}
	
	
	

}

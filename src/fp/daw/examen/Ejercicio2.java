package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	/*
	 * 3 puntos
	 * 
	 * Escribir en el método main un programa que lea del teclado dos números enteros y calcule
	 * la suma de todos los números impares comprendidos entre ellos, ambos incluidos.
	 * 
	 * El programa deberá calcular el resultado sin importar el orden en que se introduzcan los dos números
	 * (primero el mayor o primero el menor).
	 * 
	 * Si es posible, minimizar el número de iteraciones que se ejecutarán para obener el resultado.
	 * 
	 * No se permite el uso de la clase Scanner para leer del teclado.
	 * 
	 * Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String prueba="";
		int num1;
		int num2;
		int mayor=0;
		int menor=0;
		int suma=0;
	
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca numero 1.");
		num1 = Integer.parseInt(in.readLine());
		System.out.println("Introduzca numero 2.");
		num2 = Integer.parseInt(in.readLine());
		
		if(num1<num2) {
			mayor=num2;
			menor=num1;
		}
		else if(num1>num2) {
			mayor=num1;
			menor=num2;
		}
		else {
			System.out.println("Son iguales.");
		}
		
		for(int i=menor;i<=mayor;i++) {		
			if(i%2!=0) {
				suma+=i;
				prueba+=i+" ";
				
			}
		}
		
		System.out.println(prueba);
		System.out.println("La suma entre " + menor + " y " + mayor + " es " + suma);
		}
		
	}



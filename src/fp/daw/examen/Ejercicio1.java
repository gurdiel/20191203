package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	/* 
	 * 4 puntos
	 * 
	 * Escribir en el método main un programa que pida por teclado un número decimal menor o igual
	 * que 3000 y muestre por pantalla el resultado de convertirlo a un número romanos.
	 *     
	 *     La conversión se realizará transformando individualmente cada dígito, empezando por el correspondiente
	 *     a las unidades de millar, seguido de las centenas, decenas y unidades de la forma siguiente:
	 *     
	 *     		Dígito decimal		|	Transformación
	 *     		--------------------|----------------------------------------------------------------------------
	 *     		1, 2 o 3			|	Escribir C1 de una a tres veces
	 *     		4					|	Escribir C1 seguido de C2
	 *     		5, 6, 7 o 8			|	Escribir una vez C2 seguido de C1 de cero a tres veces
	 *     		9					|	Escribir C1 seguido de C3
	 *     
	 *     donde C1, C2 y C3 son los caracteres de numeración romana que corresponda según la tabla siguiente:
	 *     
	 *     							|   C1   |   C2   |   C3   |
	 *     		--------------------|--------|--------|--------|        
	 *     		unidades			|	I    |   V    |   X    |
	 *     		decenas				|	X    |   L    |   C    |
	 *     		centenas			|	C    |   D    |   M    |
	 *     		unidades de millar	|	M    |        |        |
	 *     
	 *     Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */

	public static void main(String[] args) throws IOException {
		
		int numero=0;
		String prueba="Prueba";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca numero a transformar.");
		String cadena=in.readLine();
		numero= Integer.parseInt(cadena);
			System.out.print("ultimo numero" + cadena.charAt(cadena.length()-1));
		while((numero>3000 || numero<0)) {
			
			System.out.println("ERROR, introduce un número menor de 3000.");
			System.out.println("Introduzca numero a transformar.");
			numero=Integer.parseInt(in.readLine());
			//	
		}
		
		for(int i =0;i<cadena.length();i++) {
			
			prueba+= mifuncion(cadena.charAt(i),i);
			System.out.println(" " +cadena.charAt(i) + " ");
		}
			
		System.out.println(prueba);
		
	}

	 static String mifuncion(char x,int j) {
		 String valor="";
		 String valor1="",valor2="",valor3="";
		 
		 if(j==0) {
			 valor1="M";
		 }
		 else if(j==1) {
			 valor1="C";
			 valor2="D";
			 valor3="M";
		 }
		 else if(j==2) {
			 valor1="X";
			 valor2="L";
			 valor3="C";
		 }
		 else if(j==3) {
			 valor1="I";
			 valor2="V";
			 valor3="X";
		 }
		 System.out.println(valor1 + "primera " + " " + valor2+ " " + valor3 + "charAT "+ x + "\norden " + j);
		
		 switch(x) {
		case 1:
			valor+=valor1;
			break;
		case 2:
			valor+=valor1 + "" +valor1;
			break;
		case 3:
			valor+=valor1 + "" + valor1 + "" + valor1;
			break;
		case 4:
			valor+= valor1 + "" + valor2;
			break;
			
		case 5:
			valor+=valor2;
			break;
			

		case 6:
			valor+= valor2 + "" +valor1;
			break;

		case 7:
			valor+=valor2 + ""+ valor1 +"" + valor1;
			break;

		case 8:
			valor+= valor2 + "" + valor1 + " " + valor1 +"" + valor1;
			break;

		case 9:
			valor+=valor1+ "" + valor3;
			break;
		}
		
		return valor;
	}
	
}

package calculadoraInversa;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de Variables
		String s1 = JOptionPane.showInputDialog("Introduzca el primer n�mero:");
		String s2 = JOptionPane.showInputDialog("Introduzca el segundo n�mero:");
		String operacion = JOptionPane.showInputDialog("Introduzca el s�mbolo de la operaci�n a realizar: (+,-,*,/,^,%)");
		
		//Parseo de String a Integer
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		
		//Salida de datos con condicional
		switch (operacion) {
		case "+":
			System.out.println(i1+operacion+i2+"= "+(i1+i2));
			break;
		case "-":
			System.out.println(i1+operacion+i2+"= "+(i1-i2));
			break;
		case "*":
			System.out.println(i1+operacion+i2+"= "+(i1*i2));
			break;
		case "/":
			System.out.println(i1+operacion+i2+"= "+(i1/i2));
			break;
		case "^":
			System.out.println(i1+operacion+i2+"= "+(i1^i2));
			break;
		case "%":
			System.out.println(i1+operacion+i2+"= "+(i1%i2));
			break;

		default:
			System.out.println("Error");
			break;
		}
	}

}

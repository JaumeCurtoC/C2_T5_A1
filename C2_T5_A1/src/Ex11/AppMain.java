package Ex11;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de Variables
		String s = JOptionPane.showInputDialog("Indique el n�mero del dia de la semana (1-7):");
		
		//Parseo de String a int
		int i = Integer.parseInt(s);
		
		//Salida de datos con condicional
		switch (i) {
		case 1:
			System.out.println("Lunes: d�a laboral");
			break;
		case 2:
			System.out.println("Martes: d�a laboral");
			break;
		case 3:
			System.out.println("Mi�rcoles: d�a laboral");
			break;
		case 4:
			System.out.println("Jueves: d�a laboral");
			break;
		case 5:
			System.out.println("Viernes: d�a laboral");
			break;
		case 6:
			System.out.println("S�bado: d�a festivo");
			break;
		case 7:
			System.out.println("Domingo: d�a festivo");
			break;
		default:
			System.out.println("Error al introducir el n�mero.");
			break;
		}
		

	}

}

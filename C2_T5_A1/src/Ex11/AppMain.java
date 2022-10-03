package Ex11;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		String s = JOptionPane.showInputDialog("Indique el número del dia de la semana (1-7):");
		
		//Parseo de String a int
		int i = Integer.parseInt(s);
		
		//Salida de datos con condicional
		switch (i) {
		case 1:
			System.out.println("Lunes: día laboral");
			break;
		case 2:
			System.out.println("Martes: día laboral");
			break;
		case 3:
			System.out.println("Miércoles: día laboral");
			break;
		case 4:
			System.out.println("Jueves: día laboral");
			break;
		case 5:
			System.out.println("Viernes: día laboral");
			break;
		case 6:
			System.out.println("Sábado: día festivo");
			break;
		case 7:
			System.out.println("Domingo: día festivo");
			break;
		default:
			System.out.println("Error al introducir el número.");
			break;
		}
		

	}

}

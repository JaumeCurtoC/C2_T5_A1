package Ex4;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		String n = JOptionPane.showInputDialog("Introduce el radio del círculo:");
		
		//Parseo del radio de String a Double
		double r = Double.parseDouble(n);
		
		//Calculo del área
		double a = Math.pow(r, 2)*Math.PI;
		
		//Salida de datos
		System.out.println("El area de un círculo con radio de "+r+" es: "+a );
	}
}

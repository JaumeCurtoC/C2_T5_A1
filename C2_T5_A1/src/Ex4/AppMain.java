package Ex4;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de Variables
		String n = JOptionPane.showInputDialog("Introduce el radio del c�rculo:");
		
		//Parseo del radio de String a Double
		double r = Double.parseDouble(n);
		
		//Calculo del �rea
		double a = Math.pow(r, 2)*Math.PI;
		
		//Salida de datos
		System.out.println("El area de un c�rculo con radio de "+r+" es: "+a );
	}
}

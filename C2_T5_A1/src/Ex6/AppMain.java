package Ex6;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de variables
		final double IVA = 0.21;
		String s = JOptionPane.showInputDialog("Precio del producto:");
		
		//Parseo de String a Double
		double d = Double.parseDouble(s);
		
		//Cálculo del precio final
		double precioFinal = d+(d*IVA);
		
		//Salida de datos
		System.out.println("El precio final del producto es: "+precioFinal);

	}

}

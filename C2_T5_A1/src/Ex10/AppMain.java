package Ex10;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraciópn de Variables
		String s = JOptionPane.showInputDialog("Indique el número de ventas: ");
		double totalVentas = 0;
		
		//Parseo de String a Int
		int i = Integer.parseInt(s);
		
		//Bucle
		for (int j = 0; j < i; j++) {
			//Declaración de variables de bucle
			String ventaS = JOptionPane.showInputDialog("Indique el total de la venta "+(j+1)+":");
			
			//Parseo de String a double
			double ventaD = Double.parseDouble(ventaS);
			
			//Suma de ventas
			totalVentas = totalVentas + ventaD;
			
		}
		
		//Salida de datos
		System.out.println("El total de las ventas es: "+totalVentas);

	}

}

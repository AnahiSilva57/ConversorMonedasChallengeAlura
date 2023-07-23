package Interface;

import javax.swing.JOptionPane;

public class Ventanas{	
	
	public void VentanasCalculo(Double mon2, String divisa, String mon1) {
		Double cantidadUsuario = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa cantidad "+ mon1));
		double operacion = cantidadUsuario * mon2;
		JOptionPane.showMessageDialog
		(null, "Total: " + operacion + "\n\n 1 " + mon1 + " equivale a " + mon2 + " " + divisa);
		
	}	
	
}

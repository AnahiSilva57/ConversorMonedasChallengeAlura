package Interface;

import javax.swing.JOptionPane;

import Control.FrasesSalida;

public class VentanaValidarSalida {
	
	String tituloSalida = "¿De veras quieres salir?";
	FrasesSalida frassal = new FrasesSalida();
	
	public void preguntarSalir() {	
		int respuestaUsuario = JOptionPane.showOptionDialog(null, tituloSalida, "No te vayas...", 0, JOptionPane.WARNING_MESSAGE, null, null, tituloSalida);
		
		if (respuestaUsuario == 0) {	
			frassal.FraseSalirSi();
			System.exit(1);
		}
		if (respuestaUsuario == 1) {
			frassal.FraseSalirNo();
		
		}		
	}
}

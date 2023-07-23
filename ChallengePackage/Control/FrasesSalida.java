package Control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

import javax.swing.JOptionPane;

public class FrasesSalida {
	
	Random random = new Random();	
	
	public void FraseSalirSi() {			
	List <String> listaSalirSi = new ArrayList();	
	listaSalirSi.add("¡Por eso nadie te quiere! :(");
	listaSalirSi.add("Bye solecito! n.n ");
	listaSalirSi.add("Vete ya, sino encuentras motivos! u.u");
	listaSalirSi.add("¡Cuidate bombon! ;D");
	listaSalirSi.add("¡Te falta odio!");
			int index = random.nextInt(listaSalirSi.size());	
			JOptionPane.showMessageDialog(null,listaSalirSi.get(index));	
	}	
	public void FraseSalirNo() {		
		List <String> listaSalirNo = new ArrayList();	
		listaSalirNo.add("¡Yay, mas diversion! ");
		listaSalirNo.add("Te quiero, sigue asi! ");
		listaSalirNo.add("¡Naciste el dia que nacieron todas las flores!");
		listaSalirNo.add("¡Eres el mejor, solecin!");			
			int index = random.nextInt(listaSalirNo.size());		
			JOptionPane.showMessageDialog(null,listaSalirNo.get(index));		
		}
}


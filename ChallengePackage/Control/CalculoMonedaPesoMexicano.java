package Control;

import javax.swing.JOptionPane;
import Interface.Ventanas;


public class CalculoMonedaPesoMexicano {
	
	double mon2;
	String mon1 = "Peso mexicano";
	String divisa;	
	Ventanas ventanas = new Ventanas();	
	
	public void PesoMexicano_a_PesoArgentino (){		
		mon2= 15.85 ;
		divisa = "Peso argentino";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoMexicano_a_PesoChileno (){		
		mon2= 48.06 ;
		divisa = "Peso chileno";
		ventanas.VentanasCalculo(mon2,divisa, mon1);		
	}
	public void PesoMexicano_a_dolarAmericano (){		
		mon2= 0.059;
		divisa = "Dolar americano";
		ventanas.VentanasCalculo(mon2,divisa, mon1);		
	}
	public void PesoMexicano_a_dolarCanadiense (){		
		mon2= 0.078;
		divisa = "Dolar canadiense";
		ventanas.VentanasCalculo(mon2, divisa, mon1);		
	}
	public void PesoMexicano_a_libraEsterlina (){		
		mon2= 0.046;
		divisa = "Libra esterlina";
		ventanas.VentanasCalculo(mon2, divisa, mon1);		
	}
	public void PesoMexicano_a_Yen (){		
		mon2= 8.35;
		divisa = "Yen";
		ventanas.VentanasCalculo(mon2, divisa, mon1);		
	}
}

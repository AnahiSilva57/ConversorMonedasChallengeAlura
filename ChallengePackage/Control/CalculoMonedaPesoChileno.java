package Control;

import javax.swing.JOptionPane;
import Interface.Ventanas;

public class CalculoMonedaPesoChileno {	
	double mon2;
	String mon1 = "Peso chileno";
	String divisa;	
	Ventanas ventanas = new Ventanas();	
	
	
	public void PesoChileno_a_PesoMexicano (){		
		mon2= 0.021 ;
		divisa = "Peso mexicano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoChileno_a_PesoArgentino (){		
		mon2= 0.33 ;
		divisa = "Peso argentino";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoChileno_a_DolarAmericano(){		
		mon2= 0.0012;
		divisa = "Dolar americano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoChileno_a_DolarCanadiense(){		
		mon2= 0.0016;
		divisa = "Dolar canadiense";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoChileno_a_LibraEsterlina(){		
		mon2= 0.00095;
		divisa = "Libra esterlina";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoChileno_a_Yen(){		
		mon2= 0.17 ;
		divisa = "Yen";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
}

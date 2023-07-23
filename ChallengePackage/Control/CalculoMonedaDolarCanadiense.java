package Control;

import Interface.Ventanas;

public class CalculoMonedaDolarCanadiense {
	double mon2;
	String mon1 = "Dolar canadiense";
	String divisa;	
	Ventanas ventanas = new Ventanas();
	
	public void DolarCanadiense_a_PesoMexicano(){		
		mon2= 12.84;
		divisa = "Peso mexicano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarCanadiense_a_PesoChileno(){		
		mon2= 617.12;
		divisa = "Peso chileno";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarCanadiense_a_PesoArgentino(){		
		mon2= 203.50;
		divisa = "Peso argentino";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarCanadiense_a_DolarAmericano(){		
		mon2= 0.76;
		divisa = "Dolar americano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarCanadiense_a_LibraEsterlina(){		
		mon2= 0.59;
		divisa = "Libra esterlina";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarCanadiense_a_Yen(){		
		mon2= 107.17;
		divisa = "Yen";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
}

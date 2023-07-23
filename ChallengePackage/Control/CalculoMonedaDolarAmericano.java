package Control;

import Interface.Ventanas;

public class CalculoMonedaDolarAmericano {
	
	double mon2;
	String mon1 = "Dolar americano";
	String divisa;	
	Ventanas ventanas = new Ventanas();
	
	public void DolarAmericano_a_PesoMexicano(){		
		mon2= 16.99;
		divisa = "Peso mexicano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarAmericano_a_PesoChileno(){		
		mon2= 816.48;
		divisa = "Peso chileno";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarAmericano_a_PesoArgentino(){		
		mon2= 269.24;
		divisa = "Peso argentino";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarAmericano_a_DolarCanadiense(){		
		mon2= 1.32;
		divisa = "Dolar canadiense";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarAmericano_a_LibraEsterlina(){		
		mon2= 0.78;
		divisa = "Libra esterlina";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void DolarAmericano_a_Yen(){		
		mon2= 141.79;
		divisa = "Yen";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
}

package Control;

import Interface.Ventanas;

public class CalculoMonedaPesoArgentino {	
	double mon2;
	String mon1 = "Peso argentino";
	String divisa;	
	Ventanas ventanas = new Ventanas();
	
	public void PesoArgentino_a_PesoMexicano(){		
		mon2= 0.063;
		divisa = "Peso mexicano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoArgentino_a_PesoChileno(){		
		mon2= 3.03;
		divisa = "Peso chileno";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoArgentino_a_DolarAmericano(){		
		mon2= 0.0037;
		divisa = "Dolar americano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoArgentino_a_DolarCanadiense(){		
		mon2= 0.0049;
		divisa = "Dolar canadiense";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoArgentino_a_LibraEsterlina(){		
		mon2= 0.0029;
		divisa = "Libra esterlina";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void PesoArgentino_a_Yen(){		
		mon2= 0.53;
		divisa = "Yen";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
}

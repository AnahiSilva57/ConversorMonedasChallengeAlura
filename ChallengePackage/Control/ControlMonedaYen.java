package Control;

import Interface.Ventanas;

public class ControlMonedaYen {
	double mon2;
	String mon1 = "Yen";
	String divisa;	
	Ventanas ventanas = new Ventanas();
	
	public void Yen_a_PesoMexicano(){		
		mon2= 0.12;
		divisa = "Peso Mexicano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void Yen_a_PesoChileno(){		
		mon2= 5.76;
		divisa = "Peso Chileno";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void Yen_a_PesoArgentino(){		
		mon2= 1.90;
		divisa = "Peso Argentino";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void Yen_a_DolarAmericano(){		
		mon2= 0.0071;
		divisa = "Dolar Americano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void Yen_a_DolarCanadiense(){		
		mon2= 0.0093;
		divisa = "Dolar Canadiense";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void Yen_a_LibraEsterlina(){		
		mon2= 0.0055;
		divisa = "Libra Esterlina";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
}

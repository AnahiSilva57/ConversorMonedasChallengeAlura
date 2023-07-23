package Control;

import Interface.Ventanas;

public class CalculoMonedaLibraEsterlina {
	double mon2;
	String mon1 = "Libra esterlina";
	String divisa;	
	Ventanas ventanas = new Ventanas();
	
	public void LibraEsterlina_a_PesoMexicano(){		
		mon2= 21.84;
		divisa = "Peso mexicano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void LibraEsterlina_a_PesoChileno(){		
		mon2= 1049.67;
		divisa = "Peso chileno";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void LibraEsterlina_a_PesoArgentino(){		
		mon2= 346.14;
		divisa = "Peso argentino";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void LibraEsterlina_a_DolarAmericano(){		
		mon2= 1.29;
		divisa = "Dolar americano";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void LibraEsterlina_a_DolarCanadiense(){		
		mon2= 1.70;
		divisa = "Dolar Canadiense";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}
	public void LibraEsterlina_a_Yen(){		
		mon2= 182.27;
		divisa = "Yen";
		ventanas.VentanasCalculo(mon2,divisa,mon1);		
	}	
}

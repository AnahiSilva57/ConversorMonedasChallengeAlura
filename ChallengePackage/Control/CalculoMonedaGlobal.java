package Control;

import javax.swing.JOptionPane;

public class CalculoMonedaGlobal {
	
	public void seleccionarConversion(String monUsuIng, String monDivIng){
		
		if (monUsuIng == monDivIng) {
			JOptionPane.showMessageDialog(null,"Seleccina una moneda diferente, no puede ser la misma Un_n");
		}
		
		if (monUsuIng == "Peso mexicano") {			
			CalculoMonedaPesoMexicano calmonpesmex = new CalculoMonedaPesoMexicano();			
			if (monDivIng == "Peso chileno") {
				calmonpesmex.PesoMexicano_a_PesoChileno();			
			}
			if (monDivIng == "Peso argentino") {
				calmonpesmex.PesoMexicano_a_PesoArgentino();
			}
			if (monDivIng == "Dolar americano") {
				calmonpesmex.PesoMexicano_a_dolarAmericano();
			}
			if (monDivIng == "Dolar canadiense") {
				calmonpesmex.PesoMexicano_a_dolarCanadiense();
			}
			if (monDivIng == "Libra esterlina") {
				calmonpesmex.PesoMexicano_a_libraEsterlina();
			}
			if (monDivIng == "Yen") {
				calmonpesmex.PesoMexicano_a_Yen();
			}
		}		
		
		if (monUsuIng == "Peso chileno") {	
			CalculoMonedaPesoChileno calmonpeschil = new CalculoMonedaPesoChileno();
			if (monDivIng == "Peso mexicano") {
				calmonpeschil.PesoChileno_a_PesoMexicano();
			}
			if (monDivIng == "Peso argentino") {
				calmonpeschil.PesoChileno_a_PesoArgentino();
			}
			if (monDivIng == "Dolar americano") {
				calmonpeschil.PesoChileno_a_DolarAmericano();
			}
			if (monDivIng == "Dolar canadiense") {
				calmonpeschil.PesoChileno_a_DolarCanadiense();
			}
			if (monDivIng == "Libra esterlina") {
				calmonpeschil.PesoChileno_a_LibraEsterlina();
			}
			if (monDivIng == "Yen") {
				calmonpeschil.PesoChileno_a_Yen();
			}
		}
		
		if (monUsuIng == "Peso argentino") {	
			CalculoMonedaPesoArgentino calmonpesarg = new CalculoMonedaPesoArgentino();
			if (monDivIng == "Peso mexicano") {
				calmonpesarg.PesoArgentino_a_PesoMexicano();
			}
			if (monDivIng == "Peso chileno") {
				calmonpesarg.PesoArgentino_a_PesoChileno();
			}
			if (monDivIng == "Dolar americano") {
				calmonpesarg.PesoArgentino_a_DolarAmericano();
			}
			if (monDivIng == "Dolar canadiense") {
				calmonpesarg.PesoArgentino_a_DolarCanadiense();
			}
			if (monDivIng == "Libra esterlina") {
				calmonpesarg.PesoArgentino_a_LibraEsterlina();
			}
			if (monDivIng == "Yen") {
				calmonpesarg.PesoArgentino_a_Yen();
			}
		}
		
		if (monUsuIng == "Dolar americano") {	
			CalculoMonedaDolarAmericano calmondolame = new CalculoMonedaDolarAmericano();
			if (monDivIng == "Peso mexicano") {
				calmondolame.DolarAmericano_a_PesoMexicano();
			}
			if (monDivIng == "Peso chileno") {
				calmondolame.DolarAmericano_a_PesoChileno();
			}
			if (monDivIng == "Peso argentino") {
				calmondolame.DolarAmericano_a_PesoArgentino();
			}
			if (monDivIng == "Dolar canadiense") {
				calmondolame.DolarAmericano_a_DolarCanadiense();
			}
			if (monDivIng == "Libra esterlina") {
				calmondolame.DolarAmericano_a_LibraEsterlina();
			}
			if (monDivIng == "Yen") {
				calmondolame.DolarAmericano_a_Yen();
			}
		}
		
		if (monUsuIng == "Dolar canadiense") {	
			CalculoMonedaDolarCanadiense calmondolcanad = new CalculoMonedaDolarCanadiense();
			if (monDivIng == "Peso mexicano") {
				calmondolcanad.DolarCanadiense_a_PesoMexicano();
			}
			if (monDivIng == "Peso chileno") {
				calmondolcanad.DolarCanadiense_a_PesoChileno();
			}
			if (monDivIng == "Peso argentino") {
				calmondolcanad.DolarCanadiense_a_PesoArgentino();
			}
			if (monDivIng == "Dolar americano") {
				calmondolcanad.DolarCanadiense_a_DolarAmericano();
			}
			if (monDivIng == "Libra esterlina") {
				calmondolcanad.DolarCanadiense_a_LibraEsterlina();
			}
			if (monDivIng == "Yen") {
				calmondolcanad.DolarCanadiense_a_Yen();
			}
		}
		
		if (monUsuIng == "Libra esterlina") {	
			CalculoMonedaLibraEsterlina calmonlibest = new CalculoMonedaLibraEsterlina();
			if (monDivIng == "Peso mexicano") {
				calmonlibest.LibraEsterlina_a_PesoMexicano();
			}
			if (monDivIng == "Peso chileno") {
				calmonlibest.LibraEsterlina_a_PesoChileno();
			}
			if (monDivIng == "Peso argentino") {
				calmonlibest.LibraEsterlina_a_PesoArgentino();
			}
			if (monDivIng == "Dolar americano") {
				calmonlibest.LibraEsterlina_a_DolarAmericano();
			}
			if (monDivIng == "Dolar canadiense") {
				calmonlibest.LibraEsterlina_a_DolarCanadiense();
			}
			if (monDivIng == "Yen") {
				calmonlibest.LibraEsterlina_a_Yen();
			}			
		}
		
		if (monUsuIng == "Yen") {	
			ControlMonedaYen conmonyen = new ControlMonedaYen();
			if (monDivIng == "Peso mexicano") {
				conmonyen.Yen_a_PesoMexicano();
			}
			if (monDivIng == "Peso chileno") {
				conmonyen.Yen_a_PesoChileno();
			}
			if (monDivIng == "Peso argentino") {
				conmonyen.Yen_a_PesoArgentino();
			}
			if (monDivIng == "Dolar americano") {
				conmonyen.Yen_a_DolarAmericano();
			}
			if (monDivIng == "Dolar canadiense") {
				conmonyen.Yen_a_DolarCanadiense();
			}
			if (monDivIng == "Libra esterlina") {
				conmonyen.Yen_a_LibraEsterlina();
			}
		}
		
	}
}

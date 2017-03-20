package test;

import gestione.GestioneMeteo;
import model.Giorno;
import model.RilevazioneMeteorologica;

public class MainWeather {

	public static void main(String[] args) {
	
		RilevazioneMeteorologica rm = new RilevazioneMeteorologica();
		GestioneMeteo gm = new GestioneMeteo();
		
		gm.aggiungiGiorni(rm);
			
		System.out.println("Giorno - Max / Min ");
		
		for (Giorno g : rm.getGiorni()){
			
			System.out.println(g.getGiorno() + "  -  " + g.getTempMassima() + " / " + g.getTempMinima());
			
		}
		
		
		System.out.println("\nIl giorno con la minor escursione termica è: " + gm.getMinEscursioneTermica(rm));	
		
	}
	
}


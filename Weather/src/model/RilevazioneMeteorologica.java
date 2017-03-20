package model;

import java.util.ArrayList;
import java.util.List;

import eccezioni.GiornoEsistente;
import eccezioni.GiornoNonValido;

public class RilevazioneMeteorologica {

	private List<Giorno> giorni = new ArrayList<>();

	
	public Giorno addGiorno(int giorno, int tempMinima, int tempMassima) throws GiornoEsistente, GiornoNonValido {
		
		Giorno g = new Giorno(giorno, tempMassima, tempMinima);
		
		/// se il giorno che indichiamo � gi� presente nella lista, il programma ci ritorner� un errore
		for (Giorno gg : giorni){
			if (gg.getGiorno() == giorno){
				throw new GiornoEsistente("Il giorno gi� esiste!");
			}
		}
		
		giorni.add(g);
		
		return g;
		
	}
	
	
	public List<Giorno> getGiorni() {
		return giorni;
	}

	
	
}

package gestione;

import java.util.Collections;
import java.util.List;

import comparator.WeatherComparator;
import eccezioni.GiornoEsistente;
import eccezioni.GiornoNonValido;
import model.Giorno;
import model.RilevazioneMeteorologica;

public class GestioneMeteo {
	
	
	/// qui aggiungo tutti i giorni alla lista dei giorni presente nella classe RilevazioneMeteorologiche
	
	public void aggiungiGiorni(RilevazioneMeteorologica rm){
		
		try {
			
			rm.addGiorno(1, 59, 88);
			rm.addGiorno(2, 63, 79);
			rm.addGiorno(3, 55, 77);
			rm.addGiorno(4, 59, 77);
			rm.addGiorno(5, 66, 90);
			rm.addGiorno(6, 61, 81);
			rm.addGiorno(7, 57, 73);
			rm.addGiorno(8, 54, 75);
			rm.addGiorno(9, 32, 86);		
			rm.addGiorno(10, 64, 84);
			rm.addGiorno(11, 59, 91);		
			rm.addGiorno(12, 73, 88);
			rm.addGiorno(13, 59, 70);
			rm.addGiorno(14, 59, 61);		
			rm.addGiorno(15, 55, 64);
			rm.addGiorno(16, 59, 79);
			rm.addGiorno(17, 57, 81);
			rm.addGiorno(18, 52, 82);
			rm.addGiorno(19, 61, 81);
			rm.addGiorno(20, 57, 84);
			rm.addGiorno(21, 59, 86);
			rm.addGiorno(22, 64, 90);		
			rm.addGiorno(23, 68, 90);
			rm.addGiorno(24, 77, 90);
			rm.addGiorno(25, 72, 90);		
			rm.addGiorno(26, 64, 97);
			rm.addGiorno(27, 72, 91);
			rm.addGiorno(28, 68, 84);
			rm.addGiorno(29, 66, 88);
			rm.addGiorno(30, 45, 90);
			
		} catch (GiornoEsistente | GiornoNonValido e) {
			e.printStackTrace();
		}		
		
	}

	
	//	tale metodo ci ritorna il giorno con l'escursione termica più bassa. Richiamiamo la classe WeatherComparator,
	//	all'interno della quale abbiamo confrontato le diverse escursioni termiche
	
	public Giorno getMinEscursioneTermica(RilevazioneMeteorologica rm){
		
		List<Giorno> giorni = rm.getGiorni();
		Collections.sort(giorni, new WeatherComparator());
		
		Giorno g = giorni.get(0);
		
		return g;
		
	}
}

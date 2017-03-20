package comparator;

import java.util.Comparator;

import model.Giorno;

public class WeatherComparator implements Comparator<Giorno>{

	/* confrontiamo l'escursione termica tra i vari giorni, e se questa è uguale tra due giorni, verrà presa in considerazione l'escursione
	   termica con la temperatura massima maggiore
	 */
	
	@Override
	public int compare(Giorno g1, Giorno g2) {
		
		int escursioneTermica = g1.getEscursioneTermica() - g2.getEscursioneTermica();
		int tempMassima = -1;
		
		if (escursioneTermica == 0) {
			
			tempMassima = g2.getTempMassima() - g1.getTempMassima();
			
			return tempMassima;
		
		}
		
		return escursioneTermica;
		
	}

	
	
}

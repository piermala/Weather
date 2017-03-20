package model;

import eccezioni.GiornoNonValido;

public class Giorno {

	private int giorno;
	private int tempMassima;
	private int tempMinima;
	private int escursioneTermica;
	
	
	/// COSTRUTTORI
	
	public Giorno(int giorno, int tempMassima, int tempMinima) throws GiornoNonValido {

		if (giorno < 1 || giorno > 30) {
			throw new GiornoNonValido("Il giorno non è valido!");
		}

		this.giorno = giorno;
		this.tempMassima = tempMassima;
		this.tempMinima = tempMinima;
	}

	
	public Giorno() {}
		
	
	
	/// GETTERS AND SETTERS
	
	public int getGiorno() {
		return giorno;
	}
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}
	public int getTempMassima() {
		return tempMassima;
	}
	public void setTempMassima(int tempMassima) {
		this.tempMassima = tempMassima;
	}
	public int getTempMinima() {
		return tempMinima;
	}
	public void setTempMinima(int tempMinima) {
		this.tempMinima = tempMinima;
	}	
	public int getEscursioneTermica(){
		this.escursioneTermica = this.tempMassima - this.tempMinima;
		return this.escursioneTermica;
	}
	
	
	
	/// ALTRI METODI
	
	public boolean isValid(){
		
		if (this.giorno != 0 && this.tempMassima != 0 && this.tempMinima != 0){
			return true;
		}
		
		return false;
	}
	
	
	/// TO STRING
	
	@Override
	public String toString() {
		return "Giorno " + giorno + ", Temperatura Massima = " + tempMassima
				+ ", Temperatura Minima = " + tempMinima + ", Escursione Termica = "
				+ escursioneTermica;
	}
	
}

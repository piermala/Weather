package test;

import static org.junit.Assert.*;

import java.util.List;

import model.Giorno;
import model.RilevazioneMeteorologica;

import org.junit.BeforeClass;
import org.junit.Test;

import eccezioni.GiornoEsistente;
import eccezioni.GiornoNonValido;
import gestione.GestioneMeteo;

public class TestWeather {
	
	static RilevazioneMeteorologica rm;
	static GestioneMeteo g;

	@BeforeClass
	public static void initialize(){
		rm = new RilevazioneMeteorologica();
		g = new GestioneMeteo();
	}
	
	
	/// qui testo se l'istanza della classe RilevazioneMeteorologica sia diversa da 'null'
	
	@Test
	public void testPrimaIstanza() {
		assertNotNull(rm);
	}	
	
	
	/// qui testo se l'istanza della classe GestioneMeteo sia diversa da 'null'
	
	@Test
	public void testSecondaIstanza() {
		assertNotNull(g);
	}	
	
	
	/// qui creo le istanze della classe Giorno, le aggiungo alla lista deli giorni e testo se i dati inseriti per ogni giorno sono validi
	
	@Test
	public void testAggiungiDati() throws GiornoEsistente, GiornoNonValido{
		
		Giorno g1 = rm.addGiorno(1, 59, 88);
		Giorno g2 = rm.addGiorno(2, 63, 79);		
		
		assertTrue(g1.isValid() &&
				   g2.isValid());
		
	}
	
	/// qui testo se i giorni sono stati inseriti nella lista, ed in tal caso le dimensioni della stessa devono essere uguali al numero da noi indicato
	
	@Test
	public void testListaGiorni() throws GiornoEsistente, GiornoNonValido {
		
		rm.addGiorno(4, 59, 77);
		rm.addGiorno(5, 66, 90);
		rm.addGiorno(6, 61, 81);
		
		List<Giorno> giorni = rm.getGiorni();
		
		assertEquals(giorni.size(), 3);
		
	}
	
	
	/// qui testo se l'oggetto ritornato da tale metodo sia diverso da 'null' 
	
	@Test
	public void testMinEscTerm(){
		
		Giorno giorno = g.getMinEscursioneTermica(rm);
		
		assertNotNull(giorno);
		
	}
	
	
	
	

}

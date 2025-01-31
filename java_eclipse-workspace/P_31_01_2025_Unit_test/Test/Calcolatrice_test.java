import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//abbiamo creato una nuova cartella JUnit dove mettiamo tutti i test da utilizzare 

class Calcolatrice_test {
	
	@Test
	void test_somma() {
		assertEquals(5, Calcolatrice.somma(2, 3));
		// 3 è il risultato atteso e Calcolatrice.somma() è il metodo che chiamiamo per il test 
	}
	
	@Test
	void test_sottrazione() {
		assertEquals(5, Calcolatrice.sottrazione(10, 5));
		// 5 è il risultato atteso e Calcolatrice.sottrazione() è il metodo che chiamiamo per il test 
	}
	
	@Test
	void test_moltiplicazione() {
		assertEquals(8, Calcolatrice.moltiplicazione(4, 2));
		// 8 è il risultato atteso e Calcolatrice.moltiplicazione() è il metodo che chiamiamo per il test 
	}
	
	@Test
	void test_divisione() {
		assertEquals(2, Calcolatrice.divisione(10, 5));
		// 2 è il risultato atteso e Calcolatrice.divisione() è il metodo che chiamiamo per il test 
	}
}

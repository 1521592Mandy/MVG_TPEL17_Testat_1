package de.hs.mannheim.tpe.KlassenTest;
import static org.junit.Assert.*;

import org.junit.Test;

import de.hs.mannheim.tpe.Klassen.Konto;

public class KontoTest {

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode Equals
	 */
	@Test
	public void testKonto() {
		Konto test = new Konto("Test", "Euro");
		Konto test1 = new Konto("Test", "Euro");
		assertEquals(true, test.equals(test1));
	}

	/**
	 * @author Mandy Schmitt, 1521592 Test auf Gleicheit des Kontoinhabers.
	 */
	@Test
	public void testGetInhaber() {
		Konto test = new Konto("Test", "Euro");
		assertEquals("Test", "Test", test.getInhaber());
	}

	/**
	 * @author Mandy Schmitt, 1521592 Test auf Gleichheit der Währung.
	 */
	@Test
	public void testGetWaehrung() {
		Konto test = new Konto("Test", "Euro");
		assertEquals("Euro", test.getWaehrung());
	}

	/**
	 * @author Mandy Schmitt, 1521592 Teste der Methode buche(), ob ein Wert
	 *         angelegt wird. Wird mit der Methode gesamt() ausgegeben, da
	 *         buche() void als Rückgabewert hat.
	 */
	@Test
	public void testBuche() {
		Konto test = new Konto("Test", "Euro");
		test.buche(5.00);
		assertEquals(5.00, test.saldo(), 0.001);
	}

	/**
	 * @author Mandy Schmitt, 1521592 Test der gesamt() Methode. Diese Methode
	 *         gibt die Summe der double-Werte in der ArrrayList wieder.
	 */
	@Test
	public void testSaldo() {
		Konto test = new Konto("Test Testington", "Dollar");
		test.buche(99.01);
		test.buche(0.89);
		assertEquals(99.9, test.saldo(), 0);
	}

	@Test
	public void testSaldo2() {
		Konto test = new Konto("Test Testington", "Yen");
		test.buche(99.99);
		test.buche(-0.99);
		assertEquals(99.00, test.saldo(), 0);
	}

	@Test
	public void testSaldo3() {
		Konto test = new Konto("Test Testington", "Rubel");
		test.buche(-100.50);
		test.buche(-1000);
		assertEquals(-1100.50, test.saldo(), 0);
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 */
	@Test
	public void testGebuehr() {
		Konto test = new Konto("Test Testington", "Yen");
		test.buche(10);
		assertEquals(0.2, test.gebuehr(), 0);
	}

	/**
	 * @author Mandy Schmitt, 1521592 Test der toString() Methode. Wird manuell
	 *         auf der Konsole ausgegeben.
	 */
	@Test
	public void testToString() {

	}

}
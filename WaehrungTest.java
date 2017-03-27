package de.hs.mannheim.tpe.KlassenTest;
import static org.junit.Assert.*;

import org.junit.Test;

import de.hs.mannheim.tpe.Klassen.Waehrung;
import de.hs.mannheim.tpe.Klassen.Waehrungen;

public class WaehrungTest extends Waehrungen {

	// TEST DER METHODE UMRECHNEN()

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode umrechnen() von Euro in
	 *         Dollar
	 */

	@Test
	public void testUmrechnen0() {
		Waehrung test = new Waehrung("Euro", EURO, 1.2690);
		assertEquals(12, test.umrechnen(10L, "Euro"));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode umrechnen() von Dollar in
	 *         Dollar
	 */
	@Test
	public void testUmrechnen1() {
		Waehrung test = new Waehrung("Dollar", DOLLAR, 1.00);
		assertEquals(10, test.umrechnen(10L, "Dollar"));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode umrechnen() von Yen in
	 *         Dollar
	 */
	@Test
	public void testUmrechnen2() {
		Waehrung test = new Waehrung("Yen", YEN, 0.0091);
		assertEquals(0, test.umrechnen(10, "Yen"));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode umrechnen() von Rubel in
	 *         Dollar
	 */
	@Test
	public void testUmrechnen3() {
		Waehrung test = new Waehrung("Rubel", RUBEL, 0.0255);
		assertEquals(0, test.umrechnen(10, "Rubel"));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode umrechnen() von Schweizer
	 *         Franken in Dollar
	 */
	@Test
	public void testUmrechnen4() {
		Waehrung test = new Waehrung("Schweizer Franken", SCHWEIZER_FRANKEN, 1.0509);
		assertEquals(10, test.umrechnen(10, "Schweizer Franken"));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode umrechnen() von Dollar in
	 *         Dollar
	 */
	@Test
	public void testUmrechnen5() {
		Waehrung test = new Waehrung("Dollar", DOLLAR, 1.00);
		assertEquals(10, test.umrechnen(10, "Dollar"));
	}

	// TEST DER METHODE EQUALS

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode equals() von 2 gleichen
	 *         Objekten
	 */
	@Test
	public void testequals0() {
		Waehrung test1 = new Waehrung("Euro", EURO, 1.2690);
		Waehrung test2 = new Waehrung("Euro", EURO, 1.2690);
		assertEquals(true, test1.equals(test2));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode equals() mit 2 ungleichen
	 *         Objekten
	 */
	@Test
	public void testequals1() {
		Waehrung test1 = new Waehrung("Euro", EURO, 1.2690);
		Waehrung test2 = new Waehrung("Dollar", DOLLAR, 1.00);
		assertEquals(false, test1.equals(test2));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode equals() mit 2
	 *         unterschiedlichen Kuerzeln
	 */
	@Test
	public void testequals2() {
		Waehrung test1 = new Waehrung("Euro", EURO, 1.2690);
		Waehrung test2 = new Waehrung("Euro", DOLLAR, 1.2690);
		assertEquals(false, test1.equals(test2));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode equals() mit 2
	 *         unterschiedlichen Namen
	 */
	@Test
	public void testequals3() {
		Waehrung test1 = new Waehrung("Euro", EURO, 1.2690);
		Waehrung test2 = new Waehrung("Dollar", EURO, 1.2690);
		assertEquals(false, test1.equals(test2));
	}

	// TEST DER METHODE GETNAME()

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getName()
	 */

	@Test
	public void testGetName() {
		Waehrung test1 = new Waehrung("Euro", EURO, 1.2690);
		assertEquals("Euro", test1.getName());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getKurzel()
	 */

	@Test
	public void testGetKuerzel() {
		Waehrung test1 = new Waehrung("Euro", EURO, 1.2690);
		assertEquals(EURO, test1.getKuerzel());
	}

	@Test
	public void testGetKurs() {
		Waehrung test1 = new Waehrung("Euro", EURO, 1.2690);
		assertEquals(1.2690, test1.getKurs(), 0.00001);
	}

}
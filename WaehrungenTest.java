package de.hs.mannheim.tpe.KlassenTest;
import static org.junit.Assert.*;

import org.junit.Test;

import de.hs.mannheim.tpe.Klassen.Waehrungen;

public class WaehrungenTest {

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der umrechnenZielwaehrung() von
	 *         Dollar in Euro
	 */
	@Test
	public void umrechnenZielwaehrungTest0() {
		assertEquals(78, Waehrungen.umrechnenZielwaehrung(100, "Euro"));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der umrechnenZielwaehrung() von
	 *         Dollar in Rubel
	 */
	@Test
	public void umrechnenZielwaehrungTest1() {
		assertEquals(3921, Waehrungen.umrechnenZielwaehrung(100, "Rubel"));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der umrechnenZielwaehrung() von
	 *         Dollar in Yen
	 */
	@Test
	public void umrechnenZielwaehrungTest2() {
		assertEquals(10989, Waehrungen.umrechnenZielwaehrung(100, "Yen"));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der umrechnenZielwaehrung() von
	 *         Dollar in Schweizer Franken
	 */
	@Test
	public void umrechnenZielwaehrungTest3() {
		assertEquals(95, Waehrungen.umrechnenZielwaehrung(100, "Schweizer Franken"));
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der umrechnenZielwaehrung() von
	 *         Dollar in Dollar
	 */
	@Test
	public void umrechnenZielwaehrungTest4() {
		assertEquals(100, Waehrungen.umrechnenZielwaehrung(100, "Dollar"));
	}
}
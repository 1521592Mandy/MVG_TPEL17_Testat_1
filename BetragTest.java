package de.hs.mannheim.tpe.KlassenTest;
import static org.junit.Assert.*;

import org.junit.Test;

import de.hs.mannheim.tpe.Klassen.Betrag;

public class BetragTest {

	/**
	 * Verschiede Tests auf die Funktion getVorzeichen()
	 * 
	 * @author ${Patrick Hentschel 1524045}
	 * @return wird auf seine Funktion getestet bei der Übergabe eines
	 *         long-Wertes, erwartet wird 1 als Rückgabe
	 */
	@Test
	public void testGetVorzeichen0() {
		Betrag m = new Betrag(213314L, "Euro");
		assertEquals(1, m.getVorzeichen());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @return wird auf seine Funktion getestet bei der Übergabe eines
	 *         double-Wertes für den Betrag, erwartet 1 als Rückgabe
	 */
	@Test
	public void testGetVorzeichen1() {
		Betrag double1 = new Betrag(213.13667, "Euro");
		assertEquals(1, double1.getVorzeichen());
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @return prüft Ausgabe mit 0 double-Parameter
	 */

	@Test
	public void testGetVorzeichen2() {
		Betrag nullBetrag = new Betrag(0.0, "Euro");
		assertEquals(1, nullBetrag.getVorzeichen());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @return prüft Ausgabe auf -1 mit double-Parameter
	 */
	@Test
	public void testGetVorzeichen3() {
		Betrag neg = new Betrag(-31214.34, "Euro");
		assertEquals(-1, neg.getVorzeichen());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @return prüft Ausgabe auf -1 mit long-Parameter
	 */
	@Test
	public void testGetVorzeichen4() {
		Betrag neglong = new Betrag(-1232141L, "Euro");
		assertEquals(-1, neglong.getVorzeichen());
	}

	// TESTS DER METHODE ADDIEREN()

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test mittels zweier Double-Werten bei der
	 *         Addition
	 */
	@Test
	public void testAddieren0() {
		Betrag addieren = new Betrag(15.0, "Euro");
		Betrag b = new Betrag(5.0, "Euro");
		assertEquals(20.0, addieren.addieren(b), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test mittels zweier Long-Werten bei der
	 *         Addition
	 */
	@Test
	public void testAddieren1() {
		Betrag addieren = new Betrag(15L, "Euro");
		Betrag b = new Betrag(5L, "Euro");
		assertEquals(20L, addieren.addieren(b), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test mittels zweier Long-Werten wobei
	 *         einer negativ ist
	 */
	@Test
	public void testAddieren2() {
		Betrag addieren = new Betrag(-15L, "Euro");
		Betrag b = new Betrag(5L, "Euro");
		assertEquals(-10L, addieren.addieren(b), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test mittels eines Long-Wertes und eines
	 *         Double-Wertes und unterschiedlicher Währungen
	 */
	@Test
	public void testAddieren3() {
		Betrag addieren = new Betrag(-10L, "Euro");
		Betrag b = new Betrag(10.00, "Dollar");
		assertEquals(0.00, addieren.addieren(b), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test einer positiven Addition mit Long und
	 *         Double Werten
	 */
	@Test
	public void testAddieren4() {
		Betrag add = new Betrag(15L, "Euro");
		Betrag b = new Betrag(5.00, "Euro");
		assertEquals(20.00, add.addieren(b), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Addition mit 0
	 */
	@Test
	public void testAddieren5() {
		Betrag add = new Betrag(0L, "Euro");
		Betrag b = new Betrag(15.00, "Euro");
		assertEquals(15, add.addieren(b), 0.001);
	}

	@Test
	public void testAddieren6() {
		Betrag add = new Betrag(0, "Euro");
		Betrag b = new Betrag(0, "Euro");
		assertEquals(0, add.addieren(b), 0.001);
	}
	// TEST DER METHODE SUBTRAHIEREN()

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode subtrahiere() mit einem
	 *         negativem und einem positivem Wert
	 */
	@Test
	public void testSubtrahiere0() {
		Betrag sub = new Betrag(100.0, "Euro");
		Betrag b = new Betrag(-98.0, "Euro");
		assertEquals(2, sub.addieren(b), 0.001);
	}

	/**
	 * @author Mandy Schmitt, 1521592 Test der Methode subtrahiere() mit nur 2
	 *         negativen Zahlen
	 */
	@Test
	public void testSubtrahiere1() {
		Betrag a = new Betrag(-5.0, "Euro");
		Betrag b = new Betrag(-5.0, "Euro");
		assertEquals(0.0, a.subtrahiere(b), 0.001);
	}

	/**
	 * @author Mandy Schmitt, 1521592 Test der Methode subtrahiere() mit 2
	 *         Zahlen mit Wert 0
	 */

	@Test
	public void testSubtrahiere2() {
		Betrag sub = new Betrag(2.0, "Euro");
		Betrag b = new Betrag(0.0, "Euro");
		assertEquals(2, sub.subtrahiere(b), 0.001);
	}

	/**
	 * @author Mandy Schmitt, 1521592 Test der Methode subtrahiere() mit
	 *         negativem Ergebnis
	 */

	@Test
	public void testSubtrahiere3() {
		Betrag sub = new Betrag(1.0, "Euro");
		Betrag b = new Betrag(10.00, "Euro");
		assertEquals(-9, sub.subtrahiere(b), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @testSubtrahiere4() VorzeichenTest
	 */

	@Test
	public void testSubtrahiere4() {
		Betrag sub = new Betrag(0.0, "Euro");
		Betrag b = new Betrag(-100000.00, "Euro");
		assertEquals(100000.0, sub.subtrahiere(b), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @testSubtrahiere5() Subtraktion von 0
	 */
	@Test
	public void testSubtrahiere5() {
		Betrag sub = new Betrag(0.0, "Euro");
		Betrag b = new Betrag(20.00, "Euro");
		assertEquals(-20, sub.subtrahiere(b), 0.001);
	}
	// TEST DER METHODE MULTIPLIZIERE()

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Multiplikation von 1 mal eines Wertes
	 */
	@Test
	public void testMultipliziere0() {
		Betrag eins = new Betrag(1.0, "Euro");
		assertEquals(10, eins.multipliziere(10.0), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Multiplikation mit einem Double-Wert
	 */
	@Test
	public void testMultipliziere1() {
		Betrag a = new Betrag(1.0, "Euro");
		assertEquals(15.50, a.multipliziere(15.50), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Multiplikation mit 0
	 */

	@Test
	public void testMultiplizere2() {
		Betrag a = new Betrag(1.0, "Euro");
		assertEquals(0.0, a.multipliziere(0), 0.001);
	}

	/**
	 * @author Mandy Schmitt, 1521592 Multiplikation mit 0 im Objekt Betrag
	 */

	@Test
	public void testMultipliziere3() {
		Betrag a = new Betrag(0, "Euro");
		assertEquals(0, a.multipliziere(15.98), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test mit Multiplikation zweier negativer
	 *         Zahlen
	 */

	@Test
	public void testMultipliziere4() {
		Betrag a = new Betrag(-15.0, "Euro");
		assertEquals(15, a.multipliziere(-1.0), 0.001);
	}

	@Test
	public void testMultipliziere5() {
		Betrag a = new Betrag(-20, "Euro");
		assertEquals(-40, a.multipliziere(2.0), 0.001);
	}
	// TEST DER METHODE GETWAEHRUNG

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getWaehrung mit "Euro"
	 *         als erwartetes Ergebnis
	 */
	@Test
	public void testGetWaehrung0() {
		Betrag a = new Betrag(0, "Euro");
		assertEquals("Euro", a.getWaehrung());
	}

	/**
	 * @author Mandy Schmitt, 1521592 Test der Methode getWaehrung mit "Yen" als
	 *         erwartetes Ergebnis
	 */

	@Test
	public void testGetWaehrung1() {
		Betrag a = new Betrag(15, "Yen");
		assertEquals("Yen", a.getWaehrung());
	}

	// TEST DER METHODE GETVORKOMMA()

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getVorkomma mit 1 als
	 *         erwartetes Ergebnis
	 */
	@Test
	public void testGetVorkomma0() {
		Betrag a = new Betrag(1.5, "Euro");
		assertEquals(1, a.getVorkomma());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getVorkomma mit -2 als
	 *         erwartetes Ergebnis
	 */
	@Test
	public void testGetVorkomma1() {
		Betrag a = new Betrag(-2.05, "Euro");
		assertEquals(2, a.getVorkomma());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getVorkomma mit 0 als
	 *         erwartetes Ergebnis
	 */
	@Test
	public void testGetVorkomma2() {
		Betrag a = new Betrag(0.5, "Yen");
		assertEquals(0, a.getVorkomma());
	}

	// TEST DER METHODE GETNACHKOMMA()

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getNachkomma ohne
	 *         Nachkommastellen
	 */
	@Test
	public void testGetNachkomma0() {
		Betrag a = new Betrag(0.00, "Euro");
		assertEquals(0, a.getNachkomma());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getNachkomma mit
	 *         negativer Zahl soll aber positive Nachkommastelle ausgeben
	 */
	@Test
	public void getNachkomma1() {
		Betrag a = new Betrag(-23.55, "Dollar");
		assertEquals(55, a.getNachkomma());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getNachkomma auf die
	 *         letzte Nachkommastelle
	 */
	@Test
	public void getNachkomma2() {
		Betrag a = new Betrag(22.01, "Dollar");
		assertEquals(1, a.getNachkomma());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getNachkomma soll nur auf
	 *         2 Nachkommastellen genau einen Wert ausgeben
	 */
	@Test
	public void getNachkomma3() {
		Betrag a = new Betrag(22.002, "Dollar");
		assertEquals(0, a.getNachkomma());
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getNachkomma mit
	 *         negativem Wert und beruecksichtigung von 2 Nachkommastellen
	 */
	@Test
	public void getNachkomma4() {
		Betrag a = new Betrag(-22.0099, "Dollar");
		assertEquals(0, a.getNachkomma());
	}

	// TEST DER METHODE GETASDOUBLE()
	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getAsDouble mit einer
	 *         einfachen positiven Zahl
	 */
	@Test
	public void getAsDouble0() {
		Betrag a = new Betrag(1550, "Dollar");
		assertEquals(1550.0, a.getAsDouble(), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getAsDouble mit einer
	 *         Double-Zahl
	 */
	@Test
	public void getAsDouble1() {
		Betrag a = new Betrag(15.55, "Euro");
		assertEquals(15.55, a.getAsDouble(), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getAsDouble mit einer
	 *         negativen Long Zahl
	 */
	@Test
	public void getAsDouble2() {
		Betrag a = new Betrag(-12L, "Euro");
		assertEquals(-12.00, a.getAsDouble(), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode mit einer negativen
	 *         double-Zahl
	 */
	@Test
	public void getAsDouble3() {
		Betrag a = new Betrag(-13.05, "Yen");
		assertEquals(-13.05, a.getAsDouble(), 0.001);
	}

	// TEST DER METHODE GETBETRAG()

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getBetrag mit einem
	 *         Double-Wert
	 */
	@Test
	public void testGetBetrag0() {
		Betrag a = new Betrag(125.00, "Euro");
		assertEquals(125.00, a.getBetrag(), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getBetrag mit einem
	 *         Long-Wert
	 */
	@Test
	public void testGetBetrag1() {
		Betrag a = new Betrag(125L, "Yen");
		assertEquals(125.0, a.getBetrag(), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getBetrag mit einem
	 *         negativem Double-Wert
	 */
	@Test
	public void testGetBetrag2() {
		Betrag a = new Betrag(-12.55, "Euro");
		assertEquals(-12.55, a.getBetrag(), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getBetrag mit einem
	 *         negativem Long-Wert
	 */
	@Test
	public void testGetBetrag3() {
		Betrag a = new Betrag(-12L, "Euro");
		assertEquals(-12.00, a.getBetrag(), 0.001);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592 Test der Methode getBetrag mit 0 als
	 *         double-Wert
	 */
	@Test
	public void testGetBetrag4() {
		Betrag a = new Betrag(0.00, "Rubel");
		assertEquals(0.00, a.getBetrag(), 0.001);
	}
}
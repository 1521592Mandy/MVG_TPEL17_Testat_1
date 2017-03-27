package de.hs.mannheim.tpe.Klassen;
public class Betrag {

	private long betrag;
	private String waehrung;

	/**
	 * @author Mandy Schmitt, 1521592
	 * @param betrag
	 *            der Betrag wird als long Uebergabeparameter uebergeben
	 * @param waehrung
	 *            sowie die Waehrung des Betrages
	 */
	public Betrag(long betrag, String waehrung) {
		this.betrag = betrag * 100;
		this.waehrung = waehrung;
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @param betrag
	 *            der Betrag wird als double Uebergabeparameter uebergeben und
	 *            in long umgewandelt unter beruecksichtigung von 2
	 *            Nachkommastellen
	 * @param waehrung
	 *            die Waehrung des Betrages wird hier mit uebergeben
	 */
	public Betrag(double betrag, String waehrung) {
		this.betrag = (long) (betrag * 100);
		this.waehrung = waehrung;
	}

	/**
	 * @return the betrag
	 */
	public double getBetrag() {
		return (double) betrag / 100;
	}

	/**
	 * @return the waehrung
	 */
	public String getWaehrung() {
		return waehrung;
	}

	/**
	 * @author Mandy Schmitt, 1521592 getVorzeichen() prueft ob der Betrag
	 *         groesser oder kleiner Null ist und gibt dementsprechend 1 oder -1
	 *         aus
	 */

	public int getVorzeichen() {
		if (this.betrag >= 0) {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @param b
	 *            uebergibt ein Objekt und addiert den Betrag des Objektes auf
	 *            das vorhandene Objekt hinzu
	 * @return gibt den Betrag als double-Wert mit 2 Nachkommastellen aus
	 */

	public double addieren(Betrag b) {
		this.betrag = this.betrag + b.betrag;
		return ((double) this.betrag / 100);

	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @param b
	 *            uebegibt ein Objekt und subtrahiert davon den Betrag des
	 *            Objektes von dem vorhandenen Objekt
	 * @return gibt den Betrag als double-Wert mit 2 Nachkommastellen aus
	 */
	public double subtrahiere(Betrag b) {
		this.betrag = this.betrag - b.betrag;
		return ((double) this.betrag / 100);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @param b
	 *            uebergibt eine double Zahl als Parameter und multipliziert
	 *            diese mit dem vorhandenem Betrag
	 * @return gibt den multiplzierten Betrag als double-Wert mit 2
	 *         Nachkommastellen aus
	 */
	public double multipliziere(double b) {
		this.betrag = (long) (this.betrag * b);
		return ((double) this.betrag / 100);
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @param prozentZahl
	 *            -
	 * @param betrag
	 * @return gibt den Prozentwert zurueck
	 */

	public double prozent(double prozentZahl) {
		double prozent = ((betrag * prozentZahl) / 100);
		return prozent;
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @param promilleZahl
	 * @param betrag
	 * @return gibt den Promillewert zurueck
	 */

	public double promille(double promilleZahl) {
		double promille = ((betrag * promilleZahl) / 1000);
		return promille;
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @param b
	 *            uebergibt eine int Zahl als Parameter und multipliziert diese
	 *            mit dem vorhandenem Betrag
	 * @return gibt den multiplizierten Betrag als double-Wert mit 2
	 *         Nachkommastellen aus
	 */
	public double multiplziere(int b) {
		this.betrag = (long) (this.betrag * b);
		return ((double) this.betrag / 100);
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @return gibt den Wert eine ganzzahlige Zahl aus, die vor dem Komma steht
	 */
	public long getVorkomma() {
		long temp;
		temp = this.betrag / 100;
		if (temp < 0) {
			return -temp;
		}
		return temp;
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @return gibt die Nachkommastellen als integer Zahl aus zwischen 0 und 99
	 */
	public int getNachkomma() {
		double temp;
		temp = ((double) this.betrag / 100) - (this.betrag / 100);
		temp = ((double) Math.round(temp * 100)) / 100;
		temp = temp * 100;
		if (temp < 0) {
			temp = temp * (-1);
		}
		return (int) temp;
	}

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @return gibt den Betrag als Double Wert auf 2 Nachkommastellen genau aus
	 */
	public double getAsDouble() {
		double temp;
		temp = ((double) this.betrag / 100);
		temp = ((double) Math.round(this.betrag * 100) / 100);
		return temp / 100;
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @return Gibt den Wert des Betrages als String zurück.
	 */
	public String toString() {
		return (getVorzeichen() * getVorkomma()) + "," + getNachkomma() + " " + getWaehrung();
	}

}
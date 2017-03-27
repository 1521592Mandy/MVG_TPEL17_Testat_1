package de.hs.mannheim.tpe.Klassen;
public class Waehrungen {

	/**
	 * @author Mandy Schmitt, 1521592 Konstanten
	 */
	protected static final String YEN = "¥";
	protected static final String DOLLAR = "$";
	protected static final String EURO = "€";
	protected static final String SCHWEIZER_FRANKEN = "CHF";
	protected static final String RUBEL = "RUB";

	/**
	 * 
	 * @author Mandy Schmitt, 1521592
	 * @param betrag
	 *            uebergibt den Betrag als Parameter der in die Zielwaehrung
	 *            umgerechnet werden soll
	 * @param zielwaehrung
	 *            uebergibt den String als Parameter in welche Waehrung der
	 *            Betrag umgerechnet werden soll
	 * @return gibt den umgerechneten Betrag als Ergebnis zurück
	 */
	public static long umrechnenZielwaehrung(long betrag, String zielwaehrung) {
		if (zielwaehrung.equals("Euro")) {
			betrag = (long) ((long) betrag * 0.7880);
		} else if (zielwaehrung.equals("Rubel")) {
			betrag = (long) ((long) betrag * 39.2156);
		} else if (zielwaehrung.equals("Yen")) {
			betrag = (long) ((long) betrag * 109.8901);
		} else if (zielwaehrung.equals("Schweizer Franken")) {
			betrag = (long) ((long) betrag * 0.9515);
		} else if (zielwaehrung.equals("Dollar")) {
			return betrag;
		}
		return betrag;
	}

}
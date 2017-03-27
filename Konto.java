package de.hs.mannheim.tpe.Klassen;
import java.util.ArrayList;

/**
 * 
 * @author Mandy Schmitt, 1521592
 *
 */
public class Konto {

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Konto)) {
			return false;
		}
		Konto other = (Konto) obj;
		if (guthaben == null) {
			if (other.guthaben != null) {
				return false;
			}
		} else if (!guthaben.equals(other.guthaben)) {
			return false;
		}
		if (inhaber == null) {
			if (other.inhaber != null) {
				return false;
			}
		} else if (!inhaber.equals(other.inhaber)) {
			return false;
		}
		if (waehrung == null) {
			if (other.waehrung != null) {
				return false;
			}
		} else if (!waehrung.equals(other.waehrung)) {
			return false;
		}
		return true;
	}

	
	private String inhaber;
	private String waehrung;	
	private ArrayList<Double> guthaben = new ArrayList<Double>();

	/**
	 * @author Mandy Schmitt, 1521592
	 * @param inhaber
	 *            Inhaber des Kontos
	 * @param waehrung
	 *            Waehrung des Kontos
	 */
	public Konto(String inhaber, String waehrung) {
		this.inhaber = inhaber;
		this.waehrung = waehrung;
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @return Gibt den Inhaber des Kontos zurueck
	 */
	public String getInhaber() {
		return inhaber;
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @return Gibt die Waehrung des Kontos zurueck
	 */
	public String getWaehrung() {
		return waehrung;
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @param a uebergibt einen double-Wert der auf der ArrayList hinzugefuegt 
	 * 			wird
	 */
	public void buche(double a) {
		guthaben.add(a);
	}
	
	/**
	 * @author Mandy Schmitt, 1521592
	 * @return 	Gibt den abgebuchten Gebührenwert wieder.
	 * 			in dem Fall werden 2Promille vom Gesamtbetrag abgebucht.
	 */
	public double gebuehr(){
		double promille = saldo() * 0.02;				
		return promille;
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @return Gibt die Summe der gesamten Buchungen zurück.
	 */
	public double saldo() {
		double summe = 0.0;
		for (double i : guthaben) {
			summe += i;
		}
		return summe;
	}

	/**
	 * @author Mandy Schmitt, 1521592
	 * @return Gibt das gesamte Konto aus mit
	 *         Inhaber,Waehrung und Buchungen.
	 */
	public String toString() {
		return "Inhaber: " +getInhaber()+"\nWährung: "+getWaehrung()+"\n------------\n"+saldo();
	}

}
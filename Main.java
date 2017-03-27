package de.hs.mannheim.tpe.Klassen;
public class Main {

	public static void main(String[] args) {
		Betrag subtraktion = new Betrag(15.05, "Euro");
		Betrag addition = new Betrag(-11, "Dollar");
		Betrag betragtest = new Betrag (1945, "Euro");
		Waehrung test = new Waehrung("Euro","€", 1.2690);
		System.out.println(test.umrechnen(10, "Euro"));
		System.out.println(Waehrungen.umrechnenZielwaehrung(12, "Dollar"));
		System.out.println(betragtest.addieren(addition));
		System.out.println(betragtest.subtrahiere(subtraktion));
		System.out.println(addition.getVorkomma());
		System.out.println(addition.getNachkomma());
		System.out.println(addition.getAsDouble());
		System.out.println(test.toString());
	}

}
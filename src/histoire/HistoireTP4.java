package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain Prof = new Humain("Prof", "kombucha", 54);
		Prof.direBonjour();
		Prof.acheter("une boisson", 12);
		Prof.boire();
		Prof.acheter("un jeu", 2);
		Prof.acheter("Kimono", 50);
		
		Commercant Marco = new Commercant("Marco", null, 20, null);
		Marco.seFaireExtorquer();
	}
}

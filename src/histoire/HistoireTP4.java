package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain Prof = new Humain("Prof", "kombucha", 54);
		Prof.direBonjour();
		Prof.acheter("une boisson", 12);
		Prof.boire();
		Prof.acheter("un jeu", 2);
		Prof.acheter("Kimono", 50);
		
		System.out.println("\n");
		
		Commercant Marco = new Commercant("Marco", 20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoirArgent(15);
		Marco.boire();
		
		System.out.println("\n");
		
		Yakuza yaku_le_noir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku_le_noir.direBonjour();
		yaku_le_noir.extorquer(Marco);
		
		System.out.println("\n");
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(Marco);
		
		System.out.println("\n");
		
		roro.provoquer(yaku_le_noir);
	}
}

package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);

	}

	public int seFaireExtorquer() {
		int somme = getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		perdreArgent(getArgent());
		return somme;
	}

	public void recevoirArgent(int somme) {
		gagnerArgent(somme);
		parler(somme + "sous ! Je te remercie g�n�reux donateur!");
	}
}

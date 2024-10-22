package personnages;

public class Commercant extends Humain {
	String boissonpref = "the";

	public Commercant(String nom, String boissonpref, int argent, String boissonpref2) {
		super(nom, boissonpref, argent);
		boissonpref = boissonpref2;
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste...");
		perdreArgent(getArgent());
		return getArgent();
	}
	
}

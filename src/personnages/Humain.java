package personnages;

public class Humain {
	private String nom;
	private String boissonpref;
	private int argent;

	public Humain(String nom, String boissonpref, int argent) {
		this.nom = nom;
		this.boissonpref = boissonpref;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	private void parler(String texte) {
		System.out.println(texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonpref);
	}

	public void boire() {
		parler(" Mmmm, un bon verre de " + boissonpref + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " � " + prix + " sous.");
			argent -= prix;
		}

		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir " + bien + " � " + prix
					+ " sous.");
		}
	}

	private void gagnerArgent(int gain) {
		argent += gain;
	}

	private void perdreArgent(int perte) {
		argent -= perte;
	}
}

package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boissonpref, int argent, String clan) {
		super(nom, boissonpref, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public void extorquer(Commercant victime) {
		int argentVictime = victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		reputation++;
		parler("J’ai piqué les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de Warsong ?");
		parler("Je l'ai dépouillé de ses " + gain + " sous");
	}

	public int perdre() {
		int perte = getArgent();
		reputation--;
		perdreArgent(perte);
		parler("J’ai perdu mon duel et mes " + perte + "sous, snif... J'ai déshonoré le clan de Warsong.");
		return perte;
	}

	public int getReputation() {
		return reputation;
	}
}

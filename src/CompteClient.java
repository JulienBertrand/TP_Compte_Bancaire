import java.util.ArrayList;

public class CompteClient {

	private Client client;
	private double montant;
	private boolean decouvertAutorise;
	private double plafondDecouvert;
	private ArrayList<CompteClient> listeCompte;
	public CompteClient(Client client, double montant, boolean decouvertAutorise, double plafondDecouvert) {

		this.client = client;
		this.montant = montant;
		this.decouvertAutorise = decouvertAutorise;
		this.plafondDecouvert = plafondDecouvert;
	}

	public void ajoutMontant(double credit) {
		this.montant = this.montant + credit;
	}

	public void retirerMontant(double debit) {
		if (this.montant - debit >= 0) {
			this.montant = this.montant - debit;
		}

		else if (this.decouvertAutorise == false) {
			System.out.println("Vous ne pouvez pas être à découvert car nous n'avez pas de découvert autorisé");
		} else if (this.decouvertAutorise == true && this.plafondDecouvert >= debit) {
			this.montant = this.montant - (debit + this.plafondDecouvert);

		} else {
			System.out.println("Dépassement du plafond autorisé, retrait impossible");
		}

	}
	public String toString() {
		return client + " - " + this.montant + " - " + this.decouvertAutorise + " - " + this.plafondDecouvert;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public boolean isDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(boolean decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	public double getPlafondDecouvert() {
		return plafondDecouvert;
	}

	public void setPlafondDecouvert(double plafondDecouvert) {
		this.plafondDecouvert = plafondDecouvert;
	}

	public ArrayList<CompteClient> getListeCompte() {
		return listeCompte;
	}

	public void setListeCompte(ArrayList<CompteClient> listeCompte) {
		this.listeCompte = listeCompte;
	}

	// ArrayList<CompteClient> compteClient = new ArrayList<Compteclient>();

}

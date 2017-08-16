
public class CompteFactory {

	public CompteClient getCompte(Client client, double montant, boolean decouvertAutorise, double plafondDecouvert) {
		return new CompteClient(client, montant, decouvertAutorise, plafondDecouvert);

	}
}

import java.util.ArrayList;

public class ApplicationCompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("********Liste des Comptes Clients******");
//		System.out.println("  Nom - " + "  Age - " + " Solde - "+ "découvert autorisé -" + "plafond découvert");

		ArrayList<CompteClient> client = new ArrayList<CompteClient>();

		client.add(new CompteClient(new Client("Martin", 37), 250, false, 0));
		client.add(new CompteClient(new Client("Strome", 28), 1375, true, 450));
		client.add(new CompteClient(new Client("Gilbert", 59), 9750, true, 1000));
		client.add(new CompteClient(new Client("Ali", 51), 5240, true, 1000));
		client.add(new CompteClient(new Client("Macron", 40), 15500, true, 2500));
		client.add(new CompteClient(new Client("Mathias", 24), -150, true, 450));
		client.add(new CompteClient(new Client("Serendim", 29), 490, false, 0));
		client.add(new CompteClient(new Client("Goura", 71), 1550, true, 450));

		for (CompteClient nouveauClient : client) {
			System.out.println("Compte Client > " + nouveauClient);
			System.out.println("-------------------------------------------------------");
		}
		ExtractionServices nouveauService = new ExtractionServices();
		
		System.out.println("la moyenne des comptes est " + nouveauService.moyenneSoldesCollectionCompte(nouveauService.listeCompteFiltreMinMax(nouveauService.listeCompteFiltreTriSup(client, 1000), 30, 50) ));
	}

}

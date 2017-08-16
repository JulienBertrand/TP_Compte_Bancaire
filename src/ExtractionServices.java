import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExtractionServices {

	public List<CompteClient> listeCompteFiltreTriSup(List<CompteClient> listeOriginale, double montant) {

		List<CompteClient> listeCompteTriSup = new ArrayList<CompteClient>();
		for (CompteClient i : listeOriginale) {
			if (i.getMontant() >= montant) {
				listeCompteTriSup.add(i);
			}

		}
		return listeCompteTriSup;
	}

	public List<CompteClient> listeCompteFiltreMinMax(List<CompteClient> listeOriginale, int ageMin, int ageMax) {
		List<CompteClient> listeCompteAge = new ArrayList<CompteClient>();
		for (CompteClient i : listeOriginale) {
			if (i.getClient().getAge() >= ageMin && i.getClient().getAge() <= ageMax) {
				listeCompteAge.add(i);
			}
		}

		return listeCompteAge;

	}

	public double moyenneSoldesCollectionCompte(Collection<CompteClient> CollectionCompte) {
		double sommeSoldes = 0;
		for (CompteClient i : CollectionCompte) {
			sommeSoldes = sommeSoldes + i.getMontant();
		}

		return sommeSoldes / CollectionCompte.size();

	}

}
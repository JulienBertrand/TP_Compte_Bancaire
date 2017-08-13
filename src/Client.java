
public class Client {

	//private static int nextId = 0;
	//private int id;
	private String nom;
	private int age;

	public Client (String nom, int age) {
		//this.id = nextId;
		this.nom = nom;
		this.age = age;
		//nextId++;
	}
		public String toString() {
			return this.nom + " - " + this.age;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

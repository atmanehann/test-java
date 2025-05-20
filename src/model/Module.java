package model;

public class Module {
	public static void main(String[] args) {
		// Déclaration et initialisation des variables

		// System.out.println("reseau:" +);
		// System.out.println("systeme:" +);

		Module module1 = new Module("java", "tcp", "linux");
		Module module2 = new Module("python", "ip", "windows");

		System.out.println("module1:" + module1);
		System.out.println("module2:" + module2);

		// appel de la methode
		module1.affichageInfoModule();
		module2.affichageInfoModule();

	}

	public Module(String developpement, String reseau, String systeme) {
		super();
		this.developpement = developpement;
		this.reseau = reseau;
		this.systeme = systeme;
	}

	private String developpement;
	private String reseau;
	private String systeme;

	public String getDeveloppement() {
		return developpement;
	}

	public void setDeveloppement(String developpement) {
		this.developpement = developpement;
	}

	public String getReseau() {
		return reseau;
	}

	public void setReseau(String reseau) {
		this.reseau = reseau;
	}

	public String getSysteme() {
		return systeme;
	}

	public void setSysteme(String systeme) {
		this.systeme = systeme;
	}

	public void affichageInfoModule() {
		System.out.println("Informations du module:");
		System.out.println("Développement: " + this.developpement);
		System.out.println("Réseau: " + this.reseau);
		System.out.println("Système: " + this.systeme);
	}

	public String toString() {
		return "Module [developpement=" + developpement + ", reseau=" + reseau + ", systeme=" + systeme + "]";
	}
}

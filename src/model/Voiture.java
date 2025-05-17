package model;

public class Voiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREATION D'UNE NOUVELLE VOITURE A L'AIDE DU CONSTRUCTEUR
		Voiture ma_premiere_voiture = new Voiture(2025, "toyota", "yaris");
		Voiture ma_deuxieme_voiture = new Voiture(2026, "honda", "civic");
		Voiture ma_troisieme_voiture = new Voiture(2027, "range_rover", "velar");

		// affichage des voitures
//		System.out.println("infos Voiture 1:" + ma_premiere_voiture);
//		System.out.println("infos Voiture 3:" + ma_troisieme_voiture);
//		System.out.println("infos Voiture 2:" + ma_deuxieme_voiture);

		// appel de la methode
		ma_premiere_voiture.affichageinfovoiture();
		ma_deuxieme_voiture.affichageinfovoiture();
		ma_troisieme_voiture.affichageinfovoiture();

	}

	int plaque;
	String marque;
	String model;

	// CONSTRUCTEUR
	public Voiture(int plaque, String marque, String model) {
		super();
		this.plaque = plaque;
		this.marque = marque;
		this.model = model;
	}

	// METHODE POUR AFFICHER LES INFORMATION D'UNE VOITURE
	public void affichageinfovoiture() {
		System.out.println("Plaque:" + plaque);
		System.out.println("Marque:" + marque);
		System.out.println("Model:" + model);
	}

	public int getPlaque() {
		return plaque;
	}

	public void setPlaque(int plaque) {
		this.plaque = plaque;
	}

	public String getMarque() {
		return marque;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}

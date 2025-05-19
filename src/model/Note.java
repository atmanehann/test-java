package model;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Demande de la note à l'utilisateur
		System.out.print("Entrez la note (sur 20) : ");
		double note = scanner.nextDouble();

		// Vérification de la validité de la note
		if (note < 0 || note > 20) {
			System.out.println("Note invalide. Veuillez entrer une note entre 0 et 20.");
		} else {
			// Affichage de la note et appréciation
			System.out.println("Note : " + note);

			if (note >= 16) {
				System.out.println("Appréciation : Très bien");
			} else if (note >= 14) {
				System.out.println("Appréciation : Bien");
			} else if (note >= 12) {
				System.out.println("Appréciation : Assez bien");
			} else if (note >= 10) {
				System.out.println("Appréciation : Passable");
			} else {
				System.out.println("Appréciation : Insuffisant");
			}
		}

		scanner.close();

	}

	private int math;
	private int francais;
	private int anglais;

	// CONSTRUTEUR
	public Note(int math, int francais, int anglais) {
		super();
		this.math = math;
		this.francais = francais;
		this.anglais = anglais;
	}

	// METHODE POUR AFFICHER LES NOTES
	public void affichagenote() {
		System.out.println("math:" + math);
		System.out.println("francais:" + francais);
		System.out.println("anglais:" + anglais);

	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getFrancais() {
		return francais;
	}

	public void setFrancais(int francais) {
		this.francais = francais;
	}

	public int getAnglais() {
		return anglais;
	}

	public void setAnglais(int anglais) {
		this.anglais = anglais;
	}

}

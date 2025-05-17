package model;

import java.util.Date;

public class Module {
	public static void main(String[] args) {
		// Déclaration et initialisation des variables

	}

	String developpement;
	String reseau;
	String systeme;
	Date date_de_naissance;

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

	public Date getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(Date date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

}

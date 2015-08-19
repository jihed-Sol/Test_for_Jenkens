package tn.jihed.bean;

public class Voiture {

	private String marque;
	private String modele;
	private String couleur;
	private String kilometrage;
	private String carburant;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(String kilometrage) {
		this.kilometrage = kilometrage;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele
				+ ", couleur=" + couleur + ", kilometrage=" + kilometrage
				+ ", carburant=" + carburant + "]";
	}
	
	
}

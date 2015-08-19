package tn.jihed.bean;

public class Client {

	private String nom;
	private String prenom;
	private String email;
	private String numTel;
	private String adress;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "client [nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", numTel=" + numTel + ", adress=" + adress + "]";
	}
	
	
}

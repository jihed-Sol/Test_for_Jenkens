package tn.jihed.bean;

import java.util.Date;

public class Location {

	private Voiture voiture;
	private Client client;
	private int dureeEnJour;
	private Date dateDebut;
	private Date dateFin;
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getDureeEnJour() {
		return dureeEnJour;
	}
	public void setDureeEnJour(int dureeEnJour) {
		this.dureeEnJour = dureeEnJour;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	@Override
	public String toString() {
		return "Location [voiture=" + voiture + ", client=" + client
				+ ", dureeEnJour=" + dureeEnJour + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + "]";
	}
	
	
	
}

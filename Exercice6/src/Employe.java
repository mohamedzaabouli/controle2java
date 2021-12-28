import java.util.Date;

public abstract class Employe {
	private String matricule;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	//constructeur sans parametre
	public Employe() {
		
	}
	//constructeur
	public Employe(String matricule, String nom, String prenom, Date dateNaissance) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + "]";
	}
	public abstract double getSalaire();

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	
	

}

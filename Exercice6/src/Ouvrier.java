import java.time.LocalDate;
import java.util.Date;

public class Ouvrier extends Employe{
	private Date dateEntree;
	private final int SMIG = 3000;
	private double salaire;
	
	//constructeur sans parametre
	public Ouvrier() {
		
	}
	//constructeur

	public Ouvrier(Date dateEntree) {
		
		this.dateEntree = dateEntree;
	}
	//constructeur
	public Ouvrier(String matricule, String nom, String prenom, Date dateNaissance,Date dateEntree) {
		super(matricule,nom,prenom,dateNaissance);
		this.dateEntree = dateEntree;
	}


	public int calculeAnciennete() {
		LocalDate dt=LocalDate.now();
		int anciennete;
		anciennete=dt.getYear()-dateEntree.getYear();
		return anciennete;
	}

	

	//la méthode getSalaire( ) qui permet de calculer le salaire
	@Override
	public double getSalaire() {
		salaire=SMIG+calculeAnciennete()*100;
		if(salaire<=SMIG*2) {
			return salaire;
		}
		else {
			return salaire=SMIG*2;
		}
		
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public int getSMIG() {
		return SMIG;
	}
	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}



	@Override
	public String toString() {
		return "Ouvrier [toString()=" + super.toString() + ", dateEntree=" + dateEntree + ", SMIG=" + SMIG
				+ ", salaire=" + salaire + "]";
	}
	
	
	
	
	

}

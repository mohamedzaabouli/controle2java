import java.util.Date;

public class Cadre extends Employe{
	private int indice;
	private double salaire;
	
	//constructeur sans parametre
	public Cadre() {
		
	}

	//constructeur 
	public Cadre(int indice) {
		this.indice = indice;
	}
	//constructeur 
	public Cadre(String matricule, String nom, String prenom, Date dateNaissance,int indice) {
		super(matricule,nom,prenom,dateNaissance);
		this.indice = indice;
	}
	@Override
	public String toString() {
		return "Cadre [toString()=" + super.toString() + ", indice=" + indice + ", salaire=" + salaire + "]";
	}
	//la méthode getSalaire( ) qui permet de calculer le salaire
	@Override
	public double getSalaire() {
		switch (indice) {
		case 1:
			salaire=12000;
			break;
		case 2:
			salaire=14000;
			break;
		case 3:
			salaire=16000;
		    break;
		case 4:
			salaire=18000;
			break;

		default:
			System.out.println("s'il vous plais entrer un indice entre 1 et 4");
			break;
		}
		return salaire;
	}


	
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}

	
    
	



	
	

}

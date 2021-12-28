import java.util.Date;

public class Associe extends Employe{
	private double chiffreAffaires;
	private double beneficeNet;
	private double pourcentagePartContr;
	
	//constructeur sans parametre
	public Associe() {
		
	}
	

	//constructeur 
	public Associe(String matricule, String nom, String prenom, Date dateNaissance,double chiffreAffaires, double beneficeNet, double pourcentagePartContr) {
		super(matricule,nom,prenom,dateNaissance);
		this.chiffreAffaires = chiffreAffaires;
		this.beneficeNet = beneficeNet;
		this.pourcentagePartContr = pourcentagePartContr;
	}


	//la méthode getSalaire( ) qui permet de calculer le salaire
	@Override
	public double getSalaire() {
	    return Math.round((beneficeNet*pourcentagePartContr/100)/12);
		
	}


	public double getChiffreAffaires() {
		return chiffreAffaires;
	}


	public void setChiffreAffaires(double chiffreAffaires) {
		this.chiffreAffaires = chiffreAffaires;
	}


	public double getBeneficeNet() {
		return beneficeNet;
	}


	public void setBeneficeNet(double beneficeNet) {
		this.beneficeNet = beneficeNet;
	}


	public double getPourcentagePartContr() {
		return pourcentagePartContr;
	}


	public void setPourcentagePartContr(double pourcentagePartContr) {
		this.pourcentagePartContr = pourcentagePartContr;
	}



	@Override
	public String toString() {
		return "Associe [toString()=" + super.toString() + ", chiffreAffaires=" + chiffreAffaires + ", beneficeNet="
				+ beneficeNet + ", pourcentagePartContr=" + pourcentagePartContr + "]";
	}
	
	



}

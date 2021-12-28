
public class Ville {
	public String nom ; 
	public double population ;
	public String pays ; 
	
	public Ville() {
		
	}
	public Ville(String nom, double population, String pays) {
		this.nom = nom;
		gestionExeptionPopulation(population);
		this.pays = pays;
	}
	public void gestionExeptionPopulation(double population) {
		Exception PopulationException = new Exception (population+" est invalide La populationn doit etre un nombre positif") ;
		try {
			if(population>=0 ) {
				this.population=population; 	
			}
			else {
				throw(PopulationException) ;
			}
		}
		catch(Exception e) {
			System.out.println(PopulationException.getMessage()) ;
		}
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPopulation() {
		return population;
	}


	public void setPopulation(double population) {
		gestionExeptionPopulation(population);
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}
	


	

}

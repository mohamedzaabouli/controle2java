
public class Test {

	public static void main(String[] args) {
		//tester de cree une ville sans erreur
		Ville ville1 = new Ville ("Berrechid" , 10 , "maroc") ; 
		//tester de cree une ville avec un nombre de popultion negatif passe sur les parametres du constructeur
		Ville ville2 = new Ville ("khouribga" , -300000 , "maroc") ; 
		//tester de cree une ville avec un nombre de popultion negatif passe sur le parametre de setter
		Ville ville3 = new Ville();
		ville3.setPopulation(-200);
	

	}

}

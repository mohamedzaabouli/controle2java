import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//calculateur du taux du rendement
		//cree un primeurs 
		Primeurs primeurs=new Primeurs(50, 90, "fraise","f1", 100, new Date(2022,02,01));
		System.out.println("le taux de rendement est :"+primeurs.calculateurTauxRendement());
		//affichage des caractéristiques du produit sur l'écran (les prix, le nom, le fournisseur)
		System.out.println(primeurs.affichageCaracteristiquesProduit());
		//calculer le nombre de jours rester d'un produit
		System.out.println("le nombre de jour rester :"+primeurs.joursRestants()+" jours");
		//cree un electromenagers
		Electromenagers electromenagers = new Electromenagers(50, 90, "s9+", "samsung ", 5, "galaxy", 220);
		//	Affichage des caractéristiques du produit sur l'écran (le prix, le nom, le fournisseur, marque, le voltage)
		System.out.println(electromenagers.affichageCaracteristiquesProduit());
		//lancer le solde : cette méthode baisse le prix du produit par le pourcentage donné
		electromenagers.lancerSolde(50);
		System.out.println("le prix de vente avec le solde :"+electromenagers.getPrixVente());
		
		//terminer le solde : cette méthode augmente le prix du produit par le pourcentage donné
		electromenagers.terminerSolde(30);
		System.out.println("le prix de vente et le solde terminer :"+electromenagers.getPrixVente());
		
		
		//cree magasin
		
		Magasin m1=new Magasin();
		
		//tester la methode S’approvisionner (spécifier le nom et la quantité)
		m1.approvisionner(primeurs.getNom(), primeurs.getQte());
		m1.approvisionner(electromenagers.getNom(), electromenagers.getQte());
		
		//tester la methode Vendre articles (spécifier le nom et la quantité)
		m1.vendreArticles(electromenagers.getNom(), electromenagers.getQte());
		//m1.vendreArticles(primeurs.getNom(), primeurs.getQte());
		
		
		//tester la methode Lister les articles en rupture en stock
		System.out.println("\n\n=====les articles en rupture en stock====");
		m1.listerArticlesRuptureEnStock();
		
		//tester la methode Lister les articles disponibles en stock
		System.out.println("\n\n=====les articles disponibles en stock====");
		m1.listerLesArticlesDisponibleEnStock();
		
		//tester la methode Quantité en stock par article (fournir le nom comme paramètre)
		m1.quantitEnStockParArticle("fraise");
		
		//tester la methode description de l'état du magasin
		m1.descriptionEtatMagasin();
		
		//tester la methode calculateur du taux de rendement
		
		System.out.println(m1.calculateurDuTauxDeRendement());
		
		
		
		

	}

}

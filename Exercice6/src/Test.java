import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//tester de cree un ouvrier est calculer le salaire
		Ouvrier ouvrier1 = new Ouvrier("O1","mohamed", "zaabouli", new Date(1980,02,02), new Date(2000,02,02));
		System.out.println("le salaire de cadre  "+ouvrier1.getNom()+" est : "+ouvrier1.getSalaire());
		//tester de cree un Cadre est calculer le salaire
		Cadre cadre1 = new Cadre("C1","mohamed", "zaabouli", new Date(1980,02,02),2);
		System.out.println("le salaire de cadre  "+cadre1.getNom()+" est : "+cadre1.getSalaire());
		//tester de cree un Associe est calculer le salaire
		Associe associe1=new Associe("C1","mohamed", "zaabouli", new Date(1980,02,02), 12000, 15000,60);
		System.out.println("le salaire d'associe "+associe1.getNom()+" est : "+associe1.getSalaire());

	}

}

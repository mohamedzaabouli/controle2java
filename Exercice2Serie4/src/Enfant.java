
public class Enfant {
	private int age;

	public Enfant() {
		
	}
	public Enfant(int age)throws Exception{
		gestionExptionAge(age);
	}
	public void gestionExptionAge(int age) {
		Exception AgeEnfantException=new Exception("["+age+"] ans n'est pas un âge valide !");
		try {
			if(age>=1 && age<=10) {
				this.age=age;
			}
			else {
				throw(AgeEnfantException);
			}
		}
		catch (Exception e) {
			System.out.println(AgeEnfantException.getMessage());
			
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
	   gestionExptionAge(age);
	}
	
	

}

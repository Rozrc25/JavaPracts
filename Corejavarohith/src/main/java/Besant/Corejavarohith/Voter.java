package Besant.Corejavarohith;

public class Voter {
	
	public void ageck(String name,int age, String ctyson) {
		int se = 18 - age;
		System.out.println(name);
		if(age >= 18 && ctyson == "Indian") {
			System.out.println("you can vote");
		}else {
			System.out.println("you can't vote");
			System.out.println(se + (" Years left"));
		}
		
	}

	
	public static void main(String[] args) {
		Voter VC = new Voter();
		VC.ageck("Rohith",16,"Indian");
	}

}

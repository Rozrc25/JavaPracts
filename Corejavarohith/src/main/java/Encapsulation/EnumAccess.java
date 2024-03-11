package Encapsulation;

public class EnumAccess {

	public void GenderExist(String actualGender)
	{
		Gender FemaleVariable = Gender.MALE;
		System.out.println(FemaleVariable);
		System.out.println(actualGender.toUpperCase());
		if(FemaleVariable.toString().equals(actualGender.toUpperCase()))
		{
			System.out.println("You are Male");
		}else {
			System.out.println("you are not male");
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumAccess e = new EnumAccess();
		e.GenderExist("MALE");
	}

}

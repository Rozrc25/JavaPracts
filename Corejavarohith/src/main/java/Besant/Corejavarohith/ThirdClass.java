package Besant.Corejavarohith;

public class ThirdClass {

		// TODO Auto-generated method stub
		public void Arriop(double num1, double num2) {
			
			 double sum = num1 + num2;
		     double difference = num1 - num2;
		     double product = num1 * num2;
		     double quotient = num1 / num2;
		     double modulus = num1 % num2;

		        // Display the results
		        System.out.println("Sum: " + sum);
		        System.out.println("Difference: " + difference);
		        System.out.println("Product: " + product);
		        System.out.println("Quotient: " + quotient);
		        System.out.println("Modulus: " + modulus);
		}
 
		public static void main(String[] args) {
			ThirdClass AC = new ThirdClass();
			AC.Arriop(12,5);
	    }

	}

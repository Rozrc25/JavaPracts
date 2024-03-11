package Besant.Corejavarohith;

/**
 * Hello world!
 *
 */

public class App 
{
//method with out param & without return type
public void Mymain() {
	System.out.println("hello");
}


////method with out param & with return type
public char name() {
	System.out.println("hello");
	return 'C';
}

///method with param & without return type
public void par(String name) {
	System.out.println(name);
}
//method with return type
public  int mul(int a,int b) {
	int c=a*b;  
	return c;
}

public void denom(int a,int b,int denom) {
	int num = mul(a,b);
	int d=num/denom;
	System.out.println(d);
}

    public static void main( String[] args )
    {
        System.out.println( "My Name is :"+" Rohith" );
        System.out.println( "My age is: 21" );
        System.out.println("I am from: Chennai");
        System.out.println("I am studying: Java");
        
         App FC= new App();
         FC.Mymain();
         FC.par("Roz");
         FC.denom(5,6,10);
    }
}

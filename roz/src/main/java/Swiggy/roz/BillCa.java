package Swiggy.roz;

public class BillCa {

public int gst = 180;

	public void Calexp(int a,int b) {
		int total = a * b;
		int total1 = total + gst;
		System.out.println("*****************FROM BILL***************");
		System.out.println(total1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

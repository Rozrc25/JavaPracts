package Swiggy.roz;
import Food.FoodList;

public class App extends HotelNm
{
	
	public static void Appname(String apname) {
		System.out.println("-------------FROM APP--------------");
		System.out.println(apname);
	}
    public static void main( String[] args )
    {
        Appname( "SWIGGY" );
        HotNm("LEO","Chennai");
        App Ap = new App();
        Ap.Calexp(2, 10);
       FoodList FD = new FoodList();
        FD.Foodlist("Pizza");
    }
}

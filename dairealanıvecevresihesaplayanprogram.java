package myjavaprograms;
import java.util.Scanner ;

public class dairealan�vecevresihesaplayanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius ;
		double area,cevre, pi ;
		pi=3.14 ;
		
		
		
		Scanner inp =new Scanner(System.in);
		System.out.print("Dairenin yar��ap�n� giriniz: ");
		radius=inp.nextInt();
		area=pi*radius*radius ;
		cevre=2*pi*radius ;
		System.out.println("Daireni alan�: " + area);
		System.out.println("Dairenin �evresi: " + cevre );
		System.out.print("PROGRAMEND");
		
		
		

	}

}

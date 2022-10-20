package myjavaprograms;
import java.util.Scanner ;

public class dairealanývecevresihesaplayanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius ;
		double area,cevre, pi ;
		pi=3.14 ;
		
		
		
		Scanner inp =new Scanner(System.in);
		System.out.print("Dairenin yarýçapýný giriniz: ");
		radius=inp.nextInt();
		area=pi*radius*radius ;
		cevre=2*pi*radius ;
		System.out.println("Daireni alaný: " + area);
		System.out.println("Dairenin çevresi: " + cevre );
		System.out.print("PROGRAMEND");
		
		
		

	}

}

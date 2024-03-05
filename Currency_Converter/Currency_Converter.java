package Currency_Converter;

import java.util.Scanner;

public class Currency_Converter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select the option");
		System.out.println("Rupee to USD");
		System.out.println("USD to Rupee");
		
		int converter = sc.nextInt();
		switch(converter)
		{
		case 1:
		{
			System.out.println("Enter Rupee");
			double rupee = sc.nextDouble();
			
			if(rupee>=0)
			{
				System.out.println(rupee + "Rupee is" + rupee*0.0121 + "Usd");
			}
			else
			{
				System.out.println("Enter Correct Value");
			}
		}
		break;
		
		case 2:
		{
			System.out.println("Enter USD");
			double usd = sc.nextDouble();
		
			if(usd>=0)
			{
				System.out.println(usd + "USD is" + usd*82.91+ "Rupee");
			}
			else
			{
				System.out.println("Enter Correct Value");
			}
		}
		break;
		}
	}
}



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string : ");
		String unos=input.nextLine();
		
		System.out.println("Unesite 1 da bi vidjeli duzinu vaseg stringa");
		System.out.println("Unesite 2 da bi vidjeli sve karaktere na parnim pozicijama");
		System.out.println("Unesite 3 da bi vidjeli sve karaktere na neparnim pozicijama");
		System.out.println("Unesite 4 da bi vidjeli broj velikih slova");
		System.out.println("Unesite 5 da bi vidjeli broj malih slova");
		System.out.println("Unesite 6 da bi vidjeli sve karaktere koji nisu slova : ");
		int izbor=input.nextInt();
		
		if(izbor == 1)
		{
			System.out.println("Duzina vaseg stringa je : "+duzinaStringa(unos));
		}
		else if(izbor == 2)
		{
			System.out.println("Karakteri na parnim pozicijama su : "+karakteriNaParnimPozicijama(unos));
		}
		else if(izbor == 3)
		{
			System.out.println("Karakteri na neparnim pozicijama su : "+karakteriNaNeparnimPozicijama(unos));
		}
		else if(izbor == 4)
		{
			System.out.println("Broj velikih slova je : "+brojVelikihSlova(unos));
		}
		else if(izbor == 5)
		{
			System.out.println("Broj malih slova je : "+brojMalihSlova(unos));;
		}
		else if(izbor == 6)
		{
			System.out.println("Karakteri koji nisu slova su : "+karakteriKojiNisuSlova(unos));;
		}
		
	}

	public static int  duzinaStringa(String sc) 
	{
		return sc.length();
	}
	
	public static String karakteriNaParnimPozicijama(String sc)
	{
		String karakteri="";
		for(int i=0;i<sc.length();i+=2)
		{
			karakteri=karakteri+sc.charAt(i);
		
		}
		return karakteri;
	}
	public static String karakteriNaNeparnimPozicijama(String sc)
	{ 
		String rijec="";
		for (int i=0; i<sc.length(); i++)
		{
			if(i%2!=0)
			{
				rijec=rijec+sc.charAt(i);
			}
		}	
		return rijec;
	}
	public static int  brojVelikihSlova(String sc) 
	{
		int brojac=0;
		for (int i=0; i<sc.length(); i++)
		{
			if(Character.isUpperCase(sc.charAt(i)))
			{
				brojac++;
			}
		}	
		return brojac;
	}
	public static int  brojMalihSlova(String sc) 
	{
		int brojac = 0;
		for (int i = 0; i < sc.length(); i++) 
			if (Character.isLowerCase(sc.charAt(i))) 
				brojac++;
		
		return brojac;
	}
	public static String karakteriKojiNisuSlova(String sc)
	{
		String karakteri = "";
		for (int i = 0; i < sc.length(); i++) 
			if(!Character.isAlphabetic(sc.charAt(i)) && !Character.isWhitespace(sc.charAt(i)))
				karakteri += sc.charAt(i);
		
		return karakteri;
	}
	

}
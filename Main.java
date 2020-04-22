import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
			duzinaStringa(unos);
		}
		else if(izbor == 2)
		{
			karakteriNaParnimPozicijama(unos);
		}
		else if(izbor == 3)
		{
			karakteriNaNeparnimPozicijama(unos);
		}
		else if(izbor == 4)
		{
			brojVelikihSlova(unos);
		}
		else if(izbor == 5)
		{
			brojMalihSlova(unos);
		}
		else if(izbor == 6)
		{
			karakteriKojiNisuSlova(unos);
		}
			
		
	}

	public static int  duzinaStringa(String sc) 
	{
		return 0;
	}
	
	public static ArrayList<String>karakteriNaParnimPozicijama(String sc)
	{
		return null;
	}
	public static String karakteriNaNeparnimPozicijama(String sc)
	{ String rijec="";
		for (int i=0; i<sc.length(); i++)
		{
			if(i%2==0)
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
		return 0;
	}
	public static ArrayList<String>karakteriKojiNisuSlova(String sc)
	{
		return null;
	}
	

}

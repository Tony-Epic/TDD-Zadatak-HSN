import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String unos=input.nextLine();
		
		System.out.println("Unesite 1 da bi vidjeli duzinu vaseg stringa");
		System.out.println("Unesite 2 da bi vidjeli sve karaktere na parnim pozicijama");
		System.out.println("Unesite 3 da bi vidjeli sve karaktere na neparnim pozicijama");
		System.out.println("Unesite 4 da bi vidjeli broj velikih slova");
		System.out.println("Unesite 5 da bi vidjeli broj malih slova");
		System.out.println("Unesite 6 da bi vidjeli sve karaktere koji nisu slova : ");
		int izbor=input.nextInt();
		
		if(izbor == 1)
			duzinaStringa(unos);

		else if(izbor == 2)
			karakteriNaParnimPozicijama(unos);
		
		else if(izbor == 3)
			karakteriNaNeparnimPozicijama(unos);
		
		else if(izbor == 4)
			brojVelikihSlova(unos);
		
		else if(izbor == 5) 
			System.out.println(brojMalihSlova(unos));
		
		else if(izbor == 6)
			System.out.println(karakteriKojiNisuSlova(unos));	
		
		else {
			System.out.println("Unijeli ste pogresan broj");
			menu();
		}
		
		input.close();
	}
	
	public static void main(String[] args) {
		menu();
	}

	public static int  duzinaStringa(String sc) 
	{
		return 0;
	}
	
	public static ArrayList<String>karakteriNaParnimPozicijama(String sc)
	{
		return null;
	}
	public static ArrayList<String>karakteriNaNeparnimPozicijama(String sc)
	{
		return null;
	}
	public static int  brojVelikihSlova(String sc) 
	{
		return 0;
	}
	
	public static int brojMalihSlova(String sc) {
		int brojac = 0;
		for (int i = 0; i < sc.length(); i++) 
			if (Character.isLowerCase(sc.charAt(i))) 
				brojac++;
		
		return brojac;
	}	
	
	public static String karakteriKojiNisuSlova(String sc) {
		String karakteri = "";
		for (int i = 0; i < sc.length(); i++) 
			if(!Character.isAlphabetic(sc.charAt(i)) && !Character.isWhitespace(sc.charAt(i)))
				karakteri += sc.charAt(i);
		
		return karakteri;
	}
	

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string : ");
		String unos=input.nextLine();
		input.close();
		
		System.out.println("Duzina vaseg stringa je : "+duzinaStringa(unos));
		System.out.println("Karakteri na parnim pozicijama su : "+karakteriNaParnimPozicijama(unos));
		System.out.println("Karakteri na neparnim pozicijama su : "+karakteriNaNeparnimPozicijama(unos));
		System.out.println("Broj velikih slova je : "+brojVelikihSlova(unos));
		System.out.println("Broj malih slova je : "+brojMalihSlova(unos));
		System.out.println("Karakteri koji nisu slova su : "+karakteriKojiNisuSlova(unos));;
		
	}

	
	public static int  duzinaStringa(String sc) 
	{
		return sc.length();
	}
	
	public static String karakteriNaParnimPozicijama(String sc)
	{
		String karakteri="";
		for(int i=0;i<sc.length();i++)
		{
			if(i%2!=0)
			{
				karakteri=karakteri+sc.charAt(i);
			}
		
		}
		return karakteri;
	}
	public static String karakteriNaNeparnimPozicijama(String sc)
	{ 
		String rijec="";
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
			{
				
				karakteri += sc.charAt(i);
			}
		
		return karakteri;
	}
	
}


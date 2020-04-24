import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Provjera {

	@Test
	void test() {
		
	}

	@Test
	public void odStringaTestdobijamo4()
	{
		
		int check;
		check=Main.duzinaStringa("Test");
		assertEquals(4,check );
	}
	
	@Test
	public void odStringaTestdobijamoEt()
	{
		String check;
		check=Main.karakteriNaParnimPozicijama("Test");
		assertEquals("et", check);
	}

	@Test
	public void odStringaJavadobijamoAA()
	{
		String string;
		string=Main.karakteriNaNeparnimPozicijama("Java");
		assertEquals("Jv", string);
	}
	
	@Test
	public void odStringaJavadobijamo1()
	{
		
		int broj;
		broj=Main.brojVelikihSlova("Java");
		assertEquals(1,broj );
	}
	@Test
	void izStringaVracamoMalaSlova() {
		int rezultat = Main.brojMalihSlova("pRoVjErA");
		assertEquals(4, rezultat);
	}
	
	@Test
	void izStringaVracamoKaraktereKojiNisuSlovoIliRazmak() {
		String rezultat = Main.karakteriKojiNisuSlova("provjera-21");
		assertEquals("-21", rezultat);
	}
	
	
}



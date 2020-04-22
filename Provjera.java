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
	public void odStringaTestdobijamoTs()
	{
		String check;
		check=Main.karakteriNaParnimPozicijama("Test");
		assertEquals("Ts", check);
	}

	@Test
	public void odStringaJavadobijamoAA()
	{
		String string;
		string=Main.karakteriNaNeparnimPozicijama("Java");
		assertEquals("aa", string);
	}
	
	@Test
	public void odStringaJavadobijamo1()
	{
		
		int broj;
		broj=Main.brojVelikihSlova("Java");
		assertEquals(1,broj );
	}
	
	
}


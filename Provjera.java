import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Provjera {

	@Test
	void test() {
		
	}

	@Test
	public void odStringaJavadobijamoJV()
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
	
	
}

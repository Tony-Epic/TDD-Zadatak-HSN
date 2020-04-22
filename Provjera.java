import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Provjera {

	@Test
	void test() {
		
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


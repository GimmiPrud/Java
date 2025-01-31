import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_string {

	@Test
	void testCaratteri() {
		assertEquals(3, Char_string.caratteri('i', "iridi"));
		assertNotEquals(5, Char_string.caratteri('i', "iridi"));
		
	}

	@Test
	void testPalindroma() {
		assertEquals(true, Char_string.palindroma("anna"));
		assertTrue(true);
	}
	
}

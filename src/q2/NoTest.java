package q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import q2.No;


public class NoTest {

	No no = new No(1);
	No no_1 = new No(2);
	No no_2 = new No(3);
	
	void testToString() {
		assertEquals("1", no.toString());
	}
	
	@Test
	void testGetChave() {
		assertEquals(1, no.getChave());
	}
	
	@Test
	void testSetChave() {
		no.setChave(7);
		assertEquals(7, no.getChave());
	}
	
	@Test
	void testGetBalanceamento() {
		assertEquals(0, no.getBalanceamento());
	}
	
	@Test
	void testSetBalanceamento() {
		no.setBalanceamento(2);
		assertEquals(2, no.getBalanceamento());
	}
	
	@Test
	void testGetPai() {
		no_1.setPai(no);
		assertEquals(no, no_1.getPai());
	}
	
	@Test
	void testSetPai() {
		no_1.setPai(no);
		assertEquals(no, no_1.getPai());
	}

	@Test
	void testGetDireita() {
		no.setDireita(no_1);
		assertEquals(no_1, no.getDireita());
	}
	
	@Test
	void testSetDireita() {
		no.setDireita(no_1);
		assertEquals(no_1, no.getDireita());
	}

	@Test
	void testGetEsquerda() {
		no.setEsquerda(no_2);
		assertEquals(no_2, no.getEsquerda());
	}
	
	@Test
	void testSetEsquerda() {
		no.setEsquerda(no_2);
		assertEquals(no_2, no.getEsquerda());
	}

}

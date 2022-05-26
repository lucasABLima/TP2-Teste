package q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArvoreAvlTest {

	@Test
	void testAchou() {
		boolean verdade = true;
		int n = 10;
		int[] vetorCres = new int[n];
		ArvoreAvl arvAbpCres = new ArvoreAvl();
		for (int i = 0; i < n; i++)
			arvAbpCres.inserir((vetorCres[i])); // Insere os elementos na arvore
		assertEquals(verdade, arvAbpCres.achou(0));
	}

	@Test
	void testAchouFalso() {
		boolean mentira = false;
		int n = 10;
		int[] vetorCres = new int[n];
		ArvoreAvl arvAbpCres = new ArvoreAvl();
		for (int i = 0; i < n; i++)
			arvAbpCres.inserir((vetorCres[i])); // Insere os elementos na arvore
		assertEquals(mentira, arvAbpCres.achou(82));
	}
	

}

package q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CArvBinTest {

	@Test
	void testQtdeNosFolha() {
		int n = 10;
		int[] vetorCres = new int[n];
		CArvBin arvAbpCres = new CArvBin();
		for (int i = 0; i < n; i++) {
			arvAbpCres.put((vetorCres[i]));
		}
		assertEquals(1, arvAbpCres.qtdeNosFolha());
	}

	@Test
	void testContaNos() {
		int n = 10;
		int[] vetorCres = new int[n];
		CArvBin arvAbpCres = new CArvBin();
		for (int i = 0; i < n; i++) {
			arvAbpCres.put((vetorCres[i])); // Insere os elementos na arvore
		}
		assertEquals(1, arvAbpCres.contaNos());
	}

	@Test
	void testQtdeNosInternos() {
		int n = 10;
		int[] vetorCres = new int[n];
		CArvBin arvAbpCres = new CArvBin();
		for (int i = 0; i < n; i++) {
			arvAbpCres.put((vetorCres[i])); // Insere os elementos na arvore
		}
		assertEquals(0, arvAbpCres.qtdeNosInternos());
	}

	@Test
	void testMenorNo() {
		int n = 10;
		int[] vetorCres = new int[n];
		CArvBin arvAbpCres = new CArvBin();
		for (int i = 0; i < n; i++) {
			arvAbpCres.put((vetorCres[i])); // Insere os elementos na arvore
		}
		assertEquals(0, arvAbpCres.menorNo());
	}

	@Test
	void testMaiorNo() {
		int n = 10;
		int[] vetorCres = new int[n];
		CArvBin arvAbpCres = new CArvBin();
		for (int i = 0; i < n; i++) {
			arvAbpCres.put((vetorCres[i])); // Insere os elementos na arvore
		}
		assertEquals(0, arvAbpCres.maiorNo());
	}

	@Test
	void testAchou() {
		boolean verdade = true;
		int n = 10;
		int[] vetorCres = new int[n];
		CArvBin arvAbpCres = new CArvBin();
		for (int i = 0; i < n; i++) {
			arvAbpCres.put((vetorCres[i])); // Insere os elementos na arvore
		}
		assertEquals(verdade, arvAbpCres.achou(0));
	}

	@Test
	void testAchouFalso() {
		boolean mentira = false;
		int n = 10;
		int[] vetorCres = new int[n];
		CArvBin arvAbpCres = new CArvBin();
		for (int i = 0; i < n; i++) {
			arvAbpCres.put((vetorCres[i])); // Insere os elementos na arvore
		}
		assertEquals(mentira, arvAbpCres.achou(15));
	}

	@Test
	void testSomaNosInt() {
		int n = 10;
		int[] vetorCres = new int[n];
		CArvBin arvAbpCres = new CArvBin();
		for (int i = 0; i < n; i++) {
			arvAbpCres.put((vetorCres[i])); // Insere os elementos na arvore
		}
		assertEquals(0, arvAbpCres.somaNosInt());
	}

}

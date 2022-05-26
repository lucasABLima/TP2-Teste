package q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypesOfSortsTest {

	int[] vetorA = new int[10];
	int[] vetorB = new int[5];
	int[] vetorC = new int[5];

	@Test
	void testBBSortClassicoTamanhoVetor() {
		;
		TypesOfSorts x = new TypesOfSorts(vetorA);
		assertEquals(10, x.BBSortClassico(vetorA).length);
	}

	@Test
	void testBBSortClassicoVetorVazio() {
		;
		int[] vetorD = { 1, 0, 2, 3, 9, 4};
		TypesOfSorts x = new TypesOfSorts(vetorD);
		assertEquals(0, x.BBSortClassico(vetorD).length - 6);
	}

	@Test
	void testBBSortAdapt1TamanhoVetor() {
		;
		TypesOfSorts x = new TypesOfSorts(vetorA);
		assertEquals(10, x.BBSortAdapt1(vetorA).length);
	}

	@Test
	void testBBSortAdapt1VetorVazio() {
		;
		int[] vetorD = { 1, 0, 2, 3, 9 };
		TypesOfSorts x = new TypesOfSorts(vetorD);
		assertEquals(0, x.BBSortAdapt1(vetorD).length - 5);
	}

	@Test
	void testBBSortAdapt2TamanhoVetor() {
		;
		TypesOfSorts x = new TypesOfSorts(vetorA);
		assertEquals(10, x.BBSortAdapt2(vetorA).length);
	}

	@Test
	void testBBSortAdapt2VetorVazio() {
		;
		int[] vetorD = { 1, 0, 2, 3, 9 };
		TypesOfSorts x = new TypesOfSorts(vetorD);
		assertEquals(0, x.BBSortAdapt2(vetorD).length - 5);
	}

	@Test
	void testInsercaoTamanhoVetor() {
		;
		TypesOfSorts x = new TypesOfSorts(vetorA);
		assertEquals(10, x.Insercao(vetorA).length);
	}

	@Test
	void testInsercaoVetorVazio() {
		;
		int[] vetorD = { 1, 0, 2, 3, 9 };
		TypesOfSorts x = new TypesOfSorts(vetorD);
		assertEquals(0, x.Insercao(vetorD).length - 5);
	}

	@Test
	void testSelecaoTamanhoVetor() {
		;
		TypesOfSorts x = new TypesOfSorts(vetorA);
		assertEquals(10, x.BBSortAdapt2(vetorA).length);
	}

	@Test
	void testSelecaoVetorVazio() {
		;
		int[] vetorD = { 1, 0, 2, 3, 9 };
		TypesOfSorts x = new TypesOfSorts(vetorD);
		assertEquals(0, x.BBSortAdapt2(vetorD).length - 5);
	}
	
	@Test
	void testChamaMergeSortTamanhoVetor() {
		;
		TypesOfSorts x = new TypesOfSorts(vetorA);
		assertEquals(10, x.chamaMergeSort(vetorA).length);
	}

	@Test
	void testChamaMergeSortVazio() {
		;
		int[] vetorD = { 1, 0, 2, 3, 9 };
		TypesOfSorts x = new TypesOfSorts(vetorD);
		assertEquals(0, x.chamaMergeSort(vetorD).length - 5);
	}
	
	@Test
	void testShellSortTamanhoVetor() {
		;
		TypesOfSorts x = new TypesOfSorts(vetorA);
		assertEquals(10, x.ShellSort(vetorA).length);
	}

	@Test
	void testShellSortVetorVazio() {
		;
		int[] vetorD = { 1, 0, 2, 3, 9 };
		TypesOfSorts x = new TypesOfSorts(vetorD);
		assertEquals(0, x.ShellSort(vetorD).length - 5);
	}
	
	@Test
	void testChamaQuicksortTamanhoVetor() {
		;
		TypesOfSorts x = new TypesOfSorts(vetorA);
		assertEquals(10, x.chamaQuicksort(vetorA).length);
	}

	@Test
	void testChamaQuicksortVetorVazio() {
		;
		int[] vetorD = { 1, 0, 2, 3, 9 };
		TypesOfSorts x = new TypesOfSorts(vetorD);
		assertEquals(0, x.chamaQuicksort(vetorD).length - 5);
	}
	
	

}

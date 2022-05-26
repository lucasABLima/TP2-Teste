package q1;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



class SortsTest {
	
	
	int[] vetorA = new int[10];
	int[] vetorB = new int[5];
	int[] vetorC = new int[5];
	
	

	@Test
	void testBBSortTamanhoVetor() {;
		Sorts x = new Sorts(vetorA);
		assertEquals(10,x.bubbleSort(vetorA).length);
	}
	@Test
	void testBBSortVetorVazio() {;
	   int[] vetorD = {1,0,2,3,9};
		Sorts x = new Sorts(vetorD);
		assertEquals(0,x.bubbleSort(vetorD).length-5);
	}
	
	@Test
	void testInsertSortTamanhoVetor() {;
		Sorts x = new Sorts(vetorA);
		assertEquals(10,x.insertSort(vetorA).length);
	}
	
	@Test
	void testInsertSortVetorVazio() {;
	   int[] vetorD = {1,0,2,3,9};
		Sorts x = new Sorts(vetorD);
		assertEquals(0,x.insertSort(vetorD).length-5);
	}
	
	
	@Test
	void testSelectionSortTamanhoVetor() {;
		Sorts x = new Sorts(vetorA);
		assertEquals(10,x.selectionSort(vetorA).length);
	}
	
	@Test
	void testSelectionSortVetorVazio() {;
	   int[] vetorD = {1,0,2,3,9};
		Sorts x = new Sorts(vetorD);
		assertEquals(0,x.selectionSort(vetorD).length-5);
	}
	
	
	@Test
	void testShellSortTamanhoVetor() {;
		Sorts x = new Sorts(vetorA);
		assertEquals(10,x.shellSort(vetorA).length);
	}
	

	@Test
	void testShellSortVetorVazio() {;
	   int[] vetorD = {1,0,2,3,9};
		Sorts x = new Sorts(vetorD);
		assertEquals(0,x.shellSort(vetorD).length-5);
	}
	
	@Test
	void testMergeSortTamanhoVetor() {;
		Sorts x = new Sorts(vetorA);
		assertEquals(10,x.mergeSort(vetorA).length);
	}
	
	@Test
	void testMergeSortVetorVazio() {;
	   int[] vetorD = {1,0,2,3,9};
		Sorts x = new Sorts(vetorD);
		assertEquals(0,x.mergeSort(vetorD).length-5);
	}
	
	@Test
	void testQuickSortTamanhoVetor() {;
		Sorts x = new Sorts(vetorA);
		assertEquals(10,x.quickSort(vetorA).length);
	}
	
	@Test
	void testQuickSortVetorVazio() {;
	   int[] vetorD = {1,0,2,3,9};
		Sorts x = new Sorts(vetorD);
		assertEquals(0,x.quickSort(vetorD).length-5);
	}
	
	
	
}
	


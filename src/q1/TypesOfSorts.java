package q1;

public final class TypesOfSorts {

	public TypesOfSorts(int vet[]) {
		BBSortClassico(vet);
		BBSortAdapt1(vet);
		BBSortAdapt2(vet);
		Insercao(vet);
		Selecao(vet);
		chamaMergeSort(vet);
		ShellSort(vet);
		chamaQuicksort(vet);
		

	}

	public int[] BBSortClassico(int[] vetor) {
		int[] ordenado = null;
		int i, j, aux;
		for (i = 0; i < vetor.length - 1; i++) {
			for (j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;

				}
			}
			ordenado = vetor;
		}
		return ordenado;
	}

	public int[] BBSortAdapt1(int[] vetor) {
		int[] ordenado = null;
		int i, aux = 0;
		boolean HouveTroca = true;
		while (HouveTroca) {
			HouveTroca = false;
			for (i = 0; i < vetor.length - 1; i++)
				if (vetor[i] > vetor[i + 1]) {
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					HouveTroca = true;
				}
			ordenado = vetor;
		}
		return ordenado;
	}

	public int[] BBSortAdapt2(int[] vetor) {
		int[] ordenado = null;
		int i, j, aux, cont;
		cont = vetor.length - 1;
		for (i = 0; i < vetor.length - 1; i++) {
			for (j = 0; j < cont; j++)
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			cont--;
			ordenado = vetor;
		}
		return ordenado;
	}

	public int[] Insercao(int[] vetor) {
		int[] ordenado = null;
		int i, j, v;
		for (i = 1; i < vetor.length; i++) {
			v = vetor[i];
			j = i;
			while ((j > 0) && (vetor[j - 1] > v)) {
				vetor[j] = vetor[j - 1];
				j--;
			}
			vetor[j] = v;
			ordenado = vetor;
		}
		return ordenado;
	}

	public int[] Selecao(int[] vetor) {
		int[] ordenado = null;
		int i, j, min, aux;
		for (i = 0; i < vetor.length - 1; i++) {
			min = i;
			for (j = i + 1; j < vetor.length; j++)
				if (vetor[j] < vetor[min])
					min = j;
			aux = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = aux;
			ordenado = vetor;
		}
		return ordenado;
	}

	public int[] chamaMergeSort(int v[]) {
		int[] ordenado = v;
		MergeSort(v, v.length);
		return ordenado;
	}

	public static void MergeSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		MergeSort(l, mid);
		MergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

	public int[] ShellSort(int[] v) {
		int[] ordenado = null;
  		int i, j, x = 1, value;
		do {
			x = 3 * x + 1;
		} while (x < v.length);
		do {
			x = x / 3;
			for (i = x; i < v.length; i++) {
				value = v[i];
				j = i - x;
				while (j >= 0 && value < v[j]) {
					v[j + x] = v[j];
					j = j - x;
				}
				v[j + x] = value;
			}
			ordenado = v;
		} while (x > 1);
		return ordenado;
	}

	public int[] chamaQuicksort(int v[]) {
		int[] ordenado = v;
		Quicksort(v, 0, 100000);
		return ordenado;
	}

	public static void Quicksort(int v[], int esquerda, int direita) {
		int e = esquerda, d = direita, pivo = v[(e + d) % 2], troca;
		while (e <= d) {
			while (v[e] < pivo) {
				e = e + 1;
			}
			while (v[d] > pivo) {
				d = d - 1;
			}
			if (e <= d) {
				troca = v[e];
				v[e] = v[d];
				v[d] = troca;
				e = e + 1;
				d = d - 1;
			}
		}
		if (d > esquerda)
			Quicksort(v, esquerda, d);
		if (e < direita)
			Quicksort(v, e, direita);
	}

}
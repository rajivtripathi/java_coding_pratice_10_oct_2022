package CodingPractive;

public class SelectedSort {

	public static void main(String[] args) {
		int[] a = { 10, 19, 5, 1, 12 };

		int temp;
		int min;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		for (int z = 0; z < a.length; z++) {
			System.out.println(a[z]);
		}

	}

}

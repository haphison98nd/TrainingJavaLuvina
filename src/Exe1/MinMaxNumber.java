package Exe1;

import java.util.Arrays;

public class MinMaxNumber {
	public static void main(String[] args) {
		int[] array_input = { 2, 8, 1, 1, 3, 4, 5, 6, 7, 8, 8, 8, 1 };
		MinMaxNumber minMaxNumber = new MinMaxNumber();
		ElementNumber max = minMaxNumber.findMax(array_input);
		ElementNumber min = minMaxNumber.findMin(array_input);
		System.out.println("Max la: " + "\n" + max);
		System.out.println("Min la : " + "\n" + min);
	}

	static int[] addElement(int[] a, int e) {
		a = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}

	private ElementNumber findMax(int[] array) {
		int max = array[0];
		int countMax = 0;
		int[] indexArray = {};
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				countMax = 1;
				int[] indexArrayTemp = {};
				indexArrayTemp = addElement(indexArrayTemp, i);
				indexArray = indexArrayTemp;
			} else if (array[i] == max) {
				countMax++;
				indexArray = addElement(indexArray, i);
			}
		}
		return new ElementNumber(max, countMax, indexArray);
	}

	private ElementNumber findMin(int[] array) {
		int min = array[0];
		int countMin = 0;
		int[] indexArray = {};
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				countMin = 1;
				int[] indexArrayTemp = {};
				indexArrayTemp = addElement(indexArrayTemp, i);
				indexArray = indexArrayTemp;
			} else if (array[i] == min) {
				countMin++;
				indexArray = addElement(indexArray, i);
			}
		}
		return new ElementNumber(min, countMin, indexArray);
	}
}

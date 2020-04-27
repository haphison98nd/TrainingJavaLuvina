package Exe1;

import java.util.Arrays;

public class ElementNumber {
	int value, count;
	int[] indexArray;
	
	public ElementNumber(int value, int count, int[] indexArray) {
		super();
		this.value = value;
		this.count = count;
		this.indexArray = indexArray;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int[] getIndexArray() {
		return indexArray;
	}
	
	public void setIndexArray(int[] indexArray) {
		this.indexArray = indexArray;
	}
	
	@Override
	public String toString() {
		return "Gia tri: " + value + ", So lan xuat hien: " + count + ", Cac vi tri xuat hien: " + Arrays.toString(indexArray)
				+ "";
	}
}

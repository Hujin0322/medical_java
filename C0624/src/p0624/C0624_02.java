package p0624;

import java.util.Arrays;

public class C0624_02 {

	public static void main(String[] args) {
		int[] arr= new int [3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = null;
		arr2 = arr;
		
		System.out.println(Arrays.toString(arr2));
		arr2[0] = 1000; //주소값 전달
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
	}

}

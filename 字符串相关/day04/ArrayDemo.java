package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
	public static void main(String []args){
		String[] array=new String[10];
		String[] arr=(String[]) Array.newInstance(String.class, 10);
		
		arr[0]="a";
		System.out.println(arr.length);
		Array.set(array, 0, "a");
		
		
		System.out.println(Arrays.toString(arr));
		String a=(String)Array.get(arr, 0);
		System.out.println(a);
		
		
		
	}
}

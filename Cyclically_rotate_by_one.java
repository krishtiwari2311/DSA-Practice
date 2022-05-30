package Arrays;

import java.util.Arrays;

public class Cyclically_rotate_by_one {
	static int arr[]=new int[] {1,2,3,4,5};
	static void rotate()
	{
		int x=arr[arr.length-1],i;
		for(i=arr.length-1;i>0;i--)
			arr[i]=arr[i-1];
		arr[0]=x;
	}

	public static void main(String[] args) {
		System.out.println("GIVEN ARRAY IS:");
		System.out.println(Arrays.toString(arr));
		// TODO Auto-generated method stub
		
		rotate();
		
		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));

	}

}

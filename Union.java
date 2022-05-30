package Arrays;

public class Union {
	public static int printUnion(int arr1[], int arr2[],int m, int n) {
		int i=0, j=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j])
				System.out.println(arr1[i++]+" ");
			else if(arr2[j]<arr1[i])
				System.out.println(arr2[j++]+" ");
			else {
				System.out.println(arr2[j++]+" ");
				i++;
			}
		}
		while(i<m)
			System.out.println(arr1[i++]+" ");
		while(j<n)
			System.out.println(arr2[j++]+" ");
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {2,3,5,7};
		int m=arr1.length;
		int n=arr2.length;
		printUnion(arr1,arr2,m,n);

	}

}

//Use two indexes variables i and j, initial values i=0, j=0.
//If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
//If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
//If both are same then print any of them and increment both i and j.
//Print remaining elements of the larger array.

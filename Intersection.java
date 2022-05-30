package Arrays;

public class Intersection {
	 public static void printIntersection(int arr1[], int arr2[], int m, int n) {
		 int i=0,j=0;
		 while(i<m && j<n) {
			 if(arr1[i]<arr2[j])
				 i++;
			 else if(arr2[j]<arr1[i])
				 j++;
			 else {
				 System.out.println(arr2[j++]+" ");
				 i++;
			 }
		 }
	 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,4,5,6};
		int arr2[]= {2,3,5,7};
		int m=arr1.length;
		int n=arr2.length;
		printIntersection(arr1,arr2,m,n);

	}

}

//Use two index variables i and j, initial values i=0,j=0.
//If arr1[i] is smaller than arr2[j] then increment i.
//If arr1[i] is greater than arr2[j] then increment j.
//If both are same then print any of them and increment both i and j.
package Recursive_Algorithm;

public class Quick_Sort {


	public static int partition(int[] arr,int si, int ei) {

		int pivotelm=arr[si];
		int count=0;

		for(int i=si+1;i<arr.length;i++) { // finding the actual pivot position
			if(arr[i]<pivotelm) {
				count++;
			}
		}

		int position=si+count; // This is the current pivot position.

		// Swapping the values to move pivot to it's desired position. 
		int temp=arr[position]; 
		arr[position]=pivotelm;
		arr[si]=temp;

		// Arrange the smaller elements and larger elements according to the pivot .
		int i=si,j=ei;

		while(i<j) {
			if(arr[i]<pivotelm) {
				i++;
			}else if(arr[j]>=pivotelm) {
				j--;
			}else {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		return position;
	}


	public static void sort(int[] arr, int si, int ei) {

		if(si>=ei) {
			return;
		}

		int pivotindex=partition(arr,si,ei);
		sort(arr,si,pivotindex-1);
		sort(arr,pivotindex+1,ei);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,5,9,4,7,1,8,5};

		int si=0;
		int ei=arr.length-1;

		sort(arr,si,ei);

		for(int elm:arr) {
			System.out.print(elm+" ");
		}
	}

}

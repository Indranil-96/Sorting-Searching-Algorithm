package Recursive_Algorithm;

public class Merge_Sort {
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void merge(int[] arr, int[] s1,int[] s2) {
		int i=0,j=0,k=0;
		while(i<s1.length && j<s2.length) {
			
			if(s1[i]<s2[j]) {
				arr[k]=s1[i];
				i++;
				k++;
			}else {
				arr[k]=s2[j];
				j++;
				k++;
			}
		}
		
		
		while(i<s1.length) {
			arr[k]=s1[i];
			i++;
			k++;
		}
		
		while(j<s2.length) {
			arr[k]=s2[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int arr[]) {
		if(arr.length==1) {
			return ;
		}
		
		int length1=(arr.length/2);
		int length2=(arr.length-length1);
		
		int[] s1= new int[length1];
		int[] s2= new int[length2];
		
		for(int i=0;i<s1.length;i++) {
			s1[i]=arr[i];
		}
		
		for(int i=arr.length/2;i<arr.length;i++) {
			s2[i-arr.length/2]=arr[i];
		}
		
		mergeSort(s1);
		mergeSort(s2);
		merge(arr,s1,s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {35,13,43,10};
		mergeSort(arr);
		
		print(arr);
	}

}

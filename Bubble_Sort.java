package $Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Bubble_Sort {
	
	public static void sort(int[] arr) {
		int size=arr.length;
		
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		// Printing the sorted array
		for(int element:arr) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader BR =  new BufferedReader(IO);
		
		int length=Integer.parseInt(BR.readLine());
		int arr[]= new int[length];
		
		for(int i=0;i<length;i++) {
			arr[i]=Integer.parseInt(BR.readLine());
		}
		sort(arr);
	}

}

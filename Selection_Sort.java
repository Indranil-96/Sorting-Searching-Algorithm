package $Algorithm;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Selection_Sort {
	
	public static void sort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=Integer.MAX_VALUE;
			int minindex=-1;
			for(int j=i;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minindex=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		}
		
		for(int element:arr) {
			System.out.print(element+" ");
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

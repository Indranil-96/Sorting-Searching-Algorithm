package $Algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Binary_Search {
	// Binary Search
	public static int Search(int[] arr,int x) {
		
		int si=0;
		int ei=arr.length-1;
		
		while(si<=ei) {
			int mid=(si+ei)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]<x) {
				si=mid+1;
			}
			else  {
				ei=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader BR =  new BufferedReader(IO);
		
		int length=Integer.parseInt(BR.readLine());
		int arr[]= new int[length];
		
		for(int i=0;i<length;i++) {
			arr[i]=Integer.parseInt(BR.readLine());
		}
		
		System.out.println("Enter the item to be searched");
		int x=Integer.parseInt(BR.readLine());
		System.out.println(Search(arr,x));
		
	}

}

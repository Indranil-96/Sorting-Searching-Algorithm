package $Algorithm;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Linear_Search {
	//Linear Search
	
	public static int search(int[] arr,int x) {
		if(arr.length<=1) {
			return -1;
		}
		
		int i=0;
		while(i<arr.length) {
			if(arr[i]==x) {
				return i;
			}
			else {
				i++;
			}
		}
		return -1;
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
		
		System.out.println("Enter the item to be searched");
		int x=Integer.parseInt(BR.readLine());
		
		System.out.println(search(arr,x));
	}

}

package $Algorithm;



public class Insertion_sort {

	public static void sort(int [] arr) {

		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {

				arr[j+1]=arr[j];System.out.println("Index"+j);
				
				j--;
			}
			arr[j+1]=temp;System.out.println("Index"+j);
		}

		for(int element:arr) {
			System.out.println(element);
		}
	}

	public static void main(String[] args)   {
		// TODO Auto-generated method stub

		int[] arr= {6,5,7,8,3,4,2};

		sort(arr);
	}

}

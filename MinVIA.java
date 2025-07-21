import java.util.Scanner;
public class MinVIA {

	public static void main(String rags[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter"+n+"elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int min =arr[0];
		for (int i=1;i<arr.length;i++){
			if(arr[i]<min){
				
				min=arr[i];
			}
		}
	System.out.println("minimum value is :"+min);
	}
}

		
		
		
	
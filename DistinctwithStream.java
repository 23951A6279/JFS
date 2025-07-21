import java.util.*;
import java.util.stream.*;
public class DistinctwithStream {
	public  static void main(String [] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter size od array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter "+n+"elements:");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		List<Integer> distinctValues=Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
		System.out.println("distinct value are:"+distinctValues);
	}
}

	
		
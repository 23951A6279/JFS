import java.util.*;
public class DistinctVal {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array:");
	int n=sc.nextInt();
	int[] arr = new int[n];
	System.out.println("enter" +n+"elements:");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	Set<Integer> disSet=new HashSet<>();
	for(int num:arr){
		disSet.add(num);
	}
	
	
	System.out.println("distinct values are :"+disSet);
	}
}


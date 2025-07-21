import java.util.Scanner;
public class MinInS {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers separated with space:");
		String s=sc.nextLine();
		String[] peices=s.split(" ");
		int min=Integer.parseInt(peices[0]);
		for(int i=1;i<peices.length;i++){
			int num=Integer.parseInt(peices[i]);
			if(num<min) {
				min=num;
			}
		}
		System.out.println("min value is :" +min);
	}
}

		
		
		
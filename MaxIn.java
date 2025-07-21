import java.util.Scanner;
public class MaxInS {
	public static void man(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the values with space:");
		String s=sc.nextLine();
		String[] parts=s.split(" ");
		int max=Integer.parseInt(parts[0]);
		for(int i=1;i<parts.length;i++) {
			int num=Integer.parseInt(parts[i]);
			if(num>max) {
				max=num;
			}
		}
		System.out.println("maximum is :"+max);
	}
}

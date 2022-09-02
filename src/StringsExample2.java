import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StringsExample2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int key;
		int i=input1/1000;
		int j=(input2/100)%10;
		ArrayList<Integer> l1=new ArrayList<Integer>();
		while(input3!=0)
		{
			l1.add(input3%10);
			input3/=10;
		}
		int m=Collections.max(l1);
		key=i*j-m;
		System.out.println(key);
		
		
				
	}

}

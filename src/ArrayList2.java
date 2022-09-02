import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		/*
		 * Manipulation operations in ArrayList such as
		 * retainAll(Collection)
		 * replaceAll(element)
		 * set(index,element)
		 */
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		while(n1>0)
		{
			String s=sc.next();
			list1.add(s);
			n1--;
		}
		while(n2>0)
		{
			String s=sc.next();
			list2.add(s);
			n2--;
		}
		
		System.out.println(list1);
		System.out.println(list2);
		list1.retainAll(list2);
		System.out.println(list1);
		list2.set(1,"K");
		System.out.println(list2);
		System.out.println(list2.subList(0,1));
		sc.close();

	}

}

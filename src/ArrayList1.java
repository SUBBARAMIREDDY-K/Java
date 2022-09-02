import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


public class ArrayList1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		while(n>0)
		{
			String s=sc.next();
			list.add(s);
			n--;
		}
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		//Iterator Interface  it moves forward direction
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		//ListIterator Interface It moves in Bi-directions BackWard Direction
		ListIterator<String> lt = list.listIterator(list.size());
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
		System.out.println();
		//ListIterator Interface It moves in Bi-directions ForWard Direction
		ListIterator<String> lt1 = list.listIterator();
		while(lt1.hasNext())
		{
			System.out.println(lt1.next());
		}
		System.out.println();
		
		
		// for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		
		//forEach Loop
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
		//forEach Method introduced in java8
		System.out.println("forEach method");
		System.out.println();
		list.forEach(a->{
			System.out.println(a);
		});
		
		
		//forEachRemaining method
		System.out.println("ForEACh Reamaning");
		Iterator<String> it1=list.iterator();
		it1.forEachRemaining(a->{
			System.out.println(a);
		});
	}

}

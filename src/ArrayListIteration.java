import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


//Iterating the Arraylist in various Forms
//We can iterate the ArrayList elements Six Different Various.



public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Subbu");
		list.add("Suman");
		list.add("cherry");
		System.out.println(list);
		
		System.out.println("--------for loop-----");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
		System.out.println("--------forEach loop-----");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
		System.out.println("--------Iterator-----");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------ListIterator in forward Direction-----");
		
		ListIterator<String> lsf = list.listIterator();
		while(lsf.hasNext())
		{
			System.out.println(lsf.next());
		}
		
		System.out.println("--------ListIterator in Backward Direction-----");
		
		ListIterator<String> lsb = list.listIterator(list.size());
		while(lsb.hasPrevious())
		{
			System.out.println(lsb.previous());
		}
		
		System.out.println("--------ForEach Method using Lambda Expression-----");
		
		list.forEach(x->System.out.println(x));
		
		
		System.out.println("--------ForEachReamining Method using Lambda Expression-----");
		
		it=list.iterator();
		it.forEachRemaining(x->System.out.println(x));
		
		


	}

}

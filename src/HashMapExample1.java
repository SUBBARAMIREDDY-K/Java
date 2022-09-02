import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		HashMap<Character,Integer> hs = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(!hs.containsKey(s.charAt(i)))
			{
				hs.put(s.charAt(i), 1);
			}
			else
			{
				int x=hs.get(s.charAt(i));
				x+=1;
				hs.put(s.charAt(i), x);
			}
		}
		System.out.println(hs);
		hs.forEach((k,v)-> System.out.println(k+"  "+v));
		

	}

}

import java.util.Scanner;

public class StringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc= new Scanner(System.in);
				String s=sc.next();
				StringBuffer sb = new StringBuffer("");
				String str="";
				Character s1=' ';
				for(int i=0;i<s.length();i++)
				{
					if(Character.isAlphabetic(s.charAt(i)))
						s1=s.charAt(i);
					else if(Character.isDigit(s.charAt(i)))
					{
						System.out.println(s.charAt(i));
						
						for(int j=0;j<s.charAt(i);j++)
						{
							str+=s1;
						}
					}
				}
				System.out.print(str);

	}

}

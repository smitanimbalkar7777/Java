package progrqm;

public class Excep4 
{


private static final char[] Var = null;

public static void main(String[]args)
	{
		System.out.println("main begin");
		String s="Smita";
		try {
			System.out.println(s.charAt(10));
		
	}
		catch(StringIndexOutOfBoundsException var)
		{
			System.out.println(Var);
		}
finally
{
	System.out.println("Smita");
	System.out.println("Nikita");
}
		System.out.println("main end");
	}
}


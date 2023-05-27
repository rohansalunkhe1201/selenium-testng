package MethodWithreturnType;

public class practice1 
{
	public static void main(String[] args) 
	{
		int num1=add(2,2);
		System.out.println(num1);
		
		System.out.println("-------------");
		
		System.out.println(add(4,4));
		
		System.out.println("-------------");
		
		practice1 p1=new practice1();
		int num2=p1.mul(2, 2);
		System.out.println(num2);
		
		System.out.println("-------------");
		
		System.out.println(p1.mul(4, 4));
		
		System.out.println("-------------");
		
		String s1=practice2.ConvertNametoLowerCase("MANISHA");
				System.out.println(s1);
				
	    System.out.println("-------------");
		
	    System.out.println(practice2.ConvertNametoLowerCase("ROHAN"));
				
		
	}
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int mul(int c,int d)
	{
		int e=c*d;
		return e;
	}

}

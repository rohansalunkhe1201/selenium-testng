package MethodWithreturnType;

public class sample1
{
	public static void main(String[] args) 
	{
		int num1=add(5,5);
		System.out.println(num1);
		
		System.out.println("-------------");
		
		System.out.println(add(10,10));
		
		System.out.println("-------------");
		
		sample1 s1=new sample1();
		int num2=s1.mul(5,5);
		System.out.println(num2);
		
		System.out.println("-------------");
		
		System.out.println(s1.mul(10, 10));
		
		System.out.println("-------------");
		
		String s2=sample2.convertNametoUpperCase("Rohan");
		System.out.println(s2);
		
		System.out.println("-------------");
		
		System.out.println(sample2.convertNametoUpperCase("Mahesh"));
		
		
		
		
		
	}
	
	public static int add(int a, int b)
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

package qedge.march22;

public class Demo1 {

	public static void main(String[] args) throws Throwable  {
		// print even numbers from 1 to 20
		int i=0;
		while(i<=20)
		{
			Thread.sleep(1000);
			System.out.println(i);
			i+=2;
		}

	}

}

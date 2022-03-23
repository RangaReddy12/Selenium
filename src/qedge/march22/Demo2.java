package qedge.march22;

public class Demo2 {

	public static void main(String[] args) throws Throwable {
		//print odd number from 1 to 20
		int i=1;
		do
		{
			Thread.sleep(1000);
			System.out.println(i);
			i+=2;
		}while(i<=20);

	}

}


public class MyServiceClass {

	public static void main(String []args){
		System.out.println(fact(4));
	}

	public int fact(int n)
	{
		// Base case
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}
}

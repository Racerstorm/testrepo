package basePackage;

public class BaseClass {

	public int calculateSum(int a, int b)
	{
		return a+b;
	}
	
public static void main(String[] args) {
		BaseClass b = new BaseClass();
		System.out.println("The sum of numbers is : "+b.calculateSum(5, 2));

	}

}

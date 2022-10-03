package basePackage;

public class ChildClass extends BaseClass{
	
	public void display(int a,int b)
	{
		System.out.println("The difference is : "+calculateDifference(a, b));
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.display(12,2);

	}

}

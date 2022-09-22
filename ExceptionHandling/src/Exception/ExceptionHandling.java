package Exception;

public class ExceptionHandling {
	
	public static void div() {
		int a=10,b=0,c;
		try {
			 c=a/b;
		    }
		catch(ArithmeticException e)
		{
			System.out.println("Exception is created and handled");
		}
	}
	
    public static void main(String[] args) {
		
	  div();
	}
}



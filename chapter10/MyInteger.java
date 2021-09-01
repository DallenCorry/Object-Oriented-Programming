package myInt;
/**
 * Class MyInteger creates an object that contains an integer, with methods to test if it is even, odd, prime or equal with another int or another MyInteger object
 * @author Dallen Corry
 * @since 1 Sept. 2021
 * @version 1.2
 */
public class MyInteger {
	private int value;
	
	/**
	 * main method tests the methods for object MyInteger
	 */
	public static void main(String[] args) {
		char[] c = {'1','3','6'};
		String s = "1873";
		MyInteger x = new MyInteger(7);
		MyInteger y = new MyInteger(4);
		MyInteger z = new MyInteger(2);

		//testing is___() methods
		System.out.println("The value of x is "+x.getValue());
		System.out.print("   ");
		if(x.isEven())
			System.out.print("x is even. ");
		if(x.isOdd())
			System.out.print("x is odd. ");
		if (x.isPrime())
			System.out.print("x is prime. ");
		else
			System.out.print("x is not prime. ");
		if(x.equals(7))
			System.out.println("x equals 7. ");
		else
			System.out.println("x does not equal 7. ");
		
		//testing is___(MyInteger) methods
		System.out.println("The value of y is "+y.getValue());
		System.out.print("   ");
		if(isEven(y))
			System.out.print("y is even. ");
		if(isOdd(y))
			System.out.print("y is odd. ");
		if (isPrime(y))
			System.out.print("y is prime. ");
		else
			System.out.print("y is not prime. ");
		if(y.equals(x))
			System.out.println("y equals x. ");
		else
			System.out.println("y does not equal x. ");
		
		//testing is___(int) methods
		System.out.println("The value of z is "+ z.getValue());
		System.out.print("   ");
		if(isEven(z.getValue()))
			System.out.print(z.getValue()+" is even. ");
		if(isOdd(z.getValue()))
			System.out.print(z.getValue()+" is odd. ");
		if (isPrime(z.getValue()))
			System.out.print(z.getValue()+" is prime. ");
		else
			System.out.print(z.getValue()+" is not prime. ");
		if(z.equals(z.getValue()))
			System.out.println("z equals "+z.getValue());
		else
			System.out.println("z does not equal "+z.getValue());
		
		//testing parseInt methods
		System.out.println("The char array c as an int is "+parseInt(c));
		System.out.print("c + 4 = ");
		System.out.println(parseInt(c)+4);
		System.out.println("The string s as an int is "+parseInt(s));
		System.out.print("s + 3 = ");
		System.out.println(parseInt(s)+3);
	}
	
	/**constructor
	 * constructs a new MyInteger with the specified value*/
	MyInteger(int value){
		this.value=value;
	}
	
	/**returns value of the object*/
	int getValue(){
		return value;
	}
	
	
	/**returns true if the value is even, false otherwise*/
	Boolean isEven() {
		if (value%2==0) 
			return true;
		else
			return false;
	}
	static Boolean isEven(int value) {
		if (value%2==0) 
			return true;
		else
			return false;
	}
	static Boolean isEven(MyInteger value) {
		if (value.getValue()%2==0) 
			return true;
		else
			return false;
	}
	
	
	/**returns true if the value is odd, false otherwise*/
	Boolean isOdd() {
		if (value%2==0)
			return false;
		else
			return true;	
	}
	static Boolean isOdd(int value) {
		if (value%2==0)
			return false;
		else
			return true;	
	}
	static Boolean isOdd(MyInteger value) {
		if (value.getValue()%2==0)
			return false;
		else
			return true;
	}
	
	
	/**returns true if the value is prime, false otherwise*/
	Boolean isPrime() {
		boolean prime = true;
		if(value<2)
			prime = false;
        for (int i=2; i< ((value/2)+1); i++){
            if(value%i==0){
              prime=false;
              return prime;
            }
        }
        return prime;
	}
	static Boolean isPrime(int value) {
		boolean prime = true;
		if(value<2)
			prime = false;
        for (int i=2; i< ((value/2)+1); i++){
            if(value%i==0){
              prime=false;
              return prime;
            }
        }
        return prime;
    }
	static Boolean isPrime(MyInteger value) {
		if(value.getValue()<2)
			return false;
		for(int i=2; i<=value.getValue()/2; i++) {
			if(value.getValue()%i==0||value.getValue()<2)
				return false;
			else
				isPrime(value.getValue()-1);
		}
		return true;
	}
	
	
	
	/**return true if the value in this object is equal to the specified value*/
	Boolean equals(int value) {
		if (this.value==value)
			return true;
		else
			return false;
	}
	Boolean equals(MyInteger value) {
		if (this.value == value.getValue())
			return true;
		else
			return false;
	}
	
	
	/**converts and returns a char[] into an int*/
	static int parseInt(char[] value) {
		return Integer.parseInt(String.valueOf(value));
	}
	/**converts and returns a String to an int*/
	static int parseInt(String value) {
		return Integer.parseInt(value);
	}
	
}

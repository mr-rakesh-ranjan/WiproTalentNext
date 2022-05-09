/**
 * 
 */
package session1;

/**
 * @author rakes
 *
 */
public class Hour1 {

	/**
	 * @param args
	 */
	int x = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
		Hour1 m = new Hour1();
		Hour1 p = new Hour1();
		m=p;
		m.x = m.x+10;
		p.x= p.x + 8;
		System.out.println(m.x + " " + p.x);
	}

}

/*
 class A {
 	public static void main (String [] args) {
 		System.out.println("Hi");
 	}
 }
 
 public : access modifiers/specifier
 static : keyword, without creating the object
 void   : return type/ int fun not even()
 main() : function, a, a()
 String : starts with capital thus class
 args   : array
 System : class
 out    : static variable / member of System class
 println: function which take String as argument 
 
 
 Note: String + args [] - command line argument
 		In C :- 
 		void main(arge, char*argv[])
 	-> dot operator/ period operator / Member Access Operator
 			to access the member of class using var, we use dot operator
  
  
  
 */

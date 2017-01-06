package Generics;

public class MySimpleGenericMethod {
	
	public static void main(String[] args) {
		
		Integer[] arr={1,2,3};
		
		Character[] carr={'a','b','c'};
		genFuncPrint(arr);
		
		genFuncPrint(carr);
		
		genFuncAdd(1,2);
		
		genFuncAdd(1.01,2.25);
	}
	
	// http://math.hws.edu/javanotes/c10/s5.html
	
	public static  <T>void genFuncPrint(T[] t1){
		
		//T s;
		for( T i:t1){
			System.out.println(i);
		}
		
	}
	
	public static  <T extends Number> double genFuncAdd(T t1,T t2){
		
		double s; // String ss;
		//ss=t1.getClass().+t2.getClass().getName();
		
		s=t1.doubleValue()+t2.doubleValue();
		
		System.out.println(s);
		
		return s;
		
	}
	

}

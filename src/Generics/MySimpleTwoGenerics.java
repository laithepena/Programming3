package Generics;

public class MySimpleTwoGenerics {
	 
    public static void main(String a[]){
         
        SimpleGen<String, Integer> sample1
                    = new SimpleGen<String, Integer>("JAVA2NOVICE", 100);
        sample1.printTypes();
        
        SimpleGen<Integer, Integer> sample2
        = new SimpleGen<Integer, Integer>(4, 100);
        
        sample2.printTypes();
    }
}
 
/**
 * Simple generics class with two type parameters U, V.
 */
class SimpleGen<U, V>{
     
    //type U object reference
    private U objUreff;
    //type V object reference
    private V objVreff;
     
    //constructor to accept object type U and object type V
    public SimpleGen(U objU, V objV){
        this.objUreff = objU;
        this.objVreff = objV;
    }
     
    public void printTypes(){
        System.out.println("U Type: "+this.objUreff.getClass().getName());
        System.out.println("V Type: "+this.objVreff.getClass().getName());
    }
}
//- See more at: http://www.java2novice.com/java-generics/two-type-parameters/#sthash.FfBk4fX8.dpuf

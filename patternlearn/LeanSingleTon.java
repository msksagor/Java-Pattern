
package patternlearn;

public class LeanSingleTon {
    private static LeanSingleTon object = null;
    private LeanSingleTon() {
    
    }
    
    public static LeanSingleTon getObjectValue(){
        if(object==null){
            object = new LeanSingleTon();
             }
           return object;
    }
    
    public void Display(){
        System.out.println("SingleTon Class");
    }
        

    public static void main(String[] args) {
        LeanSingleTon sagor = LeanSingleTon.getObjectValue();
        sagor.Display();
        
    }
    
}

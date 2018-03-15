package ejemplo;

public class HolaMundo {
  
    interface HolaBola {
        String operation(String s);   
    }
  
    public String operateHola(String s, HolaBola op) {
        return op.operation(s);
    }
 
    public static void main(String... args) {
    
        HolaMundo myApp = new HolaMundo();
        HolaBola hola = (s) -> "Hola " + s;
        System.out.println(myApp.operateHola("Miguel", hola));  
	System.out.println(myApp.operateHola("profe", hola));  
    }
}

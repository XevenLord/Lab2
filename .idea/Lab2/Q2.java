
package Lab2;

public class Q2 {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        strObj.setE("test");
        intObj.setE(123);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
        
    }
}

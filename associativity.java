//precedence in java
// Associativity in java

public class associativity {
    public static void main(String[] args)
    {

        //precedence
        int a=6*8-8*9%5/2;
        System.out.println(a); // 47

        //Associativity (left to right )

        int b=7/5-34*2;//
        System.out.println(b); //-67

        // quick quiz

        // (x-y/2)
        int x=6;
        int y=1;
        int k=x*y/2;
        System.out.println(k); // 3




    }
}

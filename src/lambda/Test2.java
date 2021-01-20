package lambda;

public class Test2 {
    static void def(I i){
        System.out.println("privet");
    }

    static void daf(I2 i)
    {
        System.out.println("daf");
    }
    public static void main(String[] args) {
        def((String str)->{return str.length();});
        daf((int a)->{return 10;});
    }
}

interface  I{
    int abc(String s);
}
interface I2{
    int a(int b);
}
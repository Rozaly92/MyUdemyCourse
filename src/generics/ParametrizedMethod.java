package generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        Number n= 10;
        Number b=3.3;
        Number c=5.5f;
        System.out.println(n+" "+b+" "+c);
        ArrayList<Integer> al1 =new ArrayList<>();
        al1.add(20);
        al1.add(10);
        al1.add(2);
        int a=GenMethod.getSecondElement(al1);
        System.out.println(a);
        ArrayList<String> al2 =new ArrayList<>();
        al2.add("abc");
        al2.add("def");
        al2.add("ghi");
        String u=GenMethod.getSecondElement(al2);
        System.out.println(u);
    }
}
class GenMethod
{
    public static <T> T getSecondElement(ArrayList<T> a1){
        return a1.get(1);
    }
}
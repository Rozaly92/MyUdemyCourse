package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("OK");
        list.add(5);
        list.add(new StringBuilder());
        list.add(new Car());

        for(Object o:list)
        {
            System.out.print(o + " ");
        }
        List<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        list2.add("JAva");
        for(String s:list2)
        {
            System.out.print(s + " ");
        }
    }
}
class Car{}

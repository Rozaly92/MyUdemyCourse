package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        X x=new Y();
        //List<X> list1 = new ArrayList<Y>();       //ne rabotaet potomu cto sovocupnosti
        // araylist parametra y ne iavleatsea podtipom lista s parametrom x
        List<X> list1 = new ArrayList<X>();
        List<Number> list =new ArrayList<>();
        list.add(1);
        list.add(3.13);
    }
}
class X{

}
class Y extends X{

}

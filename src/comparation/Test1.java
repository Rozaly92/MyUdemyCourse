package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Ivan");
        list.add("Zaur");
        list.add("Maria");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting \n"+ list);
    }
}

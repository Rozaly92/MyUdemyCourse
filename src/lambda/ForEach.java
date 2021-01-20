package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list =List.of("privet", "kak dela", "normalino"," poka");
        /*for(String s: list)
        {
            System.out.println(s);
        }*/
        list.forEach(str -> System.out.println(str));
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(15);
        list2.add(34);
        list2.add(24);
        list2.add(58);
        list2.forEach(element -> {
            System.out.println(element);
            element *= 2;
            System.out.println(element);
        });
    }
}

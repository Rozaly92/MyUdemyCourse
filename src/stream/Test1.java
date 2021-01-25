package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
      /*  List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Roza");
        list.add("from");
        list.add("Moldova");
        list.add("ok");
        list.add("paka");
        list.add("ciao");

        /*for(int i=0; i<list.size();i++)
        {
            list.set(i, String.valueOf(list.get(i).length()));
        }
        System.out.println(list);*/

      /* List<Integer> list2= list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int [] array={5, 55, 9, 8,45,66};
       for(int i : array)
           System.out.print(i + " ");
        array = Arrays.stream(array).map(el -> {
            if(el % 3 == 0)
            { el = el / 3;}
            return el;}).toArray();
        System.out.println();
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
        System.out.println(Arrays.toString(array));*/


        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Roza");
        set.add("from");
        set.add("Moldova");
        set.add("ok");
        set.add("paka");
        set.add("ciao");

        System.out.println(set);
        Set<Integer> set2 = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        List<Integer>list3 = set.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);


    }
}

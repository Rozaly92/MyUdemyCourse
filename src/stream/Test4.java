package stream;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(52);
        list.add(38);
        list.add(544);
        list.add(28);
        list.add(145);
        list.add(284);

        int result = list.stream().reduce((accumulator, element)-> accumulator * element).get();
        System.out.println(result);
    }
}

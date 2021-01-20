package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList<>();
        al.add("Hello");
        al.add("Paka");
        al.add("ucim java");
        al.add("lambdas");
        //al.removeIf(element-> element.length()<5);
        Predicate<String> p= element-> element.length()<5;
        al.removeIf(p);

        System.out.println(al);
    }
}

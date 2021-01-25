package stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String [] args)
    {
        int [] array = {5,6,4,8,9,8,55,78,14,58,74,};
        Arrays.stream(array).forEach(element->
        {element += 2;
            System.out.print(element + " ");
        });
        System.out.println();
        Arrays.stream(array).forEach(element-> System.out.print(element-2 + " "));
        Arrays.stream(array).forEach(System.out::println);  //metod reference
        Arrays.stream(array).forEach((Utils::method));
    }
}
class Utils{
    public static void method(int a) {
         a = a + 5;
        System.out.println("Element = "+ a);
    }
}
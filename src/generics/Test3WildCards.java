package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3WildCards {
    public static void main(String[] args) {
        // WILDCARD  <?>            - liuboi class
        //           <? extends X>  - class X ili liuboi ego suclass
        //           <? super Y>    - class Y ili liuboi ego superclass
       // List<Number> list1= new ArrayList<Integer>();  //ERROR
        List<?> list= new ArrayList<Integer>();   //znac <?> iavliaetsea supertipom dlia vtorogo parametra posle new
        List<Double> list2= new ArrayList<>();
        list2.add(3.34);
        list2.add(2.56);
        list2.add(54.65);
        showListInfo(list2);

        List<String> list3= new ArrayList<>();
        list3.add("privet");
        list3.add("poka");
        list3.add("hello");
        showListInfo(list3);

       /* //ERROR
       //compiliator ne znaet cacogo tipa dobavliaemii element
        List<?> list4= new ArrayList<String>();
        list4.add("privet");*/

        //BOUNDED WILDCARDS
        List<? extends Number> list5= new ArrayList<Integer>();
        //List<? extends Number> list6= new ArrayList<String>();  //ERROR String ne extends Number

        ArrayList<Double> list10= new ArrayList<>();
        list10.add(4.5);
        list10.add(34.7);
        list10.add(95.7);
        System.out.println(sum(list10));


        List<? super Number> list22= new ArrayList<Object>();
    }
    static void showListInfo(List<?> list)
    {
        System.out.println("moy list soderjit sleduiusie elementi: "+list);
    }
    public static double sum(ArrayList<? extends Number> a1){
        double summ=0;
        for(Number n: a1){
            summ+=n.doubleValue();
        }
        return summ;
    }
}

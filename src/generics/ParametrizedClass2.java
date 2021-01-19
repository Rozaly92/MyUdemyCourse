package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("privet",20);
        System.out.println("value1= "+ pair1.getFirstValue()+ " value2= "+pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(15,20.45);
        System.out.println("value1= "+ pair2.getFirstValue()+ " value2= "+pair2.getSecondValue());

        OtherPair<String> op= new OtherPair<>("hello java","hello friends");
        System.out.println("value1= "+ op.getFirstValue()+ " value2= "+op.getSecondValue());
    }
}
class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue(){
        return value1;
    }
    public V2 getSecondValue(){
        return value2;
    }
}
class OtherPair<V>{
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getFirstValue(){
        return value1;
    }
    public V getSecondValue(){
        return value2;
    }
    public /*<V>*/ V abc(V val){   /* esli class parametrizirovan to etot parametr <V> mojno ne pisati*/
        return val;
    }
}
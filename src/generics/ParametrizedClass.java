package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
       /*Info<String> info1= new Info<>("Privet");
        System.out.println(info1);
        Info<Integer> info2= new Info<>(20);
        System.out.println(info2);
        String s =info1.getValue();
        System.out.println(s);
        Integer i1=info2.getValue();
        System.out.println(i1);*/

        //etot uciastok koda ne poidet potomu cto v parametrizatii napisano extends number toliko number
        /*Info<Bus> info3= new Info(new Bus());
        System.out.println(info3);
        Bus b1= info3.getValue();
        System.out.println(b1);*/

    }

    // oba metoda ne mogut biti overload potomu cto jvm vidit ih bez parametrizatii toesti abc(Info info)
  /*  public void abc(Info<String> info)
    {
        String s= info.getValue();
    }
    public void abc(Info<Integer> info)
    {
        Integer i= info.getValue();
    }*/
}
/*class Info<T>
{
    private T value;
    public Info(T value)
    {
        this.value= value;
    }
    public String toString(){
        return "{["+value+"]}";
    }
    public T getValue(){
        return value;
    }
}*/

class Info<T extends Number &i1 &i2> //class Info<T extends Number> pisem esli nam nujen tolico number bolise nicego
{
    //citobi implimentirovati inteface v generics mi ispolizuem extends a potom &imia interfacesa
    //class vsegda doljen idti po poriadcu na pervom meste

    private T value;
    public Info(T value)
    {
        this.value= value;
    }
    public String toString(){
        return "{["+value+"]}";
    }
    public T getValue(){
        return value;
    }
}
interface i1{}
interface i2{}
//jvm ne pozvoliaet tac delati potomu cto pri subcastinge proizoidet osibka
//type erasure----subcasting.   toesti jvm ne vidit parametrizatii
//i cajdii raz vozvrasaetsea obievct cotorii subcastitsea c tipu ukaznnomu v parametrizatii

/*class Parent{
    public void abc(Info<String> info)
    {
        String s= info.getValue();
    }
}

class ChildCalss extends Parent{
    public void abc(Info<Integer> info)
    {
        Integer i= info.getValue();
    }
}*/
class Bus{

}
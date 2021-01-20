package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
   private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;

    }
    void method(){
        System.out.println(Engine.counOfObjects);
        Engine e=new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public static class Engine{
       private int horsePower;
        static int counOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
            counOfObjects++;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
        Car.Engine e=new Car.Engine(256);
        System.out.println(e);
        Car car=new Car("red",2, e);
        System.out.println(car);
        car.method();
    }
}
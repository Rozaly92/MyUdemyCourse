package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);

    }
    /*void method(){
        System.out.println(nested_classes.static_nested_class.Car.Engine.counOfObjects);
        nested_classes.static_nested_class.Car.Engine e=new nested_classes.static_nested_class.Car.Engine(200);
        System.out.println(e.horsePower);
    }*/

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public class Engine{
        private int horsePower;


        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test2{
    public static void main(String[] args) {
       Car car=new Car("black",4,300);
        System.out.println(car);
    }
}
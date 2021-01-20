package lambda;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSuplier){
        ArrayList<Car> al = new ArrayList<>();
        for(int i=0; i<3; i++)
        {
            al.add(carSuplier.get());
        }
        return al;
    }
    public static void changeCar(Car car, Consumer<Car> carConsumer)
    {
        carConsumer.accept(car);
    }
    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(()->new Car("nissan tiida", "red", 1.6));
        System.out.println("our cars "+ourCars);
        changeCar(ourCars.get(0),
                car -> {car.color="blue";
                car.engine=2.4;
                System.out.println("upgraded car: "+ car);
        });
        System.out.println("our cars "+ourCars);
    }
}
class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
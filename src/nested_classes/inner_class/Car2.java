package nested_classes.inner_class;


    public class Car2 {
        String color;
        int doorCount;
        Engine engine;

        public Car2(String color, int doorCount) {
            this.color = color;
            this.doorCount = doorCount;
        }
      public void setEngine(Engine engine){
            this.engine=engine;
      }
        @Override
        public String toString() {
            return "My Car{" +
                    "color='" + color + '\'' +
                    ", doorCount=" + doorCount +
                    ", engine=" + engine +
                    '}';
        }

        public class Engine {
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

    class Test{
        public static void main(String[] args) {


          Car2 car=new Car2("black",4);
          Car2.Engine engine= car.new Engine(150);
            System.out.println(engine);
            car.setEngine(engine);
            System.out.println(car);

          //  Car2.Engine engine2= new car.Engine(150);        //ERROR
            //tereatsea ssilka na masinu. toesti esti motor no neizvestno c cacoi masine on prinadlejit
            Car2.Engine engine3 = new Car2("yellow", 4).new Engine(200);
            System.out.println(engine3);
        }
    }



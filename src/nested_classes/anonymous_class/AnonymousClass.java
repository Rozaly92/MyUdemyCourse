package nested_classes.anonymous_class;

//anonimnie classi ne imeiut imeni
//odnovremennoe obiavlenie i sozdanie obiecta
//v anonimnih classah construcor ne sozdaetsea potomu cto
//dlia sozdania constructora nujno propisivati imia classa
//a u anonimnogo klassa imeni netu
//anonimnii klas mojet obrasiatsea daje c private elementam vnesnego klassa
//liamba expressions eto kratkaia forma dlia napisania anonimnih klassov
//poniatia anonimnih interfacov ne sushestvuet

public class AnonymousClass {
    private int x=5;
    public static void main(String[] args) {
        Math m = new Math(){
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac =new AnonymousClass();
                return a + b + ac.x;
            }
        };

        Math m2 = new Math(){
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m.doOperation(3, 6));
        System.out.println(m2.doOperation(3, 6));
    }
}

interface  Math{
    int doOperation(int a, int b);
}
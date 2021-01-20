package nested_classes.loca_inner_class;
//localinie inner klasi nahodiatsea v cacomto bloke koda takih cac metod ili construcor
// oni ne dostupni iz vne
//ne mojet biti static
//mojet obrasiatsia c private elementam vnesnego klassa
//local inner class mojet obrasiatisea k elementam bloka v cotorom-
//on napisan pri uslovii cto oni final ili effectively final


public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}
class Math{
    private int a=10;
    public void getResult(){
        //v dannom sluciae u nas localinii clas v metode

         final int delimoe =21;
        class Delenie{

            private int deliteli;

           /* public int getDelimoe() {
                return delimoe;
            }*/

            public int getDeliteli() {
                return deliteli;
            }

          /*  public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }*/

            public void setDeliteli(int deliteli) {
                this.deliteli = deliteli;
            }

            public int getChastnoe(){
                return delimoe / deliteli;
            }
            public int getOstatok(){
                System.out.println("a = " + a );
                return delimoe % deliteli;
            }
        }

        Delenie d =new Delenie();
       // d.setDelimoe(21);
        d.setDeliteli(4);
        System.out.println("Delimoe = "  + delimoe);
        System.out.println("Deliteli = " + d.getDeliteli());
        System.out.println("Chastnoe = " + d.getChastnoe());
        System.out.println("Ostatok = "  + d.getOstatok());
    }
}

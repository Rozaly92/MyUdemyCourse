package generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar sc1= new Schoolar("Emil",10);
        Schoolar sc2 = new Schoolar("Maxim", 5);
        Student s1 =new Student("Nicolai", 20);
        Student s2 =new Student("elvirA",34);
        Employee emp1=new Employee("Roza",28);
        Employee emp2= new Employee("Ivan", 32);

        Schoolar sc3= new Schoolar("Diana",12);
        Schoolar sc4 = new Schoolar("Olia", 23);
        Student s3 =new Student("Ana", 22);
        Student s4 =new Student("Snejana",34);
        Employee emp3=new Employee("Lora",13);
        Employee emp4= new Employee("Ina", 24);
        Team<Schoolar> schoolarTeam= new Team<>("Draconi");
        schoolarTeam.addNewParticipant(sc1);
        schoolarTeam.addNewParticipant(sc2);

        Team<Student> studTeam= new Team<>("Vpered");
        studTeam.addNewParticipant(s1);
        studTeam.addNewParticipant(s2);

        Team<Employee> empTeam= new Team<>("Rabotiagi");
        empTeam.addNewParticipant(emp1);
        empTeam.addNewParticipant(emp2);

        Team<Schoolar> schoolarTeam2= new Team<>("Mudreti");
        schoolarTeam2.addNewParticipant(sc3);
        schoolarTeam2.addNewParticipant(sc4);

        Team<Student> studTeam2= new Team<>("GoGoGo");
        studTeam2.addNewParticipant(s3);
        studTeam2.addNewParticipant(s4);

        Team<Employee> empTeam2= new Team<>("Just do it");
        empTeam2.addNewParticipant(emp3);
        empTeam2.addNewParticipant(emp4);

        schoolarTeam.playwith(schoolarTeam2);
        studTeam.playwith(studTeam2);
        empTeam.playwith(empTeam2);
    }
}

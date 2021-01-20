package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {
    private static double avgOfSmth( List<Student> list, Function<Student, Double> f){
       double result = 0;
       for(Student st : list)
       {
           result += f.apply(st);
       }
       result = result / list.size();
       return result;
    }
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nicolai", 'm', 28, 3, 7.3);
        Student st3 = new Student("Elena", 'f', 19, 1, 9.4);
        Student st4 = new Student("Petr", 'm', 21, 2, 6.8);
        Student st5 = new Student("Maria", 'f', 24, 4, 10.0);

        ArrayList<Student> Students = new ArrayList<>();
        Students.add(st1);
        Students.add(st2);
        Students.add(st3);
        Students.add(st4);
        Students.add(st5);
       /* Collections.sort(Students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course-o2.course;
            }
        });*/
        Function<Student, Double> f= stud -> 3.14;
        double res = avgOfSmth(Students, stud -> stud.avgGrade);
        System.out.println(res);

        Collections.sort(Students, ( stud1, stud2) -> stud1.age -stud2.age);
        System.out.println(Students);

        StudentInfo st =new StudentInfo();
       // st.printStudentOverGrade(Students ,8);
      //  System.out.println("----------------------------------------------------");
      //  st.printStudentUnderAge(Students, 22);
        //System.out.println("----------------------------------------------------");
       // st.printStudentMixConditions(Students, 22, 8, 'm');

        st.testStudents(Students, new CheckOverGrade());
        System.out.println("----------------------------------------");
        st.testStudents(Students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("----------------------------------------");
        st.testStudents(Students, (Student s)-> { return s.age < 30;});
        System.out.println("----------------------------------------");
        st.testStudents(Students, (Student s)-> { return s.age < 30;});
        System.out.println("----------------------------------------");
        st.testStudents(Students, (Student s)-> { return s.avgGrade > 8;});
        System.out.println("----------------------------------------");
        st.testStudents(Students, (Student s)-> {
            return s.age > 20 && s.avgGrade > 8 && s.sex=='f';
        });
        System.out.println("----------------------------------------");
        //samii corotkii variant napisania liambda virajenia
        st.testStudents(Students, s -> s.age < 30);

        System.out.println("----------------------------------------");
        StudentChecks sc = (Student s)-> { return s.avgGrade > 8;};
        st.testStudents(Students, sc);
        System.out.println("----------------------------------------");
        st.testStudents2(Students, (Student s)-> { return s.avgGrade < 8;});

        System.out.println("----------------------------------------");
        //obiedinenie dvuh proverok
        Predicate<Student> p1= student -> student.avgGrade > 7.5;
        Predicate<Student> p2= student -> student.age > 20;
        st.testStudents2(Students, p1.and(p2));
       // st.testStudents2(Students, p1.or(p2));
        st.testStudents2(Students, p1.negate());     //otritanie
    }
   /* void printStudentOverGrade(ArrayList<Student> al, double grade)
    {
        for(Student s : al)
        {
            if(s.avgGrade > grade)
            {
                System.out.println(s);
            }
        }
    }
    void printStudentUnderAge(ArrayList<Student> al, int age)
    {
        for(Student s : al)
        {
            if(s.age < age)
            {
                System.out.println(s);
            }
        }
    }
    void printStudentMixConditions(ArrayList<Student> al, int age, double grade, char sex)
    {
        for(Student s : al)
        {
            if(s.avgGrade < grade && s.age > age && s.sex==sex)
            {
                System.out.println(s);
            }
        }
    }*/

    //functionalinii interfeis- soderjit odin abstractnii metod
    interface  StudentChecks{
        boolean check(Student s);
    }

    void testStudents(ArrayList<Student> al, StudentChecks sc)
    {
        for(Student s : al)
        {
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }
    static class CheckOverGrade implements  StudentChecks{
        @Override
        public boolean check(Student s) {
            return s.avgGrade > 8;
        }
    }
    void testStudents2(ArrayList<Student> al, Predicate<Student> pr)
    {
        for(Student s : al)
        {
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }
}

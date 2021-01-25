package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args)
    {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nicolai", 'm', 28, 3, 7.3);
        Student st3 = new Student("Elena", 'f', 19, 1, 9.4);
        Student st4 = new Student("Petr", 'm', 21, 2, 6.8);
        Student st5 = new Student("Maria", 'f', 24, 4, 10.0);

        List<Student> Students = new ArrayList<>();
        Students.add(st1);
        Students.add(st2);
        Students.add(st3);
        Students.add(st4);
        Students.add(st5);

       /*List<Student> ss = Students.stream().filter(element
                -> element.getAge()>22 && element.getAvgGrade()>7.2 ).collect(Collectors.toList());
        System.out.println(ss);*/

        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
          myStream.filter(el-> el.getAge()>20).collect(Collectors.toList());
    }

}
class Student {
    private  String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

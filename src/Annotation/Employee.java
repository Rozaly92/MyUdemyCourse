package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@MyAnnotation
public class Employee {
   // @MyAnnotation
    String name;
    double salary;

   // @MyAnnotation
    public Employee(String name,/*@MyAnnotation */double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
    public void increaseSalary()
    {
        salary*=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
@Target({ElementType.TYPE, ElementType.METHOD})  //parametr anotatii ucazivaet c cemu mojno primeniati etu annotatiu

    //annotatia @retention opisivaet jiznenii ticl annotatii
    @Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{

}
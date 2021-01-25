package Annotation;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
       Class xiaomiClass= Class.forName("Annotation.Xiaomi");
     Annotation an = xiaomiClass.getAnnotation(SmartPhone.class);
     SmartPhone sm1 = (SmartPhone) an;
        System.out.println("Annotation info from xiaomi class: "+ sm1.OS()+", "+sm1.yearOfCompanyCreation());

        Class iphoneClass= Class.forName("Annotation.Iphone");
        Annotation an2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) an2;
        System.out.println("Annotation info from iphone class: "+ sm2.OS()+", "+sm2.yearOfCompanyCreation());
    }
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi{
    String mode;
    double price;
}
@SmartPhone(OS="IOS", yearOfCompanyCreation = 1967)
class Iphone{
    String mode;
    double price;
}
package  Main;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Employee e = new Employee("Ryan","Qpd","Programmer","Mars","Male",21);
        Employee e1 = new Employee("Arlene","Qpd","Programmer");
        Employee e2 = new Employee();

        System.out.println(e2.firstName);
    }
}
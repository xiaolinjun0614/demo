package a.b.c.test;

import a.b.c.entity.Person;
import a.b.c.entity.S1;
import a.b.c.entity.Student;
import a.b.c.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        test1 t1 = new test1();
        List<Teacher> list = new ArrayList<>();
        //list.add(new Teacher(1,"小明"));
        //list.add(new Student(1,"小明"));
        list.add(new S1(1,"asd"));
        list.add(new Teacher(1,"asd"));
        t1.method1(list);
        //t1.method2(list);


    }
}

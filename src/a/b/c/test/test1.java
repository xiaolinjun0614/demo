package a.b.c.test;

import a.b.c.entity.Person;
import a.b.c.entity.S1;
import a.b.c.entity.Student;
import a.b.c.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class test1  {
   public <T> void method1(List<T> list){
       for (Object object : list) {
           System.out.println(object.toString());
       }
   }

    public void method2(List<? extends Student> list){
        for (Object object : list) {
            System.out.println(object);
        }
    }


}

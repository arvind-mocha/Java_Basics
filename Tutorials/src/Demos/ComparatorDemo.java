package Demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
    int age;
    int rollno;
    String name;

    public Stud(int age,String name,int rollno){
         this.age = age;
         this.rollno = rollno;
         this.name = name;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "age=" + age +
                ", rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stud o) {
        return age>o.age?1:-1;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(22,"Arvind",11));
        studs.add(new Stud(21,"Mani",10));
        studs.add(new Stud(30,"Safi",8));
        studs.add(new Stud(20,"Vinoth",13));
        studs.add(new Stud(19,"Chandru",21));

        Collections.sort(studs);

        for(Object O:studs){
            System.out.println(O);
        }
    }
}

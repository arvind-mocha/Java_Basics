package Demos;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // <> Generics are used to metion the datatype inside the collection  or set or list ect
        // <> if generics are not provided any datatype can be stored inside a collection
        // Collection don't have index numbers

        System.out.println("Collections");
        Collection <Number> values = new ArrayList();
        values.add(4.3); // these values passed are Integer class not int datatype
        values.add(2.2f);
        values.add(9.4);

        Iterator it = values.iterator();
        for(int i=0;i < values.size();i++) {
            System.out.println(it.next());
        }
        System.out.println();

        // List Has Index Numbers
        System.out.println("List");
        List <Integer> val = new ArrayList();
        val.add(34);
        val.add(13);
        val.add(4);
        val.add(2,22);
        for(int i=0;i<val.size();i++){
            System.out.println(val.get(i));
        }

        // Comparator <Integer> c = (i,j) -> i%10>j%10 ? 1:-1; // Sorting based on last digit

        Collections.sort(val,(i,j)->i%10>j%10 ? 1:-1); // Collection Sorting with our own logic using Comparator
        //  Each values is a object we can use for each loop like this
        for(Object o:val){
            System.out.println(o);
        }

    }
}

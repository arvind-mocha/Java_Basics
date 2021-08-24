package Datastructures;

import java.util.*;

class hashing {
    private LinkedList list[] = new LinkedList[10];

    public hashing() {
        for (int i = 0; i < 10; i++) {
            list[i] = new LinkedList();
        }
    }

    public int hashcode(int val) {
        return val % 10;
    }

    public void gethashMap() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(" [ " + i + " ] ");
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print(list[i].get(j) + " --> ");
            }
            System.out.println();
        }
    }

    public void addval(int val) {
        int hashval = hashcode(val);
        if (list[hashval].size() == 0) {
            list[hashval].addFirst(val);
        } else {
            for (int i = 0; i < list[hashval].size(); i++) {
                if ((int) list[hashval].get(i) > val) {
                    try {
                        list[hashval].add(i - 1, val);
                    } catch (Exception e) {
                        list[hashval].addFirst(val);
                    }
                    return;
                }
            }
            list[hashval].addLast(val);
        }
    }

    public void Delete(int val){
        int hashval = hashcode(val);

        for (int i = 0; i < list[hashval].size(); i++) {
            if((int)list[hashval].get(i) == val){
                list[hashval].remove(i);
                System.out.println("Deleted the element" + val);
                return;
            }
        }

        System.out.println("The Element to be deleted Not Found");
    }

    public String search(int val){
        int hashval = hashcode(val);

        for (int i = 0; i < list[hashval].size(); i++) {
            if((int)list[hashval].get(i) == val){
                return "Found";
            }
        }

        return "Not Found";
    }
}

public class HashingLinkedList {
    public static void main(String[] args) {
        hashing h = new hashing();

        h.addval(10);
        h.addval(13);
        h.addval(23);
        h.addval(3);
        h.addval(30);
        h.addval(22);
        h.addval(99);
        h.addval(102);
        h.addval(88);
        h.addval(76);
        h.addval(56);
        h.addval(46);
        h.Delete(1000);
        System.out.println("The element 10: " + h.search(10));
        h.gethashMap();
    }
}


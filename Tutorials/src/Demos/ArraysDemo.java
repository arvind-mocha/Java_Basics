package Demos;

class Calc{
    // ... refers that we can pass n number of values which is converted into an array
    public int add(int ... i){
        int sum = 0;
        for(int k: i){
            sum += k;
        }
        return sum;
    }
}

public class ArraysDemo {
    public static void main(String[] args) {
        int a[] = new int[4];
        int b[] = {1,2,3,4};
        int c[] = {5,6,7};
        int d[][] = {a,b,c,a};

        a[0] = 1;
        a[1] = 2;
        a[3] = 3;

//        for(int i=0;i < d.length;i++){
//            for(int j=0;j<d[i].length;j++){
//                System.out.print(" " + d[i][j]);
//            }
//            System.out.println();
//        }

//        For Each Loop
//        for(int k : a){
//            System.out.print(" " + k);
//        }

        for(int k[] : d){
            for(int l : k){
                System.out.print(" " + l);
            }
            System.out.println();
        }

        Calc obj = new Calc();
        System.out.print(obj.add(1,2,3,4,5,2,4,1));
    }
}

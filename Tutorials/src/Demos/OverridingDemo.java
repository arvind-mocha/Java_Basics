package Demos;

class AA{
    int i;

    public void show(){
        System.out.println("In AA " + i);
    }
}

class BB extends AA{


    @Override   // Used to avoid spelling mistakes if we are trying to purposely override the method
    public void show() {
        super.show();
        super.i = 8;
        System.out.println("In BB " + i);
    }

}

public class OverridingDemo {
    public static void main(String[] args) {
        BB obj = new BB();
        obj.show();
    }
}

interface Transpot{
    void deliver();
}

abstract class Animal{
    abstract public void animalName();
}

class  Camel extends Animal implements Transpot{
    public void deliver(){
        System.out.println("Camel Delivered.....");
    }

    public void animalName(){
        System.out.println("I am Camel");
    }
}
class  Donkey extends Animal implements Transpot{
    public void deliver(){
        System.out.println("Donkey Delivered.....");
    }

    public void animalName(){
        System.out.println("I am Donkey");
    }
}
class  Tiger extends Animal {
    public void animalName(){
        System.out.println("I am Tiger");
    }
}
class  Deer extends Animal{
    public void animalName(){
        System.out.println("I am Deer");
    }
}

public class TranspotDemo {
    public static void main(String[] args) {
        Animal[] a = new Animal[4];
        a[0] = new Camel();
        a[1] = new Donkey();
        a[2] = new Deer();
        a[3] = new Tiger();
        System.out.println("==========================================");
        a[0].animalName();
        ((Transpot) a[0]).deliver();
        System.out.println("==========================================");
        a[1].animalName();
        ((Transpot) a[1]).deliver();
        System.out.println("==========================================");
        a[2].animalName();
        System.out.println("==========================================");
        a[3].animalName();
    }
}
